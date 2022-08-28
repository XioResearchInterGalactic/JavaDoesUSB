// Generated by jextract

package net.codecrete.usb.windows.gen.user32;

import java.lang.foreign.*;
import java.lang.invoke.VarHandle;
public class _DEV_BROADCAST_DEVICEINTERFACE_W {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dbcc_size"),
        Constants$root.C_LONG$LAYOUT.withName("dbcc_devicetype"),
        Constants$root.C_LONG$LAYOUT.withName("dbcc_reserved"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("dbcc_classguid"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_SHORT$LAYOUT).withName("dbcc_name"),
        MemoryLayout.paddingLayout(16)
    ).withName("_DEV_BROADCAST_DEVICEINTERFACE_W");
    public static MemoryLayout $LAYOUT() {
        return _DEV_BROADCAST_DEVICEINTERFACE_W.$struct$LAYOUT;
    }
    static final VarHandle dbcc_size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dbcc_size"));
    public static VarHandle dbcc_size$VH() {
        return _DEV_BROADCAST_DEVICEINTERFACE_W.dbcc_size$VH;
    }
    public static int dbcc_size$get(MemorySegment seg) {
        return (int)_DEV_BROADCAST_DEVICEINTERFACE_W.dbcc_size$VH.get(seg);
    }
    public static void dbcc_size$set( MemorySegment seg, int x) {
        _DEV_BROADCAST_DEVICEINTERFACE_W.dbcc_size$VH.set(seg, x);
    }
    public static int dbcc_size$get(MemorySegment seg, long index) {
        return (int)_DEV_BROADCAST_DEVICEINTERFACE_W.dbcc_size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dbcc_size$set(MemorySegment seg, long index, int x) {
        _DEV_BROADCAST_DEVICEINTERFACE_W.dbcc_size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dbcc_devicetype$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dbcc_devicetype"));
    public static VarHandle dbcc_devicetype$VH() {
        return _DEV_BROADCAST_DEVICEINTERFACE_W.dbcc_devicetype$VH;
    }
    public static int dbcc_devicetype$get(MemorySegment seg) {
        return (int)_DEV_BROADCAST_DEVICEINTERFACE_W.dbcc_devicetype$VH.get(seg);
    }
    public static void dbcc_devicetype$set( MemorySegment seg, int x) {
        _DEV_BROADCAST_DEVICEINTERFACE_W.dbcc_devicetype$VH.set(seg, x);
    }
    public static int dbcc_devicetype$get(MemorySegment seg, long index) {
        return (int)_DEV_BROADCAST_DEVICEINTERFACE_W.dbcc_devicetype$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dbcc_devicetype$set(MemorySegment seg, long index, int x) {
        _DEV_BROADCAST_DEVICEINTERFACE_W.dbcc_devicetype$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dbcc_reserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dbcc_reserved"));
    public static VarHandle dbcc_reserved$VH() {
        return _DEV_BROADCAST_DEVICEINTERFACE_W.dbcc_reserved$VH;
    }
    public static int dbcc_reserved$get(MemorySegment seg) {
        return (int)_DEV_BROADCAST_DEVICEINTERFACE_W.dbcc_reserved$VH.get(seg);
    }
    public static void dbcc_reserved$set( MemorySegment seg, int x) {
        _DEV_BROADCAST_DEVICEINTERFACE_W.dbcc_reserved$VH.set(seg, x);
    }
    public static int dbcc_reserved$get(MemorySegment seg, long index) {
        return (int)_DEV_BROADCAST_DEVICEINTERFACE_W.dbcc_reserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dbcc_reserved$set(MemorySegment seg, long index, int x) {
        _DEV_BROADCAST_DEVICEINTERFACE_W.dbcc_reserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment dbcc_classguid$slice(MemorySegment seg) {
        return seg.asSlice(12, 16);
    }
    public static MemorySegment dbcc_name$slice(MemorySegment seg) {
        return seg.asSlice(28, 2);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


