// Generated by jextract

package net.codecrete.usb.macos.gen.corefoundation;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_BYTE;
final class constants$3 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "CFRunLoopAddSource",
        constants$3.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "CFRunLoopRemoveSource",
        constants$3.const$0
    );
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_BYTE.withName("byte0"),
        JAVA_BYTE.withName("byte1"),
        JAVA_BYTE.withName("byte2"),
        JAVA_BYTE.withName("byte3"),
        JAVA_BYTE.withName("byte4"),
        JAVA_BYTE.withName("byte5"),
        JAVA_BYTE.withName("byte6"),
        JAVA_BYTE.withName("byte7"),
        JAVA_BYTE.withName("byte8"),
        JAVA_BYTE.withName("byte9"),
        JAVA_BYTE.withName("byte10"),
        JAVA_BYTE.withName("byte11"),
        JAVA_BYTE.withName("byte12"),
        JAVA_BYTE.withName("byte13"),
        JAVA_BYTE.withName("byte14"),
        JAVA_BYTE.withName("byte15")
    ).withName("");
    static final VarHandle const$4 = constants$3.const$3.varHandle(MemoryLayout.PathElement.groupElement("byte0"));
    static final VarHandle const$5 = constants$3.const$3.varHandle(MemoryLayout.PathElement.groupElement("byte1"));
}


