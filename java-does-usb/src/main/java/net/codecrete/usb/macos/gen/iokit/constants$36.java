// Generated by jextract

package net.codecrete.usb.macos.gen.iokit;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_BYTE;
import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$36 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$36() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_BYTE,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT
    );
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(IOUSBInterfaceStruct190.WritePipeTO.class, "apply", constants$36.const$0);
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        constants$36.const$0
    );
    static final VarHandle const$3 = constants$20.const$2.varHandle(MemoryLayout.PathElement.groupElement("WritePipeTO"));
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_BYTE,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(IOUSBInterfaceStruct190.ReadPipeAsyncTO.class, "apply", constants$36.const$4);
}


