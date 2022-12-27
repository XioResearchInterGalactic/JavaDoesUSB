// Generated by jextract

package net.codecrete.usb.windows.gen.stdlib;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
public class StdLib  {

    public static final OfByte C_CHAR = Constants$root.C_CHAR$LAYOUT;
    public static final OfShort C_SHORT = Constants$root.C_SHORT$LAYOUT;
    public static final OfInt C_INT = Constants$root.C_LONG$LAYOUT;
    public static final OfInt C_LONG = Constants$root.C_LONG$LAYOUT;
    public static final OfLong C_LONG_LONG = Constants$root.C_LONG_LONG$LAYOUT;
    public static final OfFloat C_FLOAT = Constants$root.C_FLOAT$LAYOUT;
    public static final OfDouble C_DOUBLE = Constants$root.C_DOUBLE$LAYOUT;
    public static final OfAddress C_POINTER = Constants$root.C_POINTER$LAYOUT;
    public static MethodHandle wcslen$MH() {
        return RuntimeHelper.requireNonNull(constants$0.wcslen$MH,"wcslen");
    }
    /**
     * {@snippet :
     * unsigned long long wcslen(const wchar_t* _String);
     * }
     */
    public static long wcslen(MemorySegment _String) {
        var mh$ = wcslen$MH();
        try {
            return (long)mh$.invokeExact(_String);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}


