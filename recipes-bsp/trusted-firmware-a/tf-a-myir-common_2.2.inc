FILESEXTRAPATHS_prepend_stm32mpcommon := "${THISDIR}/tf-a-myir:"

SECTION = "bootloaders"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://license.rst;md5=1dd070c98a281d18d9eefd938729b031"

#-------------------
# github
#-------------------
SRC_URI += "git://github.com/MYiR-Dev/myir-st-arm-trusted-firmware.git;protocol=https;branch=develop"
SRCREV= "86d2b8a0f215808ccc3205edf6ee430a76c052f6"


TF_VERSION = "2.2"
PV = "${TF_VERSION}.r1"

S = "${WORKDIR}/git"
#S = "${WORKDIR}/arm-trusted-firmware"

# ---------------------------------
# Configure devupstream class usage
# ---------------------------------
BBCLASSEXTEND = "devupstream:target"

#-------------------
# github
#-------------------
SRC_URI_class-devupstream ="git://github.com/MYiR-Dev/myir-st-arm-trusted-firmware.git;protocol=https;branch=develop"
SRCREV_class-devupstream ="86d2b8a0f215808ccc3205edf6ee430a76c052f6"



SRCREV_FORMAT_class-devupstream = "tfa"
PV_class-devupstream = "${TF_VERSION}+github+${SRCPV}"

# ---------------------------------
# Configure default preference to manage dynamic selection between tarball and github
# ---------------------------------
STM32MP_SOURCE_SELECTION ?= "tarball"

DEFAULT_PREFERENCE = "${@bb.utils.contains('STM32MP_SOURCE_SELECTION', 'github', '-1', '1', d)}"
