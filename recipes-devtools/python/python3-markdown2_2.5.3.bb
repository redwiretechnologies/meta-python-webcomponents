
SUMMARY = "A fast and complete Python implementation of Markdown"
HOMEPAGE = "https://github.com/trentm/python-markdown2"
AUTHOR = "markdown2"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=0ad015e3507344d0963fc15585661b1b"

SRC_URI[sha256sum] = "4d502953a4633408b0ab3ec503c5d6984d1b14307e32b325ec7d16ea57524895"

DEPENDS += "python3-setuptools"
#RDEPENDS:${PN} += "python3-anyio"


inherit setuptools3 pypi


