// Generated by jextract

package net.codecrete.usb.windows.gen.usbioctl;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.*;
final class constants$0 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$0() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withByteAlignment(1).withName("ConnectionIndex"),
        MemoryLayout.structLayout(
            JAVA_BYTE.withName("bmRequest"),
            JAVA_BYTE.withName("bRequest"),
            JAVA_SHORT.withByteAlignment(1).withName("wValue"),
            JAVA_SHORT.withByteAlignment(1).withName("wIndex"),
            JAVA_SHORT.withByteAlignment(1).withName("wLength")
        ).withName("SetupPacket"),
        MemoryLayout.sequenceLayout(0, JAVA_BYTE).withName("Data")
    ).withName("_USB_DESCRIPTOR_REQUEST");
    static final VarHandle const$1 = constants$0.const$0.varHandle(MemoryLayout.PathElement.groupElement("ConnectionIndex"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_BYTE.withName("bmRequest"),
        JAVA_BYTE.withName("bRequest"),
        JAVA_SHORT.withByteAlignment(1).withName("wValue"),
        JAVA_SHORT.withByteAlignment(1).withName("wIndex"),
        JAVA_SHORT.withByteAlignment(1).withName("wLength")
    ).withName("");
    static final VarHandle const$3 = constants$0.const$2.varHandle(MemoryLayout.PathElement.groupElement("bmRequest"));
    static final VarHandle const$4 = constants$0.const$2.varHandle(MemoryLayout.PathElement.groupElement("bRequest"));
    static final VarHandle const$5 = constants$0.const$2.varHandle(MemoryLayout.PathElement.groupElement("wValue"));
}


