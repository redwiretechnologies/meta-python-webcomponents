
SUMMARY = "RQ (Redis Queue) is a simple Python library for queueing jobs and processing them in the background with workers. It is backed by Redis or Valkey"
HOMEPAGE = "https://github.com/rq/rq"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9ed54c598ae6852cfb10522f48e55862"

SRC_URI[md5sum] = "55e72bfae6317988c13c33e719e1eca4"
SRC_URI[sha256sum] = "92ad55676cda14512c4eea5782f398a102dc3af108bea197c868c4c50c5d3e81"

RDEPENDS:${PN} = "python3-click python3-h11 valkey"

inherit python_hatchling pypi

