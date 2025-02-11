SUMMARY = "Compal Image for Products"
DESCRIPTION = "This image contain all packages for products Compal"


IMAGE_INSTALL = "packagegroup-core-boot \
                 packagegroup-core-x11-xserver \
                 packagegroup-core-x11-base \
                 packagegroup-core-x11 \
                 xorg-minimal-fonts \
                 xserver-nodm-init \
                 xserver-xorg-module-libint10 \
                 xinit \
                 xauth \ 
                 twm \
                 xserver-xorg \
                 xf86-video-fbdev \ 
                 libdri2 \
                 libx11 \
                 xdg-utils \
                 gtk+3 \
                 fuse  \
                 zlib-dev \
                 libxscrnsaver \
                 nss \
                 libnss-mdns \
                 libnss-nis \ 
                 gdb \
                 ldd \
                 libump \
                 xwd \
                 file \
                 binutils \ 
                 cups \
                 alsa-lib \
                 gdk-pixbuf \
                 xclock \
                 setxkbmap \ 
                 xorg-fonts-100dpi \
                 strace \
                 ltrace \
                 dpkg \
                 ${CORE_IMAGE_EXTRA_INSTALL}"


IMAGE_ROOTFS_SIZE ?= "1036000"

IMAGE_LINGUAS = " "

LICENSE = "MIT"

inherit core-image

# xserver-xorg-module-libint10 
#  xserver-nodm-init \
# xorg-minimal-fonts \
# packagegroup-core-boot \
# packagegroup-core-x11-xserver \
# packagegroup-core-x11-base \
# packagegroup-core-x11 \