#!/bin/sh
set -e
exists() {
  command -v "$1" >/dev/null 2>&1
}

deadlink_check() {
  if ! exists mlc; then
    echo 'Installing mlc'
    curl -L https://github.com/becheran/mlc/releases/download/v0.14.1/mlc-x86_64-linux -o mlc
    chmod 755 ./mlc
  fi
  # At local we might need to exclude _site folder and node_modules folder
  # mlc --ignore-links "mailto*" "https://classroom*" "*.md" "*.md#*"  --ignore-path "node_modules" "_site"
  ./mlc --ignore-links "mailto*" "https://classroom*"
}

deadlink_check
