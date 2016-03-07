FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

EXTRA_OECONF_class-native = "--disable-documentation"

EXTRA_OECONF = "--disable-documentation --with-host-scanner"
