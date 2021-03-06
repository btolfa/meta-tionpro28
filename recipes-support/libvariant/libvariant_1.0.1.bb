SUMMARY = "Json Schema Draft 4 Validator"
HOMEPAGE = "http://bitbucket.org/gallen/libvariant"
LICENSE = "LGPL-2.0"

SRCNAME = "default"

LIC_FILES_CHKSUM = "file://${WORKDIR}/${SRCNAME}/LICENSE;md5=7f19a5dc384316c0c61e7b51e048c052"

SRCREV = "055488b"
SRC_URI = "hg://bitbucket.org/gallen/libvariant;module=${SRCNAME};rev=${SRCREV}"


S = "${WORKDIR}/${SRCNAME}"

inherit cmake

EXTRA_OECMAKE = " -DLIBVARIANT_BUILD_WALL=OFF -DLIBVARIANT_BUILD_DEBUG=OFF -DLIBVARIANT_BUILD_TESTS=OFF -DLIBVARIANT_BUILD_EXAMPLES=OFF -DLIBVARIANT_BUILD_PROFILE=OFF -DLIBVARIANT_ENABLE_YAML=OFF -DLIBVARIANT_ENABLE_XML=OFF -DLIBVARIANT_ENABLE_MSGPACK=OFF -DLIBVARIANT_ENABLE_CURL=OFF "

FILES_${PN}-dev = "${libdir}/cmake/LibVariant ${libdir}/pkgconfig ${includedir}"
