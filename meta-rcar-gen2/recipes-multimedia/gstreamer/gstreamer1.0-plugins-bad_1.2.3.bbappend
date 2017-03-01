require ../../include/gles-control.inc
require ../../include/multimedia-control.inc

SRC_URI_rcar-gen2 = "git://github.com/renesas-devel/gst-plugins-bad.git;protocol=git;branch=RCAR-GEN2/1.2.3"
SRCREV_rcar-gen2 = "${@'0eeaabc66bf6d0f47da4744f991bdda03f348b6e' \
    if '1' in '${USE_GLES_WAYLAND}' else 'c1f5e09ce341f3438fb601a852ee70e72d375646'}"
LIC_FILES_CHKSUM_remove_rcar-gen2 = "\
    file://common/coverage/coverage-report.pl;beginline=2;endline=17;md5=a4e1830fce078028c8f0974161272607 \
"

SRC_URI += " \ 
     file://0001-gl-do-not-check-for-GL-GLU-EGL-GLES2-libs-if-disable.patch \ 
     file://configure-allow-to-disable-libssh2.patch" 

S = "${WORKDIR}/git"

do_configure_prepend() {
    cd ${S}
    ./autogen.sh --noconfigure
    cd ${B}
}

# for wayland
PACKAGECONFIG_remove_rcar-gen2 = "${@'orc' if '1' in '${USE_GLES_WAYLAND}' else ''}"
PACKAGECONFIG_append_rcar-gen2 = " faad ${@base_contains('USE_GLES_WAYLAND', '1', 'wayland', '', d)}"
DEPENDS += "wayland-kms"
RDEPENDS_${PN} += "libwayland-egl libgudev libegl libgbm"

# for lcb
DEPENDS_append_lcb = " ${@base_conditional('USE_MULTIMEDIA', '1', 'faac', '', d)}"
PACKAGECONFIG_append_lcb = " ${@base_conditional('USE_MULTIMEDIA', '1', 'faac', '', d)}"
