DESCRIPTION = "PBKDF2 is a secure password hashing algorithm that uses the techniques of \
"key strengthening" to make the complexity of a brute-force attack \
arbitrarily high. PBKDF2 uses any other cryptographic hash or cipher (by \
convention, usually HMAC-SHA1, but "Crypt::PBKDF2" is fully pluggable), and \
allows for an arbitrary number of iterations of the hashing function, and a \
nearly unlimited output hash size (up to 2**32 - 1 times the size of the \
output of the backend hash). The hash is salted, as any password hash \
should be, and the salt may also be of arbitrary size."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Crypt-PBKDF2"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/A/AR/ARODLAND/Crypt-PBKDF2-0.160410.tar.gz"

SRC_URI[md5sum] = "326bc844f06539f4ea91ee8e6409ce93"
SRC_URI[sha256sum] = "3a9a43ce8daa7f60ad25b2158ec20b58fa3fe13742a05418b1717c41f161473a"
RDEPENDS_${PN} += "digest-sha3-perl"
RDEPENDS_${PN} += "digest-hmac-perl"
RDEPENDS_${PN} += "moo-perl"
RDEPENDS_${PN} += "module-runtime-perl"
RDEPENDS_${PN} += "namespace-autoclean-perl"
RDEPENDS_${PN} += "strictures-perl"
RDEPENDS_${PN} += "try-tiny-perl"
RDEPENDS_${PN} += "type-tiny-perl"
DEPENDS += "test-fatal-perl-native"

S = "${WORKDIR}/Crypt-PBKDF2-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
