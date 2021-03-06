DESCRIPTION = "This module is a helper for easily find configuration file locations. \
Whether to use this information for find a suitable place for \
installing \
them or looking around for finding any piece of settings, heavily \
depends on \
the requirements."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/MooX-File-ConfigDir"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RE/REHSACK/MooX-File-ConfigDir-0.005.tar.gz"

SRC_URI[md5sum] = "59bd2340edf06fb45c6bdd6e834bf25b"
SRC_URI[sha256sum] = "888ef90da3c34584a8213221b08dbf9957ad4408a11b71394ad6c4b09f7f75ef"
RDEPENDS_${PN} += "namespace-clean-perl"

S = "${WORKDIR}/MooX-File-ConfigDir-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
