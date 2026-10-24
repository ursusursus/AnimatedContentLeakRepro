#!/usr/bin/env bash
set -euo pipefail

root_dir="$(cd -- "$(dirname -- "${BASH_SOURCE[0]}")" && pwd)"
version='4.0.0-beta.41'
checksum='88e2403bffbbded87994e4beca3c0ef677cc1af8d7a1925b18ff64c64b0e071c'
jar_path="$root_dir/.cache/wiremock-standalone-$version.jar"

command -v java >/dev/null || { echo 'Java 17+ is required.' >&2; exit 1; }
if command -v sha256sum >/dev/null; then
    checksum_command=(sha256sum)
elif command -v shasum >/dev/null; then
    checksum_command=(shasum -a 256)
else
    echo 'sha256sum or shasum is required.' >&2
    exit 1
fi

if [[ ! -f "$jar_path" ]]; then
    command -v curl >/dev/null || { echo 'curl is required for the first download.' >&2; exit 1; }
    mkdir -p "$root_dir/.cache"
    download_path="$(mktemp "$jar_path.XXXXXX")"
    trap 'rm -f -- "$download_path"' EXIT
    curl --fail --location --show-error --retry 3 --connect-timeout 15 --max-time 180 \
        "https://repo.maven.apache.org/maven2/org/wiremock/wiremock-standalone/$version/wiremock-standalone-$version.jar" \
        --output "$download_path"
    printf '%s  %s\n' "$checksum" "$download_path" | "${checksum_command[@]}" --check --status
    mv -- "$download_path" "$jar_path"
    trap - EXIT
fi

printf '%s  %s\n' "$checksum" "$jar_path" | "${checksum_command[@]}" --check --status || {
    echo "Checksum mismatch. Remove $jar_path and retry." >&2
    exit 1
}

exec java -jar "$jar_path" \
    --root-dir "$root_dir" \
    --bind-address 127.0.0.1 \
    --port "${PORT:-8080}" \
    "$@"
