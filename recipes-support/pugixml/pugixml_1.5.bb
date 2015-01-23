SUMMARY = "Light-weight, simple and fast XML parser for C++ with XPath support"
HOMEPAGE = "http://pugixml.org"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://${WORKDIR}/git/README.md;beginline=21;md5=1defd58dab151418c39c939de74c542e"

SRC_URI = "git://github.com/zeux/pugixml.git"
SRCREV = "ff16dbdd4c63fa46cc1f38eda4cfb66f38047657"


S = "${WORKDIR}/git/scripts"

inherit cmake
