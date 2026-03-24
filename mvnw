#!/bin/sh
# Maven Wrapper script for Unix/macOS/Linux
# Downloads Maven if not present, then runs it

set -e

MAVEN_HOME="$HOME/.m2/wrapper/dists/apache-maven-3.9.6"
MAVEN_CMD="$MAVEN_HOME/bin/mvn"

if [ ! -f "$MAVEN_CMD" ]; then
    echo "Downloading Maven 3.9.6..."
    mkdir -p "$MAVEN_HOME"
    TMPFILE=$(mktemp)
    curl -fsSL "https://repo.maven.apache.org/maven2/org/apache/maven/apache-maven/3.9.6/apache-maven-3.9.6-bin.tar.gz" -o "$TMPFILE"
    tar xzf "$TMPFILE" -C "$MAVEN_HOME" --strip-components=1
    rm -f "$TMPFILE"
    echo "Maven 3.9.6 installed."
fi

exec "$MAVEN_CMD" "$@"
