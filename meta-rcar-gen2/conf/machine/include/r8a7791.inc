SOC_FAMILY = "rcar-gen2:r8a7791"
require conf/machine/include/soc-family.inc
DEFAULTTUNE ?= "cortexa15hf-neon"
require conf/machine/include/tune-cortexa15.inc
require ../../../include/multimedia-control.inc

PREFERRED_PROVIDER_virtual/kernel ?= "linux-renesas"
PREFERRED_PROVIDER_linux-libc-headers ?= "linux-libc-headers"
PREFERRED_PROVIDER_nativesdk-linux-libc-headers ?= "nativesdk-linux-libc-headers"
PREFERRED_PROVIDER_u-boot ?= "u-boot"

KERNEL_IMAGETYPE ?= "uImage"
EXTRA_IMAGEDEPENDS += "u-boot"

# multimedia acceleration uses Gst version 1.2.x, otherwise meta-ivi currently uses 1.4.x
PREFERRED_VERSION_gstreamer1.0 = "${@base_conditional("USE_MULTIMEDIA", "1", "1.2.%", "1.4.%", d )}"
PREFERRED_VERSION_gstreamer1.0-omx = "${@base_conditional("USE_MULTIMEDIA", "1", "1.0.%", "1.2.%", d )}"
PREFERRED_VERSION_gstreamer1.0-plugins-bad = '${@base_conditional("USE_MULTIMEDIA", "1", "1.2.%", "1.4.%", d )}'
PREFERRED_VERSION_gstreamer1.0-plugins-base = '${@base_conditional("USE_MULTIMEDIA", "1", "1.2.%", "1.4.%", d )}'
PREFERRED_VERSION_gstreamer1.0-plugins-good = '${@base_conditional("USE_MULTIMEDIA", "1", "1.2.%", "1.4.%", d )}'
PREFERRED_VERSION_gstreamer1.0-plugins-ugly = '${@base_conditional("USE_MULTIMEDIA", "1", "1.2.%", "1.4.%", d )}'
PREFERRED_VERSION_gstreamer1.0-libav = '${@base_conditional("USE_MULTIMEDIA", "1", "1.2.%", "1.4.%", d )}'
