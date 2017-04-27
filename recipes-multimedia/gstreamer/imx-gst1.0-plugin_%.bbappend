# Append path for freescale layer to include bsp VPU overlaysink configuration
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

ALLOW_EMPTY_${PN} = "1"

SRC_URI_append_imx6dl-dms-ba16 = " file://imx_6dl_display_config"

do_install_append () {
        if test -s ${WORKDIR}/imx_6dl_display_config; then
                install -d ${D}/usr/share/
                install -m 0644 ${WORKDIR}/imx_6dl_display_config ${D}/usr/share
        fi
}
