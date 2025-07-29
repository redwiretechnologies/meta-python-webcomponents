
SUMMARY = "A simple module to extract html/script/style from a vuejs '.vue' file (can minimize/es2015 compliant js) ... just py2 or py3, NO nodejs !."
HOMEPAGE = "https://github.com/manatlan/vbuild"
AUTHOR = "manatlan"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=39080bafd1cbbfc85588df8aa810ca61"

SRC_URI += "file://0001-fix-to-use-PEP-517-poetry-core.patch"
SRC_URI[sha256sum] = "270cd9078349d907dfae6c0e6364a5a5e74cb86183bb5093613f12a18b435fa9"

DEPENDS += "python3-poetry-core"
#RDEPENDS:${PN} += "python3-anyio"


inherit python_poetry_core pypi


