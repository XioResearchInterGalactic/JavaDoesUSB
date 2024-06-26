// Generated by jextract

package net.codecrete.usb.linux.gen.usbdevice_fs;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_BYTE;
import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$2 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2() {}
    static final VarHandle const$0 = constants$1.const$2.varHandle(MemoryLayout.PathElement.groupElement("data"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("interface"),
        JAVA_INT.withName("altsetting")
    ).withName("usbdevfs_setinterface");
    static final VarHandle const$2 = constants$2.const$1.varHandle(MemoryLayout.PathElement.groupElement("interface"));
    static final VarHandle const$3 = constants$2.const$1.varHandle(MemoryLayout.PathElement.groupElement("altsetting"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_BYTE.withName("type"),
        JAVA_BYTE.withName("endpoint"),
        MemoryLayout.paddingLayout(2),
        JAVA_INT.withName("status"),
        JAVA_INT.withName("flags"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("buffer"),
        JAVA_INT.withName("buffer_length"),
        JAVA_INT.withName("actual_length"),
        JAVA_INT.withName("start_frame"),
        MemoryLayout.unionLayout(
            JAVA_INT.withName("number_of_packets"),
            JAVA_INT.withName("stream_id")
        ).withName("$anon$0"),
        JAVA_INT.withName("error_count"),
        JAVA_INT.withName("signr"),
        RuntimeHelper.POINTER.withName("usercontext"),
        MemoryLayout.sequenceLayout(0, MemoryLayout.structLayout(
            JAVA_INT.withName("length"),
            JAVA_INT.withName("actual_length"),
            JAVA_INT.withName("status")
        ).withName("usbdevfs_iso_packet_desc")).withName("iso_frame_desc")
    ).withName("usbdevfs_urb");
    static final VarHandle const$5 = constants$2.const$4.varHandle(MemoryLayout.PathElement.groupElement("type"));
}


