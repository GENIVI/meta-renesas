# From Intrepid the Genivi Yocto baseline meta-ivi adopted 3.14 as the default kernel for QEMU. 
# Override that to avoid a long list of build messages stating it is switching from 3.14 to 3.10.
PREFERRED_VERSION_linux-yocto ?= "3.10%"
