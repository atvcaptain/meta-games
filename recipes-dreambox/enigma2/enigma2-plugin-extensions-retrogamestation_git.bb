SUMMARY = "Retro Gaming with Emulators for dreamboxes"
LICENSE = "CLOSED"
GITHUB_PROJECT = "enigma2-plugin-retrogamestation"
RDEPENDS_${PN} = "enigma2"

SRCREV = "${@opendreambox_srcrev('c657efb14bf63e240ea31a4cca0ca64584a9b36e', d)}"

inherit autotools pkgconfig opendreambox-github

PACKAGES += "${PN}-meta"

FILES_${PN} += "${libdir}/enigma2"
FILES_${PN}-meta = "${datadir}/meta"
