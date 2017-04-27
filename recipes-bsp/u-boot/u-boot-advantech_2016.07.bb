require recipes-bsp/u-boot/u-boot.inc

DESCRIPTION = "U-Boot for Advantech i.MX6 DMS-BA16 based platforms"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=a2c678cfd4a4d97135585cad908541c6"
DEPENDS = "u-boot-mkimage-native"

PROVIDES = "u-boot"
SRCBRANCH = "master"
SRCREV = "${AUTOREV}"
SRC_URI = "git://github.com/easemiss/u-boot-2016.07;branch=${SRCBRANCH};protocol=http"
           
PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(imx6dl-dms-ba16|imx6q-dms-ba16)"
