// Generated by jextract

package net.codecrete.usb.windows.gen.usbioctl;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _USB_DESCRIPTOR_REQUEST {
 *     ULONG ConnectionIndex;
 *     struct  SetupPacket;
 *     UCHAR Data[0];
 * };
 * }
 */
public class _USB_DESCRIPTOR_REQUEST {

    public static MemoryLayout $LAYOUT() {
        return constants$0.const$0;
    }
    public static VarHandle ConnectionIndex$VH() {
        return constants$0.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG ConnectionIndex;
     * }
     */
    public static int ConnectionIndex$get(MemorySegment seg) {
        return (int)constants$0.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG ConnectionIndex;
     * }
     */
    public static void ConnectionIndex$set(MemorySegment seg, int x) {
        constants$0.const$1.set(seg, x);
    }
    public static int ConnectionIndex$get(MemorySegment seg, long index) {
        return (int)constants$0.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void ConnectionIndex$set(MemorySegment seg, long index, int x) {
        constants$0.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    /**
     * {@snippet :
     * struct {
     *     UCHAR bmRequest;
     *     UCHAR bRequest;
     *     USHORT wValue;
     *     USHORT wIndex;
     *     USHORT wLength;
     * };
     * }
     */
    public static final class SetupPacket {

        // Suppresses default constructor, ensuring non-instantiability.
        private SetupPacket() {}
        public static MemoryLayout $LAYOUT() {
            return constants$0.const$2;
        }
        public static VarHandle bmRequest$VH() {
            return constants$0.const$3;
        }
        /**
         * Getter for field:
         * {@snippet :
         * UCHAR bmRequest;
         * }
         */
        public static byte bmRequest$get(MemorySegment seg) {
            return (byte)constants$0.const$3.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * UCHAR bmRequest;
         * }
         */
        public static void bmRequest$set(MemorySegment seg, byte x) {
            constants$0.const$3.set(seg, x);
        }
        public static byte bmRequest$get(MemorySegment seg, long index) {
            return (byte)constants$0.const$3.get(seg.asSlice(index*sizeof()));
        }
        public static void bmRequest$set(MemorySegment seg, long index, byte x) {
            constants$0.const$3.set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle bRequest$VH() {
            return constants$0.const$4;
        }
        /**
         * Getter for field:
         * {@snippet :
         * UCHAR bRequest;
         * }
         */
        public static byte bRequest$get(MemorySegment seg) {
            return (byte)constants$0.const$4.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * UCHAR bRequest;
         * }
         */
        public static void bRequest$set(MemorySegment seg, byte x) {
            constants$0.const$4.set(seg, x);
        }
        public static byte bRequest$get(MemorySegment seg, long index) {
            return (byte)constants$0.const$4.get(seg.asSlice(index*sizeof()));
        }
        public static void bRequest$set(MemorySegment seg, long index, byte x) {
            constants$0.const$4.set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle wValue$VH() {
            return constants$0.const$5;
        }
        /**
         * Getter for field:
         * {@snippet :
         * USHORT wValue;
         * }
         */
        public static short wValue$get(MemorySegment seg) {
            return (short)constants$0.const$5.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * USHORT wValue;
         * }
         */
        public static void wValue$set(MemorySegment seg, short x) {
            constants$0.const$5.set(seg, x);
        }
        public static short wValue$get(MemorySegment seg, long index) {
            return (short)constants$0.const$5.get(seg.asSlice(index*sizeof()));
        }
        public static void wValue$set(MemorySegment seg, long index, short x) {
            constants$0.const$5.set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle wIndex$VH() {
            return constants$1.const$0;
        }
        /**
         * Getter for field:
         * {@snippet :
         * USHORT wIndex;
         * }
         */
        public static short wIndex$get(MemorySegment seg) {
            return (short)constants$1.const$0.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * USHORT wIndex;
         * }
         */
        public static void wIndex$set(MemorySegment seg, short x) {
            constants$1.const$0.set(seg, x);
        }
        public static short wIndex$get(MemorySegment seg, long index) {
            return (short)constants$1.const$0.get(seg.asSlice(index*sizeof()));
        }
        public static void wIndex$set(MemorySegment seg, long index, short x) {
            constants$1.const$0.set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle wLength$VH() {
            return constants$1.const$1;
        }
        /**
         * Getter for field:
         * {@snippet :
         * USHORT wLength;
         * }
         */
        public static short wLength$get(MemorySegment seg) {
            return (short)constants$1.const$1.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * USHORT wLength;
         * }
         */
        public static void wLength$set(MemorySegment seg, short x) {
            constants$1.const$1.set(seg, x);
        }
        public static short wLength$get(MemorySegment seg, long index) {
            return (short)constants$1.const$1.get(seg.asSlice(index*sizeof()));
        }
        public static void wLength$set(MemorySegment seg, long index, short x) {
            constants$1.const$1.set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
    }

    public static MemorySegment SetupPacket$slice(MemorySegment seg) {
        return seg.asSlice(4, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


