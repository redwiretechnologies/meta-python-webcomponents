
SUMMARY = "The little ASGI library that shines."
HOMEPAGE = "None"
AUTHOR = "None <Tom Christie <tom@tomchristie.com>>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=11e8c8dbfd5fa373c703de492140ff7a"

SRC_URI[sha256sum] = "2cbcba2a75806f8a41c722141486f37c28e30a0921c5f6fe4346cb0dcee1302f"

DEPENDS += "python3-poetry-core python3-hatchling"
RDEPENDS:${PN} += "python3-anyio"


inherit pypi python_hatchling

BBCLASSEXTEND = "native"
RDEPENDS:${PN}_class-native = ""

