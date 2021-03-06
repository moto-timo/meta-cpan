DESCRIPTION = "In the daemontools way of thinking, a daemon writes all its logging output \
to STDOUT (or STDERR), which is a pipe to a logger process. Doing this \
instead of other logging alternatives keeps your program simple and allows \
you to capture errors generated by deeper libraries (like libc) which aren't \
aware of your logging API. If you want complicated logging you can keep \
those details in the logging process and not bloat each daemon you write."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Log-Any-Adapter-Daemontools"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/N/NE/NERDVANA/Log-Any-Adapter-Daemontools-0.101.tar.gz"

SRC_URI[md5sum] = "2307a0a7bc845155c0683d97b4dd3e27"
SRC_URI[sha256sum] = "206785296d8a0fc8a0f02077e564c255bc525e8a0c18f6b4d841ba065a332f23"
RDEPENDS_${PN} += "log-any-perl"

S = "${WORKDIR}/Log-Any-Adapter-Daemontools-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
