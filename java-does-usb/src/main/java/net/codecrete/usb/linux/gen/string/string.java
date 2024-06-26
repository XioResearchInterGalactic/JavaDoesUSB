// Generated by jextract

package net.codecrete.usb.linux.gen.string;

import java.lang.foreign.AddressLayout;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
public class string  {

    public static final OfByte C_CHAR = JAVA_BYTE;
    public static final OfShort C_SHORT = JAVA_SHORT;
    public static final OfInt C_INT = JAVA_INT;
    public static final OfLong C_LONG = JAVA_LONG;
    public static final OfLong C_LONG_LONG = JAVA_LONG;
    public static final OfFloat C_FLOAT = JAVA_FLOAT;
    public static final OfDouble C_DOUBLE = JAVA_DOUBLE;
    public static final AddressLayout C_POINTER = RuntimeHelper.POINTER;
    public static MethodHandle strerror$MH() {
        return RuntimeHelper.requireNonNull(constants$0.const$1,"strerror");
    }
    /**
     * {@snippet :
     * char* strerror(int __errnum);
     * }
     */
    public static MemorySegment strerror(int __errnum) {
        var mh$ = strerror$MH();
        try {
            return (java.lang.foreign.MemorySegment)mh$.invokeExact(__errnum);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}


