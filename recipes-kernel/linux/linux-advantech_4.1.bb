# Copyright (C) 2016 Timesys Corporation
# Copyright (C) 2016 Advantech Corporation
# Released under the MIT license (see COPYING.MIT for the terms)

include recipes-kernel/linux/linux-imx.inc
include recipes-kernel/linux/linux-dtb.inc

DEPENDS += "lzop-native bc-native"

SRCBRANCH = "master"
SRCREV = "${AUTOREV}"
LOCALVERSION = "-${SRCBRANCH}-dms-ba16"

SRC_URI = "git://github.com/easemiss/linux-4.1-imx.git;branch=${SRCBRANCH};protocol=http"

addtask copy_defconfig after do_patch before do_preconfigure #do_configure
do_copy_defconfig () {
    cp ${S}/arch/arm/configs/mx6dl_ba16_defconfig ${B}/.config
    cp ${S}/arch/arm/configs/mx6dl_ba16_defconfig ${B}/../defconfig
}


COMPATIBLE_MACHINE = "(imx6dl-dms-ba16|imx6q-dms-ba16)"
  
