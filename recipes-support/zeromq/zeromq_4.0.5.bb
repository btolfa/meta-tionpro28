SUMMARY = "ØMQ (also spelled ZeroMQ, 0MQ or ZMQ) is a high-performance asynchronous messaging library aimed at use in scalable distributed or concurrent applications. It provides a message queue, but unlike message-oriented middleware, a ØMQ system can run without a dedicated message broker. The library is designed to have a familiar socket-style API."
HOMEPAGE = "http://zeromq.org"
LICENSE = "LGPLv3+"

LIC_FILES_CHKSUM = "file://COPYING.LESSER;md5=d5311495d952062e0e4fbba39cbf3de1"

SRCREV = "7f849b844b0fdd3fb4d458734175043948de8ad7"
SRC_URI = "git://github.com/zeromq/libzmq.git"

S = "${WORKDIR}/git"

inherit autotools
