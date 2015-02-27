require linux.inc
#require linux-dtb.inc
require linux-dtb-append.inc

DESCRIPTION = "Linux kernel for the R-Car Generation 2 based board"
SECTION = "kernel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

RENESAS_BACKPORTS_URL="git://git.kernel.org/pub/scm/linux/kernel/git/horms/renesas-backport.git"
SRC_URI += " \
        file://defconfig \
        "

PV_append = "+git${SRCREV}"

# S = "${WORKDIR}/git"

KERNEL_DEFCONFIG = "shmobile_defconfig"
UDEV_GE_141 ?= "1"

do_kernel_configme_prepend() {
    install -m 0644 ${S}/arch/${ARCH}/configs/${KERNEL_DEFCONFIG} ${WORKDIR}/defconfig || die "No default configuration for ${MACHINE} / ${KERNEL_DEFCONFIG} available."
}
