require ../../include/gles-control.inc
require ../../include/multimedia-control.inc

COMPATIBLE_MACHINE = "(alt|gose|koelsch|lager|porter|silk|stout)"

SRCREV = "ef3cb04de0d01178a64fea73ffa4c5e21e79f310"
SRC_URI = " \
    ${RENESAS_BACKPORTS_URL};protocol=git;branch=bsp/v3.10.31-ltsi/rcar-gen2-1.9.4 \
    file://0001-arm-lager-Add-vmalloc-384M-to-bootargs-of-DTS.patch \
    file://0001-arm-koelsch-Add-vmalloc-384M-to-bootargs-of-DTS.patch \
    file://0001-arm-alt-Add-vmalloc-384M-to-bootargs-of-DTS.patch \
    file://0001-arm-gose-Add-vmalloc-384M-to-bootargs-of-DTS.patch \
    file://user.cfg \
"

SRC_URI_append_lcb = " \
    file://0001-ARM-rmobile-Add-SILK-board-support.patch \
    file://0002-ARM-shmobile-r8a7791-add-CAN-DT-support.patch \
    file://0003-can-add-Renesas-R-Car-CAN-driver.patch \
    file://0004-sh-pfc-r8a7791-add-CAN-pin-groups.patch \
    file://0005-sh-pfc-r8a7791-fix-CAN-pin-groups.patch \
    file://0006-can-rcar_can-support-all-input-clocks.patch \
    file://0007-can-rcar_can-document-device-tree-bindings.patch \
    file://0008-can-rcar_can-add-device-tree-support.patch \
    file://0009-ARM-rmobile-Add-Porter-board-support.patch \
    file://0010-i2c-rcar-Revert-i2c-rcar-Support-ACK-by-HW-auto-rest.patch \
    file://0011-i2c-busses-rcar-Workaround-arbitration-loss-error.patch \
    file://0012-gpu-rcar-du-add-RGB-connector.patch \
    file://0013-gpu-rcar-du-Set-interlace-to-false-by-default-for-r8.patch \
    file://0014-ARM-shmobile-defconfig-Enable-SCI-DMA-support.patch \
    file://0015-ARM-shmobile-defconfig-Enable-Bluetooth.patch \
    file://0016-ARM-shmobile-defconfig-Add-ATAG-DTB-compatibility.patch \
    file://stout/01-da9063_rtc/0001-rtc-da9063-RTC-driver.patch \
    file://stout/02-da9063_mfd/0001-mfd-da9063-Add-IRQ-support.patch \
    file://stout/02-da9063_mfd/0002-mfd-dialog-Constify-struct-mfd_cell-where-possible.patch \
    file://stout/02-da9063_mfd/0003-mfd-da9063-Add-support-for-production-silicon-varian.patch \
    file://stout/02-da9063_mfd/0004-mfd-da9063-Upgrade-of-register-definitions-to-suppor.patch \
    file://stout/02-da9063_mfd/0005-mfd-da9063-Add-support-for-AD-silicon-variant.patch \
    file://stout/02-da9063_mfd/0006-mfd-da9063-Get-irq-base-dynamically-before-registeri.patch \
    file://stout/02-da9063_mfd/0007-mfd-da9063-Add-device-tree-support.patch \
    file://stout/03-da9063_regulator/0001-regulator-da9063-Add-Dialog-DA9063-voltage-regulator.patch \
    file://stout/03-da9063_regulator/0002-regulator-da9063-Optimize-da9063_set_current_limit-i.patch \
    file://stout/03-da9063_regulator/0003-regulator-da9063-Use-IS_ERR-to-check-return-value-of.patch \
    file://stout/03-da9063_regulator/0004-regulator-da9063-Statize-da9063_ldo_lim_event.patch \
    file://stout/03-da9063_regulator/0005-regulator-da9063-Fix-PTR_ERR-ERR_PTR-mismatch.patch \
    file://stout/03-da9063_regulator/0006-regulator-da9063-Add-missing-initialization-of-da906.patch \
    file://stout/03-da9063_regulator/0007-regulator-da9063-use-devm_regulator_register.patch \
    file://stout/03-da9063_regulator/0008-regulator-da9052-Revert-se-apply_-reg-bit-with-regma.patch \
    file://stout/03-da9063_regulator/0010-regulator-da9063-Bug-fix-when-setting-max-voltage-on.patch \
    file://stout/03-da9063_regulator/0011-regulator-da9063-Use-of_get_child_by_name.patch \
    file://stout/03-da9063_regulator/0012-regulator-da9063-Add-missing-of_node_put.patch \
    file://stout/03-da9063_regulator/0013-regulator-da9063-Do-not-hardcode-return-values.patch \
    file://stout/03-da9063_regulator/0014-regulator-da9063-Remove-redundant-error-message.patch \
    file://stout/03-da9063_regulator/0015-regulator-da9063-fix-assignment-of-da9063_reg_matche.patch \
    file://stout/03-da9063_regulator/0016-regulator-da9063-Do-not-transform-local-IRQ-to-virtu.patch \
    file://stout/04-da9063_wdt/0001-watchdog-Add-DA9063-PMIC-watchdog-driver.patch \
    file://stout/04-da9063_wdt/0002-watchdog-da9063-Add-restart-handler-support.patch \
    file://stout/05-regmap/0001-regmap-core-allow-a-virtual-range-to-cover-its-own-d.patch \
    file://stout/05-regmap/0002-regmap-irq-Allow-to-acknowledge-masked-interrupts-du.patch \
    file://stout/06-reboot/0001-kernel-sys.c-sys_reboot-fix-malformed-panic-message.patch \
    file://stout/06-reboot/0002-reboot-remove-stable-friendly-PF_THREAD_BOUND-define.patch \
    file://stout/06-reboot/0003-reboot-move-shutdown-reboot-related-functions-to-ker.patch \
    file://stout/06-reboot/0004-reboot-checkpatch.pl-the-new-kernel-reboot.c-file.patch \
    file://stout/06-reboot/0005-reboot-arm-prepare-reboot_mode-for-moving-to-generic.patch \
    file://stout/06-reboot/0006-reboot-x86-prepare-reboot_mode-for-moving-to-generic.patch \
    file://stout/06-reboot/0007-reboot-unicore32-prepare-reboot_mode-for-moving-to-g.patch \
    file://stout/06-reboot/0008-reboot-move-arch-x86-reboot-handling-to-generic-kern.patch \
    file://stout/06-reboot/0009-kernel-reboot.c-re-enable-the-function-of-variable-r.patch \
    file://stout/06-reboot/0010-kexec-migrate-to-reboot-cpu.patch \
    file://stout/06-reboot/0011-kernel-reboot.c-convert-simple_strtoul-to-kstrtoint.patch \
    file://stout/06-reboot/0012-kernel-add-support-for-kernel-restart-handler-call-c.patch \
    file://stout/06-reboot/0013-kernel-reboot.c-add-orderly_reboot-for-graceful-rebo.patch \
    file://stout/06-reboot/0014-reboot-arm-change-reboot_mode-to-use-enum-reboot_mod.patch \
    file://stout/06-reboot/0015-arm-support-restart-through-restart-handler-call-cha.patch \
    file://stout/07-r8a7790-stout/0001-sh-pfc-r8a7790-add-CAN-pin-groups.patch \
    file://stout/07-r8a7790-stout/0002-ARM-shmobile-r8a7790-add-CAN-DT-support.patch \
    file://stout/07-r8a7790-stout/0003-arm-shmobile-fix-compile-warnings.patch \
    file://stout/07-r8a7790-stout/0004-drm-rcar-du-parse-dt-adv7511-i2c-address.patch \
    file://stout/07-r8a7790-stout/0005-Fix-ADV7511-subchips-offsets.patch \
    file://stout/07-r8a7790-stout/0006-usb-xhci-rcar-Change-RCar-Gen2-usb3-firmware-to-upstream-name.patch;apply=no \
    file://stout/07-r8a7790-stout/0007-xhci-rcar-add-firmware-for-R-Car-H2-M2-USB-3.0-host-.patch \
    file://stout/07-r8a7790-stout/0008-spi-sh-msiof-request-gpios-for-cs-gpios.patch \
    file://stout/07-r8a7790-stout/0020-arm-rmobile-Add-R8A7790-stout-board-support.patch \
"

SRC_URI_append_porter = " file://can.cfg"
SRC_URI_append_stout = " file://stout.cfg"

USE_FAYTECH_MONITOR ?= "0"

SRC_URI_append = " \
    ${@' file://drm-rcar-du.cfg' \
    if '${USE_MULTIMEDIA}' == '0' or '${USE_GLES_WAYLAND}' == '0' else ''} \
    ${@' file://0001-faytech-fix-porter.patch' \
    if '${USE_FAYTECH_MONITOR}' == '1' else ''} \
"

PATCHTOOL_rcar-gen2 = "git"

# Because patch ID duplicates, it applies manually.
do_patch_append_lcb () {
	git am ${WORKDIR}/stout/07-r8a7790-stout/0006-usb-xhci-rcar-Change-RCar-Gen2-usb3-firmware-to-upstream-name.patch
}

# It is necessary to include this file after SRC_URI=
require linux-renesas.inc
