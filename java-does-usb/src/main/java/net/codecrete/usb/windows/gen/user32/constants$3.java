// Generated by jextract

package net.codecrete.usb.windows.gen.user32;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$3 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3() {}
    static final VarHandle const$0 = constants$2.const$1.varHandle(MemoryLayout.PathElement.groupElement("time"));
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(JAVA_LONG,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_LONG,
        JAVA_LONG
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "DefWindowProcW",
        constants$3.const$1
    );
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("dbch_size"),
        JAVA_INT.withName("dbch_devicetype"),
        JAVA_INT.withName("dbch_reserved")
    ).withName("_DEV_BROADCAST_HDR");
    static final VarHandle const$4 = constants$3.const$3.varHandle(MemoryLayout.PathElement.groupElement("dbch_size"));
    static final VarHandle const$5 = constants$3.const$3.varHandle(MemoryLayout.PathElement.groupElement("dbch_devicetype"));
}


