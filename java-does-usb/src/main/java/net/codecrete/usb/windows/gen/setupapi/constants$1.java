// Generated by jextract

package net.codecrete.usb.windows.gen.setupapi;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.*;
final class constants$1 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("cbSize"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("Data1"),
            JAVA_SHORT.withName("Data2"),
            JAVA_SHORT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, JAVA_BYTE).withName("Data4")
        ).withName("InterfaceClassGuid"),
        JAVA_INT.withName("Flags"),
        JAVA_LONG.withName("Reserved")
    ).withName("_SP_DEVICE_INTERFACE_DATA");
    static final VarHandle const$1 = constants$1.const$0.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    static final VarHandle const$2 = constants$1.const$0.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    static final VarHandle const$3 = constants$1.const$0.varHandle(MemoryLayout.PathElement.groupElement("Reserved"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("cbSize"),
        MemoryLayout.sequenceLayout(1, JAVA_SHORT).withName("DevicePath"),
        MemoryLayout.paddingLayout(2)
    ).withName("_SP_DEVICE_INTERFACE_DETAIL_DATA_W");
    static final VarHandle const$5 = constants$1.const$4.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
}

