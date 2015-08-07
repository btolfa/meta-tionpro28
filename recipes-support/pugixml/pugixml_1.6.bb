SUMMARY = "Light-weight, simple and fast XML parser for C++ with XPath support"
HOMEPAGE = "http://pugixml.org"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://${WORKDIR}/git/README.md;beginline=21;md5=b339f086b8738febdd0d31453f927ba9"

SRC_URI = "git://github.com/zeux/pugixml.git;tag=v${PV}"

S = "${WORKDIR}/git/scripts"

inherit cmake

FILES_${PN}-dev = "${libdir}/cmake/pugixml ${includedir}"
