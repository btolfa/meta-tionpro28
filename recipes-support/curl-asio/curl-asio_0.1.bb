SUMMARY = "This library makes use of libcurl's multi interface in order to enable easy integration into Boost.Asio applications."
HOMEPAGE = "https://github.com/btolfa/curl-asio"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://${WORKDIR}/git/COPYING;md5=6d1521564502ef112fbf069b87d54f0d"

SRCREV = "c21ca5386758e34bd94a8a2437091214af936f57"
SRC_URI = "git://github.com/btolfa/curl-asio.git"

S = "${WORKDIR}/git"

DEPENDS="asio boost curl"
PV = "0.1+git${SRCPV}"

inherit cmake

EXTRA_OECMAKE = " -DBUILD_STATIC=ON -DBUILD_EXAMPLES=OFF -DENABLE_CPP11=ON -DINSTALL_CMAKE_MODULES=OFF "

FILES_${PN}-dev = "${includedir}"
