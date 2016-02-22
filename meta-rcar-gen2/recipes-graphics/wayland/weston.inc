require ../../include/gles-control.inc

PACKAGECONFIG_rcar-gen2 := "${@'${PACKAGECONFIG}'.replace('x11', '')}"

DEPENDS_append_rcar-gen2 = " \
    ${@base_conditional('USE_GLES', '1', 'libegl', '', d)}"

RDEPENDS_${PN}_append_rcar-gen2 = " \
    ${@base_conditional('USE_GLES', '1', 'libegl', '', d)}"
RDEPENDS_${PN}-examples_append_rcar-gen2 = " \
    ${@base_conditional('USE_GLES', '1', 'libegl', '', d)}"

EXTRA_OECONF_append = " \
    ${@base_conditional('USE_GLES', '1', '', \
    ' WESTON_NATIVE_BACKEND="fbdev-backend.so"', d)}"
