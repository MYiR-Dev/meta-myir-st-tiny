SUMMARY = "Framework sample qt components"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup features_check

REQUIRED_DISTRO_FEATURES = "opengl"

PROVIDES = "${PACKAGES}"
PACKAGES = "\
            packagegroup-framework-sample-qt            \
            "

RDEPENDS_packagegroup-framework-sample-qt = "\
    qtbase                          \
    liberation-fonts                \
    qtbase-plugins                  \
    qtbase-tools                    \
    \
    qtmultimedia                    \
    qtmultimedia-plugins            \
    qtmultimedia-qmlplugins         \
    \
    qtquickcontrols             \
    qtquickcontrols-qmlplugins  \
    qtquickcontrols2            \
    qtquickcontrols2-qmlplugins \
    \
    qtvirtualkeyboard           \
    openstlinux-qt-eglfs        \
    "

RDEPENDS_packagegroup-framework-sample-qt-full = "\
    qtbase                          \
    liberation-fonts                \
    qtbase-plugins                  \
    qtbase-tools                    \
    \
    qtdeclarative                   \
    qtdeclarative-qmlplugins        \
    qtdeclarative-tools             \
    \
    qtgraphicaleffects-qmlplugins   \
    \
    qtmultimedia                    \
    qtmultimedia-plugins            \
    qtmultimedia-qmlplugins         \
    \
    qtscript                        \
    \
    openstlinux-qt-eglfs            \
    "


SUMMARY_packagegroup-framework-sample-qt-examples = "Framework sample qt components for examples"
RDEPENDS_packagegroup-framework-sample-qt-examples = "\
    qtbase-examples         \
    \
    qtdeclarative-examples  \
    \
    qtmultimedia-examples   \
    \
    qtscript-examples       \
"
