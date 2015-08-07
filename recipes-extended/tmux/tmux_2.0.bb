SUMMARY = "Terminal multiplexer"
HOMEPAGE = "http://tmux.sourceforge.net"
SECTION = "console/utils"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://tmux.c;beginline=3;endline=17;md5=8685b4455330a940fab1ff451aa941a0"

DEPENDS = "ncurses libevent"

SRC_URI = "git://github.com/tmux/tmux.git;protocol=git;tag=${PV}"
S = "${WORKDIR}/git"

inherit autotools pkgconfig

do_configure_prepend () {
    sed -i -e 's:-I/usr/local/include::' ${S}/Makefile.am || bb_fatal "sed failed"
}
