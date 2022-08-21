//
// Java Does USB
// Copyright (c) 2022 Manuel Bleichenbacher
// Licensed under MIT License
// https://opensource.org/licenses/MIT
//

package net.codecrete.usb.windows;

import net.codecrete.usb.USBDevice;
import net.codecrete.usb.common.USBDeviceInfoImpl;

public class WindowsUSBDeviceInfo extends USBDeviceInfoImpl {

    private final byte currentConfigurationValue;

    WindowsUSBDeviceInfo(
            String path, int vendorId, int productId,
            String manufacturer, String product, String serial,
            int classCode, int subclassCode, int protocolCode,
            byte currentConfigurationValue) {

        super(path, vendorId, productId,
                manufacturer, product, serial,
                classCode, subclassCode, protocolCode);
        this.currentConfigurationValue = currentConfigurationValue;
    }

    @Override
    public USBDevice open() {
        return new WindowsUSBDevice(path, this, currentConfigurationValue);
    }
}
