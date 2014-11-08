SUMMARY = "This C++ binding for 0mq/zmq is a 'high-level' library that hides most of the c-style interface core 0mq provides."
HOMEPAGE = "https://github.com/zeromq/zmqpp"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=f7b40df666d41e6508d03e1c207d498f"

DEPENDS = "zeromq"

SRCREV = "18c4e5ff2fdbdae214adeddb9607c34ce7986798"
SRC_URI = "git://github.com/zeromq/zmqpp.git;branch=develop\
    file://0001-Fix-Makefile.patch"

S = "${WORKDIR}/git"

inherit autotools
