require u-boot.inc

# This is needs to be validated among supported BSP's before we can
# make it default
DEFAULT_PREFERENCE = "-1"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=1707d6db1d42237583f50183a5651ecb"

PV = "v2013.01.01+git${SRCPV}"

SRCREV = "cb82c56b5342908120e0cad4679dca7d6058d728"
SRC_URI = "git://git.denx.de/u-boot-sh.git;branch=renesas/bsp/rcar-gen2-1.9.4;protocol=git"

S = "${WORKDIR}/git"

COMPATIBLE_MACHINE = "(alt|gose|koelsch|lager|porter|silk|stout)"

SRC_URI_append_lcb = " \
    file://0001-arm-rmobile-Add-SILK-board-support.patch \
    file://0002-arm-rmobile-Add-Porter-board-support.patch \
    file://0003-serial-serial-sh-SCIF-internal-clock-source-support.patch \
    file://0004-ARM-cpu-Add-ARMv7-barrier-operations-support.patch \
    file://0007-gpio-sh-pfc-fix-gpio-input-read.patch \
    file://0008-serial-serial-sh-SCIFA-interface-for-R-Car-Gen2-SoCs.patch \
    file://0009-arm-rmobile-Add-r8a7790-stout-board-support.patch \
"
