DESCRIPTION = "Advantech test tools for BA16-Bx50 series"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${WORKDIR}/git/README;md5=4cd5197b25f1035cd99b02f84adb2c8f"

SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

FILES_${PN} = "/"

INSANE_SKIP_${PN} += "already-stripped"
SRCBRANCH = "master"

SRC_URI = "git://github.com/easemiss/ba_china_factorytool;branch=${SRCBRANCH};protocol=http"

do_install() {
	install -d  ${D}/home/root/Q7
	#install -m 0777 ${S} ${D}/home/root/Q7
	cp -r ${S}/. ${D}/home/root/Q7
	chmod -R a+x ${D}/home/root/Q7
}

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(imx6dl-dms-ba16|imx6q-dms-ba16)"
