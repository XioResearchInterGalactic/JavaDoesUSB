// Generated by jextract

package net.codecrete.usb.windows.gen.user32;

import java.lang.foreign.AddressLayout;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
public class User32  {

    public static final OfByte C_CHAR = JAVA_BYTE;
    public static final OfShort C_SHORT = JAVA_SHORT;
    public static final OfInt C_INT = JAVA_INT;
    public static final OfInt C_LONG = JAVA_INT;
    public static final OfLong C_LONG_LONG = JAVA_LONG;
    public static final OfFloat C_FLOAT = JAVA_FLOAT;
    public static final OfDouble C_DOUBLE = JAVA_DOUBLE;
    public static final AddressLayout C_POINTER = RuntimeHelper.POINTER;
    /**
     * {@snippet :
     * #define WM_POWERBROADCAST 536
     * }
     */
    public static int WM_POWERBROADCAST() {
        return (int)536L;
    }
    /**
     * {@snippet :
     * #define PBT_APMRESUMEAUTOMATIC 18
     * }
     */
    public static int PBT_APMRESUMEAUTOMATIC() {
        return (int)18L;
    }
    /**
     * {@snippet :
     * #define WM_DEVICECHANGE 537
     * }
     */
    public static int WM_DEVICECHANGE() {
        return (int)537L;
    }
    /**
     * {@snippet :
     * #define DEVICE_NOTIFY_WINDOW_HANDLE 0
     * }
     */
    public static int DEVICE_NOTIFY_WINDOW_HANDLE() {
        return (int)0L;
    }
    /**
     * {@snippet :
     * #define DBT_DEVICEARRIVAL 32768
     * }
     */
    public static int DBT_DEVICEARRIVAL() {
        return (int)32768L;
    }
    /**
     * {@snippet :
     * #define DBT_DEVICEREMOVECOMPLETE 32772
     * }
     */
    public static int DBT_DEVICEREMOVECOMPLETE() {
        return (int)32772L;
    }
    /**
     * {@snippet :
     * #define DBT_DEVTYP_DEVICEINTERFACE 5
     * }
     */
    public static int DBT_DEVTYP_DEVICEINTERFACE() {
        return (int)5L;
    }
    public static MethodHandle DefWindowProcW$MH() {
        return RuntimeHelper.requireNonNull(constants$3.const$2,"DefWindowProcW");
    }
    /**
     * {@snippet :
     * LRESULT DefWindowProcW(HWND hWnd, UINT Msg, WPARAM wParam, LPARAM lParam);
     * }
     */
    public static long DefWindowProcW(MemorySegment hWnd, int Msg, long wParam, long lParam) {
        var mh$ = DefWindowProcW$MH();
        try {
            return (long)mh$.invokeExact(hWnd, Msg, wParam, lParam);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    /**
     * {@snippet :
     * #define HWND_MESSAGE -3
     * }
     */
    public static MemorySegment HWND_MESSAGE() {
        return constants$4.const$5;
    }
}


