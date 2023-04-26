//
// Java Does USB
// Copyright (c) 2022 Manuel Bleichenbacher
// Licensed under MIT License
// https://opensource.org/licenses/MIT
//

package net.codecrete.usb.linux;

/**
 * Data structures and constants related to the USB device file system.
 */
public class USBDevFS {

    public static final long RELEASEINTERFACE = 0x80045510L;
    public static final long SETINTERFACE = 0x80085504L;
    public static final long CLEAR_HALT = 0x80045515L;
    public static final long SUBMITURB = 0x8038550AL;
    public static final long DISCARDURB = 0x550BL;
    public static final long REAPURBNDELAY = 0x4008550DL;
    public static final long DISCONNECT_CLAIM = 0x8108551BL;
    public static final int CONNECT = 0x5517;
    public static final long IOCTL = 0xC0105512L;
}
