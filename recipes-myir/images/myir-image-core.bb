SUMMARY = "OpenSTLinux core image."
LICENSE = "Proprietary"

include recipes-myir/images/myir-image.inc

inherit core-image

IMAGE_LINGUAS = "en-us"

#REQUIRED_DISTRO_FEATURES = "wayland"

IMAGE_FEATURES += "\
    package-management  \
    ssh-server-dropbear \
    splash              \
    "

IMAGE_INSTALL_append = " \
			myd-ya157c \
			qt-demo \
			"

#
# INSTALL addons
#
CORE_IMAGE_EXTRA_INSTALL += " \
    resize-helper \
    \
    packagegroup-framework-core-base    \
    packagegroup-framework-tools-base   \
    \
    packagegroup-framework-core  \
    \
    packagegroup-framework-sample-qt  \
    "
