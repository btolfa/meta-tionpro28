# This file was derived from the linux-yocto-custom.bb recipe in
# oe-core.
#
# linux-yocto-custom.bb:
#
#   A yocto-bsp-generated kernel recipe that uses the linux-yocto and
#   oe-core kernel classes to apply a subset of yocto kernel
#   management to git managed kernel repositories.
#
# Warning:
#
#   Building this kernel without providing a defconfig or BSP
#   configuration will result in build or boot errors. This is not a
#   bug.
#
# Notes:
#
#   patches: patches can be merged into to the source git tree itself,
#            added via the SRC_URI, or controlled via a BSP
#            configuration.
#
#   example configuration addition:
#            SRC_URI += "file://smp.cfg"
#   example patch addition:
#            SRC_URI += "file://0001-linux-version-tweak.patch
#   example feature addition:
#            SRC_URI += "file://feature.scc"
#

inherit kernel
require recipes-kernel/linux/linux-yocto.inc

SRC_URI = "git://github.com/btolfa/kernel_tion_pro28.git;protocol=git;bareclone=1"

SRC_URI += "file://defconfig"

SRC_URI += "file://tionpro28.scc \
            file://tionpro28.cfg \
            file://tionpro28-user-config.cfg \
            file://tionpro28-user-patches.scc \
           "


LINUX_VERSION ?= "2.6.35.3"
LINUX_VERSION_EXTENSION ?= "-zaozeo"

SRCREV="${AUTOREV}"

PR = "r0"
PV = "${LINUX_VERSION}+git${SRCPV}"

COMPATIBLE_MACHINE_tionpro28 = "tionpro28"


KERNEL_EXTRA_ARGS += "LOADADDR=${UBOOT_ENTRYPOINT}"
