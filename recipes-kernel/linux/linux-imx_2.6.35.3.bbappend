FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://0001-Supporting-Tion-Pro28.patch"
SRC_URI += "file://0002-flexcan-Fix-CAN_RAW_RECV_OWN_MSGS-and-CAN_RAW_LOOPBA.patch"
SRC_URI += "file://defconfig"
