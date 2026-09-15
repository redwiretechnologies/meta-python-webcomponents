
SUMMARY = "typing-inspection provides tools to inspect type annotations at runtime."
HOMEPAGE = "https://github.com/pydantic/typing-inspection"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=dfe2d84c58973d6a532c4e7638dbb3d8"

SRC_URI += "file://0001-fix-for-builidng-with-older-build.patch"
SRC_URI[md5sum] = "d451e03d8eac368f7af674f95db586f0"
SRC_URI[sha256sum] = "6ae134cc0203c33377d43188d4064e9b357dba58cff3185f22924610e70a9d28"

# The name on PyPi is slightly different.
PYPI_PACKAGE = "typing_inspection"
UPSTREAM_CHECK_PYPI_PACKAGE = "${PYPI_PACKAGE}"


RDEPENDS:${PN} = "python3-typing-extensions"

inherit python_hatchling pypi

do_compile:prepend() {
    export PYTHONPATH=src
}

BBCLASSEXTEND = "native nativesdk"
