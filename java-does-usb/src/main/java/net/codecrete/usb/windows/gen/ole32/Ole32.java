// Generated by jextract

package net.codecrete.usb.windows.gen.ole32;

import java.lang.foreign.Addressable;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
public class Ole32  {

    /* package-private */ Ole32() {}
    public static OfByte C_CHAR = Constants$root.C_CHAR$LAYOUT;
    public static OfShort C_SHORT = Constants$root.C_SHORT$LAYOUT;
    public static OfInt C_INT = Constants$root.C_LONG$LAYOUT;
    public static OfInt C_LONG = Constants$root.C_LONG$LAYOUT;
    public static OfLong C_LONG_LONG = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfFloat C_FLOAT = Constants$root.C_FLOAT$LAYOUT;
    public static OfDouble C_DOUBLE = Constants$root.C_DOUBLE$LAYOUT;
    public static OfAddress C_POINTER = Constants$root.C_POINTER$LAYOUT;
    public static MethodHandle CLSIDFromString$MH() {
        return RuntimeHelper.requireNonNull(constants$0.CLSIDFromString$MH,"CLSIDFromString");
    }
    public static int CLSIDFromString ( Addressable lpsz,  Addressable pclsid) {
        var mh$ = CLSIDFromString$MH();
        try {
            return (int)mh$.invokeExact(lpsz, pclsid);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

