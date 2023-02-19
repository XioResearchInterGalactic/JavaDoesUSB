// Generated by jextract

package net.codecrete.usb.windows.gen.kernel32;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
public class Kernel32  {

    public static final OfByte C_CHAR = Constants$root.C_CHAR$LAYOUT;
    public static final OfShort C_SHORT = Constants$root.C_SHORT$LAYOUT;
    public static final OfInt C_INT = Constants$root.C_LONG$LAYOUT;
    public static final OfInt C_LONG = Constants$root.C_LONG$LAYOUT;
    public static final OfLong C_LONG_LONG = Constants$root.C_LONG_LONG$LAYOUT;
    public static final OfFloat C_FLOAT = Constants$root.C_FLOAT$LAYOUT;
    public static final OfDouble C_DOUBLE = Constants$root.C_DOUBLE$LAYOUT;
    public static final OfAddress C_POINTER = Constants$root.C_POINTER$LAYOUT;
    /**
     * {@snippet :
     * #define FILE_SHARE_READ 1
     * }
     */
    public static int FILE_SHARE_READ() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * #define FILE_SHARE_WRITE 2
     * }
     */
    public static int FILE_SHARE_WRITE() {
        return (int)2L;
    }
    /**
     * {@snippet :
     * #define FILE_ATTRIBUTE_NORMAL 128
     * }
     */
    public static int FILE_ATTRIBUTE_NORMAL() {
        return (int)128L;
    }
    /**
     * {@snippet :
     * #define OPEN_EXISTING 3
     * }
     */
    public static int OPEN_EXISTING() {
        return (int)3L;
    }
    /**
     * {@snippet :
     * #define FILE_FLAG_OVERLAPPED 1073741824
     * }
     */
    public static int FILE_FLAG_OVERLAPPED() {
        return (int)1073741824L;
    }
    /**
     * {@snippet :
     * #define FORMAT_MESSAGE_ALLOCATE_BUFFER 256
     * }
     */
    public static int FORMAT_MESSAGE_ALLOCATE_BUFFER() {
        return (int)256L;
    }
    /**
     * {@snippet :
     * #define FORMAT_MESSAGE_IGNORE_INSERTS 512
     * }
     */
    public static int FORMAT_MESSAGE_IGNORE_INSERTS() {
        return (int)512L;
    }
    /**
     * {@snippet :
     * #define FORMAT_MESSAGE_FROM_SYSTEM 4096
     * }
     */
    public static int FORMAT_MESSAGE_FROM_SYSTEM() {
        return (int)4096L;
    }
    public static MethodHandle CloseHandle$MH() {
        return RuntimeHelper.requireNonNull(constants$0.CloseHandle$MH,"CloseHandle");
    }
    /**
     * {@snippet :
     * BOOL CloseHandle(HANDLE hObject);
     * }
     */
    public static int CloseHandle(MemorySegment hObject) {
        var mh$ = CloseHandle$MH();
        try {
            return (int)mh$.invokeExact(hObject);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle GetModuleHandleW$MH() {
        return RuntimeHelper.requireNonNull(constants$0.GetModuleHandleW$MH,"GetModuleHandleW");
    }
    /**
     * {@snippet :
     * HMODULE GetModuleHandleW(LPCWSTR lpModuleName);
     * }
     */
    public static MemorySegment GetModuleHandleW(MemorySegment lpModuleName) {
        var mh$ = GetModuleHandleW$MH();
        try {
            return (java.lang.foreign.MemorySegment)mh$.invokeExact(lpModuleName);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle LocalFree$MH() {
        return RuntimeHelper.requireNonNull(constants$0.LocalFree$MH,"LocalFree");
    }
    /**
     * {@snippet :
     * HLOCAL LocalFree(HLOCAL hMem);
     * }
     */
    public static MemorySegment LocalFree(MemorySegment hMem) {
        var mh$ = LocalFree$MH();
        try {
            return (java.lang.foreign.MemorySegment)mh$.invokeExact(hMem);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle FormatMessageW$MH() {
        return RuntimeHelper.requireNonNull(constants$0.FormatMessageW$MH,"FormatMessageW");
    }
    /**
     * {@snippet :
     * DWORD FormatMessageW(DWORD dwFlags, LPCVOID lpSource, DWORD dwMessageId, DWORD dwLanguageId, LPWSTR lpBuffer, DWORD nSize, va_list* Arguments);
     * }
     */
    public static int FormatMessageW(int dwFlags, MemorySegment lpSource, int dwMessageId, int dwLanguageId, MemorySegment lpBuffer, int nSize, MemorySegment Arguments) {
        var mh$ = FormatMessageW$MH();
        try {
            return (int)mh$.invokeExact(dwFlags, lpSource, dwMessageId, dwLanguageId, lpBuffer, nSize, Arguments);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    /**
     * {@snippet :
     * #define GENERIC_READ 2147483648
     * }
     */
    public static int GENERIC_READ() {
        return (int)2147483648L;
    }
    /**
     * {@snippet :
     * #define GENERIC_WRITE 1073741824
     * }
     */
    public static int GENERIC_WRITE() {
        return (int)1073741824L;
    }
    /**
     * {@snippet :
     * #define INFINITE 4294967295
     * }
     */
    public static int INFINITE() {
        return (int)4294967295L;
    }
    /**
     * {@snippet :
     * #define ERROR_SUCCESS 0
     * }
     */
    public static int ERROR_SUCCESS() {
        return (int)0L;
    }
    /**
     * {@snippet :
     * #define ERROR_FILE_NOT_FOUND 2
     * }
     */
    public static int ERROR_FILE_NOT_FOUND() {
        return (int)2L;
    }
    /**
     * {@snippet :
     * #define ERROR_GEN_FAILURE 31
     * }
     */
    public static int ERROR_GEN_FAILURE() {
        return (int)31L;
    }
    /**
     * {@snippet :
     * #define ERROR_SEM_TIMEOUT 121
     * }
     */
    public static int ERROR_SEM_TIMEOUT() {
        return (int)121L;
    }
    /**
     * {@snippet :
     * #define ERROR_INSUFFICIENT_BUFFER 122
     * }
     */
    public static int ERROR_INSUFFICIENT_BUFFER() {
        return (int)122L;
    }
    /**
     * {@snippet :
     * #define ERROR_MORE_DATA 234
     * }
     */
    public static int ERROR_MORE_DATA() {
        return (int)234L;
    }
    /**
     * {@snippet :
     * #define ERROR_NO_MORE_ITEMS 259
     * }
     */
    public static int ERROR_NO_MORE_ITEMS() {
        return (int)259L;
    }
    /**
     * {@snippet :
     * #define ERROR_IO_PENDING 997
     * }
     */
    public static int ERROR_IO_PENDING() {
        return (int)997L;
    }
    /**
     * {@snippet :
     * #define ERROR_NOT_FOUND 1168
     * }
     */
    public static int ERROR_NOT_FOUND() {
        return (int)1168L;
    }
}


