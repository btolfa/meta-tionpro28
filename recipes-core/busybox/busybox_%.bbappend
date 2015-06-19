FILESEXTRAPATHS_append := "${THISDIR}/files:"
SRC_URI += "file://udhcpc-opts.cfg \
	    file://ifplugd-enable.cfg \
	    file://ntpd-enable.cfg \
	    file://busybox-ntpd \
	    file://busybox-ntpd.conf \
	    file://60ntpd"

PACKAGES =+ "${PN}-ntpd"
FILES_${PN}-ntpd = "${sysconfdir}/init.d/busybox-ntpd ${sysconfdir}/busybox-ntpd.conf"

INITSCRIPT_PACKAGES =+ "${PN}-ntpd"
INITSCRIPT_NAME_${PN}-ntpd = "busybox-ntpd"

do_install_append() {
	install -m 0755 ${WORKDIR}/busybox-ntpd ${D}${sysconfdir}/init.d/
	install -m 0644 ${WORKDIR}/busybox-ntpd.conf ${D}${sysconfdir}/
	install -m 0755 ${WORKDIR}/60ntpd ${D}${sysconfdir}/udhcpc.d/
}
