// Generated by jextract

package net.codecrete.usb.linux.gen.select;

import java.lang.foreign.Addressable;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
public class select  {

    /* package-private */ select() {}
    public static OfByte C_CHAR = Constants$root.C_CHAR$LAYOUT;
    public static OfShort C_SHORT = Constants$root.C_SHORT$LAYOUT;
    public static OfInt C_INT = Constants$root.C_INT$LAYOUT;
    public static OfLong C_LONG = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfLong C_LONG_LONG = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfFloat C_FLOAT = Constants$root.C_FLOAT$LAYOUT;
    public static OfDouble C_DOUBLE = Constants$root.C_DOUBLE$LAYOUT;
    public static OfAddress C_POINTER = Constants$root.C_POINTER$LAYOUT;
    public static MethodHandle select$MH() {
        return RuntimeHelper.requireNonNull(constants$0.select$MH,"select");
    }
    public static int select ( int __nfds,  Addressable __readfds,  Addressable __writefds,  Addressable __exceptfds,  Addressable __timeout) {
        var mh$ = select$MH();
        try {
            return (int)mh$.invokeExact(__nfds, __readfds, __writefds, __exceptfds, __timeout);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static int FD_SETSIZE() {
        return (int)1024L;
    }
}

