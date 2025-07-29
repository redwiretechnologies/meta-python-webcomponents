
SUMMARY = "FastAPI framework, high performance, easy to learn, fast to code, ready for production"
HOMEPAGE = "None"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=95792ff3fe8e11aa49ceb247e66e4810"

SRC_URI[md5sum] = "bdb2a56a2a464ff29736d4b1c55d547c"
SRC_URI[sha256sum] = "b1de15cdc1c499a4da47914db35d0e4ef8f1ce62b624e94e0e5824421df99739"

DEPENDS = "python3-pdm-backend-native python3-pdm-native"
RDEPENDS:${PN} = "\
    python3-starlette \
    python3-pydantic \
    python3-typing-extensions \
    python3-uvicorn \
"

inherit  python_setuptools_build_meta pypi 
