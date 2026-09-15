
SUMMARY = "The lightning-fast ASGI server."
HOMEPAGE = "None"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a7c0106595ad7af737fe39d5a8124add"

SRC_URI[md5sum] = "49ac2c11e0ab1b82379faf2ebb87ad77"
SRC_URI[sha256sum] = "2d5a14a1ab217f8693184ebaa1fe03838edcbc70b4f76572721c0b33058cd023"

RDEPENDS:${PN} = "python3-rq valkey"


inherit pypi setuptools3

