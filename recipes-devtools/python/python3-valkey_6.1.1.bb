
SUMMARY = "Valkey Pyhtoon interface"
HOMEPAGE = "https://github.com/valkey-io/valkey-py"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=dc0a2eb1c9e4ca544bd4a04dd072df90"

SRC_URI[md5sum] = "1a0da117641cafc688a9ed4eb400ba6a"
SRC_URI[sha256sum] = "5880792990c6c2b5eb604a5ed5f98f300880b6dd92d123819b66ed54bb259731"

RDEPENDS:${PN} = "valkey"

inherit pypi setuptools3


