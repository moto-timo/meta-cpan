DESCRIPTION = "Config::Any provides a facility for Perl applications and libraries to \
load configuration data from multiple different file formats. It \
supports XML, \
YAML, JSON, Apache-style configuration, Windows INI files, and even \
Perl \
code."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Config-Any"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/B/BR/BRICAS/Config-Any-0.26.tar.gz"

SRC_URI[md5sum] = "5c5ac3e32674a98681da85a56424847a"
SRC_URI[sha256sum] = "f9ae12d5c1f084385dd9d55dd25c09a6f69f1a76c938d4d06ea3c6d85710a594"
RDEPENDS_${PN} += "module-pluggable-perl"

S = "${WORKDIR}/Config-Any-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
