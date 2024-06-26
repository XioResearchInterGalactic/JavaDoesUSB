#!/bin/sh

JEXTRACT=../../../../jextract/build/jextract/bin/jextract
# If SDK_DIR is changed, it needs to be changed in compile_flags.txt as well.
SDK_DIR=/Applications/Xcode.app/Contents/Developer/Platforms/MacOSX.platform/Developer/SDKs/MacOSX.sdk

# CoreFoundation
$JEXTRACT --source --output ../../src/main/java \
  -I $SDK_DIR/usr/include \
  -lCoreFoundation.framework \
  --header-class-name CoreFoundation \
  --target-package net.codecrete.usb.macos.gen.corefoundation \
  --include-typedef CFRange \
  --include-typedef CFUUIDBytes \
  --include-function CFUUIDCreateFromUUIDBytes \
  --include-function CFRelease \
  --include-function CFStringGetLength \
  --include-function CFStringGetCharacters \
  --include-function CFStringCreateWithCharacters \
  --include-function CFGetTypeID \
  --include-function CFNumberGetTypeID \
  --include-function CFStringGetTypeID \
  --include-function CFNumberGetValue \
  --include-function CFRunLoopGetCurrent \
  --include-function CFRunLoopAddSource \
  --include-function CFRunLoopRemoveSource \
  --include-function CFRunLoopRun \
  --include-function CFUUIDGetUUIDBytes \
  --include-constant kCFNumberSInt32Type \
  cf_helper.h

# IOKit
$JEXTRACT --source --output ../../src/main/java \
  -I $SDK_DIR/usr/include \
  -lIOKit.framework \
  --header-class-name IOKit \
  --target-package net.codecrete.usb.macos.gen.iokit \
  --include-var kIOMasterPortDefault \
  --include-constant kIOUSBDeviceClassName \
  --include-constant kIOFirstMatchNotification \
  --include-constant kIOTerminatedNotification \
  --include-constant kIOReturnExclusiveAccess \
  --include-var kCFRunLoopDefaultMode \
  --include-struct IOCFPlugInInterfaceStruct \
  --include-typedef IOCFPlugInInterface \
  --include-function IOObjectRelease \
  --include-function IOIteratorNext \
  --include-function IOCreatePlugInInterfaceForService \
  --include-function IORegistryEntryCreateCFProperty \
  --include-function IONotificationPortCreate \
  --include-function IONotificationPortGetRunLoopSource \
  --include-function IORegistryEntryGetRegistryEntryID \
  --include-function IOServiceAddMatchingNotification \
  --include-function IOServiceMatching \
  --include-struct IOUSBDeviceStruct187 \
  --include-typedef IOUSBDeviceInterface187 \
  --include-constant kIOUSBFindInterfaceDontCare \
  --include-typedef IOUSBFindInterfaceRequest \
  --include-typedef IOUSBDevRequest \
  --include-struct IOUSBInterfaceStruct190 \
  --include-typedef IOUSBInterfaceInterface190 \
  --include-constant kIOUSBTransactionTimeout \
  --include-constant kIOReturnAborted \
  --include-constant kIOUSBPipeStalled \
  --include-constant kUSBReEnumerateCaptureDeviceMask \
  --include-constant kUSBReEnumerateReleaseDeviceMask \
  iokit_helper.h

# mach.h
$JEXTRACT --source --output ../../src/main/java \
  -I $SDK_DIR/usr/include \
  --header-class-name mach \
  --target-package net.codecrete.usb.macos.gen.mach \
  --include-function mach_error_string \
  $SDK_DIR/usr/include/mach/mach.h
