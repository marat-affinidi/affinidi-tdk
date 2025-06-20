#!/usr/bin/env bash
set -euo pipefail

# Resolve the directory of this script
SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"

# Set TDK root to be 3 levels up from this script location
TDK_ROOT="$(cd "$SCRIPT_DIR/../../../" && pwd)"

# Install Python clients in editable mode using uv
uv pip install -e "$TDK_ROOT/clients/python/credential_issuance_client"
uv pip install -e "$TDK_ROOT/clients/python/credential_verification_client"
uv pip install -e "$TDK_ROOT/clients/python/iam_client"
uv pip install -e "$TDK_ROOT/clients/python/iota_client"
uv pip install -e "$TDK_ROOT/clients/python/login_configuration_client"
uv pip install -e "$TDK_ROOT/clients/python/wallets_client"
