// Generated by jextract

package net.codecrete.usb.macos.gen.iokit;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_SHORT;
final class constants$40 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$40() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        constants$39.const$4
    );
    static final VarHandle const$1 = constants$20.const$2.varHandle(MemoryLayout.PathElement.groupElement("GetEndpointProperties"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("_reserved"),
        RuntimeHelper.POINTER.withName("QueryInterface"),
        RuntimeHelper.POINTER.withName("AddRef"),
        RuntimeHelper.POINTER.withName("Release"),
        JAVA_SHORT.withName("version"),
        JAVA_SHORT.withName("revision"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("Probe"),
        RuntimeHelper.POINTER.withName("Start"),
        RuntimeHelper.POINTER.withName("Stop")
    ).withName("IOCFPlugInInterfaceStruct");
    static final VarHandle const$3 = constants$40.const$2.varHandle(MemoryLayout.PathElement.groupElement("_reserved"));
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(IOCFPlugInInterfaceStruct.QueryInterface.class, "apply", constants$5.const$1);
    static final VarHandle const$5 = constants$40.const$2.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
}


