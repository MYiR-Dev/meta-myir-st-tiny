SUMMARY = "OpenSTLinux core image."
LICENSE = "Proprietary"

include recipes-myir/images/myir-image.inc

inherit core-image

IMAGE_LINGUAS = "en-us"

REQUIRED_DISTRO_FEATURES = "wayland"

IMAGE_FEATURES += "\
    package-management  \
    ssh-server-dropbear \
    splash              \
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
    packagegroup-framework-tools  \
    \
    packagegroup-framework-core-extra \
    ${@bb.utils.contains('COMBINED_FEATURES', 'optee', 'packagegroup-optee-core', '', d)}   \
    ${@bb.utils.contains('COMBINED_FEATURES', 'optee', 'packagegroup-optee-test', '', d)}   \
    "
