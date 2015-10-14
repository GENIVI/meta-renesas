require ../../include/gles-control.inc

def map_libs(d):
    if base_conditional('USE_GLES_WAYLAND', "1", "1", "0", d) == "1":
        return "wayland"

    if base_conditional('USE_GLES_X11', "1", "1", "0", d) == "1":
        return "x11"

    return "dummy"

MESATARGET := "${@map_libs(d)}"
include mesa-${MESATARGET}.inc

# For R-Car E2 temporarily disable Cortex A7 optimisation to avoid upstream 
# build issue between YP 1.7 gcc toolchain and Mesa 10.1.x releases.
TARGET_CC_ARCH_remove_r8a7794 = "-mtune=cortex-a7"
