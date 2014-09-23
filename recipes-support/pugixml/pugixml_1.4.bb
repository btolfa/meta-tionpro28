SUMMARY = "Light-weight, simple and fast XML parser for C++ with XPath support"
HOMEPAGE = "http://pugixml.org"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://${WORKDIR}/git/README.md;beginline=21;md5=1defd58dab151418c39c939de74c542e"

SRC_URI = "git://github.com/zeux/pugixml.git"
SRCREV = "9f92eeba44cdf9df5faae0b03cc5bfb445793348"


S = "${WORKDIR}/git/scripts"

inherit cmake
