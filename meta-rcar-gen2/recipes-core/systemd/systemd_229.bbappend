FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

# The following patch is required (from upstream systemd v230) to build systemd with
# the 3.10 kernel. So we need to carry it until Poky or meta-ivi updates to v230 or later.
SRC_URI += " \ 
     file://0001-missing.h-add-BTRFS_IOC_QUOTA_RESCAN_WAIT-3266.patch \ 
" 
