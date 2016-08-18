# From Intrepid the Genivi Yocto baseline meta-ivi adopted 3.14 as the default kernel for QEMU. 
# Override that to avoid a long list of build messages stating it is switching from 3.14 to 3.10.
PREFERRED_VERSION_linux-yocto ?= "3.10%"

# multimedia acceleration uses Gst version 1.2.x, otherwise meta-ivi currently uses 1.6.x
require ../../../include/multimedia-control.inc

PREFERRED_VERSION_gstreamer1.0 = "${@base_conditional("USE_MULTIMEDIA", "1", "1.2.%", "1.6.%", d )}"
PREFERRED_VERSION_gstreamer1.0-omx = "${@base_conditional("USE_MULTIMEDIA", "1", "1.0.%", "1.2.%", d )}"
PREFERRED_VERSION_gstreamer1.0-plugins-bad = '${@base_conditional("USE_MULTIMEDIA", "1", "1.2.%", "1.6.%", d )}'
PREFERRED_VERSION_gstreamer1.0-plugins-base = '${@base_conditional("USE_MULTIMEDIA", "1", "1.2.%", "1.6.%", d )}'
PREFERRED_VERSION_gstreamer1.0-plugins-good = '${@base_conditional("USE_MULTIMEDIA", "1", "1.2.%", "1.6.%", d )}'
PREFERRED_VERSION_gstreamer1.0-plugins-ugly = '${@base_conditional("USE_MULTIMEDIA", "1", "1.2.%", "1.6.%", d )}'
PREFERRED_VERSION_gstreamer1.0-libav = '${@base_conditional("USE_MULTIMEDIA", "1", "1.2.%", "1.6.%", d )}'
