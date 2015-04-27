SUMMARY = "Light-weight, simple and fast XML parser for C++ with XPath support"
HOMEPAGE = "http://pugixml.org"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://${WORKDIR}/git/README.md;beginline=21;md5=b339f086b8738febdd0d31453f927ba9"

SRC_URI = "git://github.com/zeux/pugixml.git"
SRCREV = "9b8553bf4bd6f66048f63942a9ff9742b0b23355"


S = "${WORKDIR}/git/scripts"

inherit cmake

FILES_${PN}-dev = "${libdir}/cmake/pugixml ${includedir}"
