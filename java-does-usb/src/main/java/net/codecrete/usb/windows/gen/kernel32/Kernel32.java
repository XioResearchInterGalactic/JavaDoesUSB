// Generated by jextract

package net.codecrete.usb.windows.gen.kernel32;

import java.lang.foreign.Addressable;
import java.lang.foreign.MemoryAddress;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
public class Kernel32  {

    /* package-private */ Kernel32() {}
    public static OfByte C_CHAR = Constants$root.C_CHAR$LAYOUT;
    public static OfShort C_SHORT = Constants$root.C_SHORT$LAYOUT;
    public static OfInt C_INT = Constants$root.C_LONG$LAYOUT;
    public static OfInt C_LONG = Constants$root.C_LONG$LAYOUT;
    public static OfLong C_LONG_LONG = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfFloat C_FLOAT = Constants$root.C_FLOAT$LAYOUT;
    public static OfDouble C_DOUBLE = Constants$root.C_DOUBLE$LAYOUT;
    public static OfAddress C_POINTER = Constants$root.C_POINTER$LAYOUT;
    public static int FILE_SHARE_READ() {
        return (int)1L;
    }
    public static int FILE_SHARE_WRITE() {
        return (int)2L;
    }
    public static int FILE_ATTRIBUTE_NORMAL() {
        return (int)128L;
    }
    public static int OPEN_EXISTING() {
        return (int)3L;
    }
    public static int FILE_FLAG_OVERLAPPED() {
        return (int)1073741824L;
    }
    public static int FORMAT_MESSAGE_ALLOCATE_BUFFER() {
        return (int)256L;
    }
    public static int FORMAT_MESSAGE_IGNORE_INSERTS() {
        return (int)512L;
    }
    public static int FORMAT_MESSAGE_FROM_SYSTEM() {
        return (int)4096L;
    }
    public static MethodHandle CreateFileW$MH() {
        return RuntimeHelper.requireNonNull(constants$0.CreateFileW$MH,"CreateFileW");
    }
    public static MemoryAddress CreateFileW ( Addressable lpFileName,  int dwDesiredAccess,  int dwShareMode,  Addressable lpSecurityAttributes,  int dwCreationDisposition,  int dwFlagsAndAttributes,  Addressable hTemplateFile) {
        var mh$ = CreateFileW$MH();
        try {
            return (java.lang.foreign.MemoryAddress)mh$.invokeExact(lpFileName, dwDesiredAccess, dwShareMode, lpSecurityAttributes, dwCreationDisposition, dwFlagsAndAttributes, hTemplateFile);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle CloseHandle$MH() {
        return RuntimeHelper.requireNonNull(constants$0.CloseHandle$MH,"CloseHandle");
    }
    public static int CloseHandle ( Addressable hObject) {
        var mh$ = CloseHandle$MH();
        try {
            return (int)mh$.invokeExact(hObject);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle GetLastError$MH() {
        return RuntimeHelper.requireNonNull(constants$0.GetLastError$MH,"GetLastError");
    }
    public static int GetLastError () {
        var mh$ = GetLastError$MH();
        try {
            return (int)mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle DeviceIoControl$MH() {
        return RuntimeHelper.requireNonNull(constants$0.DeviceIoControl$MH,"DeviceIoControl");
    }
    public static int DeviceIoControl ( Addressable hDevice,  int dwIoControlCode,  Addressable lpInBuffer,  int nInBufferSize,  Addressable lpOutBuffer,  int nOutBufferSize,  Addressable lpBytesReturned,  Addressable lpOverlapped) {
        var mh$ = DeviceIoControl$MH();
        try {
            return (int)mh$.invokeExact(hDevice, dwIoControlCode, lpInBuffer, nInBufferSize, lpOutBuffer, nOutBufferSize, lpBytesReturned, lpOverlapped);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle GetModuleHandleW$MH() {
        return RuntimeHelper.requireNonNull(constants$0.GetModuleHandleW$MH,"GetModuleHandleW");
    }
    public static MemoryAddress GetModuleHandleW ( Addressable lpModuleName) {
        var mh$ = GetModuleHandleW$MH();
        try {
            return (java.lang.foreign.MemoryAddress)mh$.invokeExact(lpModuleName);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle LocalFree$MH() {
        return RuntimeHelper.requireNonNull(constants$0.LocalFree$MH,"LocalFree");
    }
    public static MemoryAddress LocalFree ( Addressable hMem) {
        var mh$ = LocalFree$MH();
        try {
            return (java.lang.foreign.MemoryAddress)mh$.invokeExact(hMem);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle FormatMessageW$MH() {
        return RuntimeHelper.requireNonNull(constants$1.FormatMessageW$MH,"FormatMessageW");
    }
    public static int FormatMessageW ( int dwFlags,  Addressable lpSource,  int dwMessageId,  int dwLanguageId,  Addressable lpBuffer,  int nSize,  Addressable Arguments) {
        var mh$ = FormatMessageW$MH();
        try {
            return (int)mh$.invokeExact(dwFlags, lpSource, dwMessageId, dwLanguageId, lpBuffer, nSize, Arguments);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static int GENERIC_READ() {
        return (int)2147483648L;
    }
    public static int GENERIC_WRITE() {
        return (int)1073741824L;
    }
    public static int ERROR_SUCCESS() {
        return (int)0L;
    }
    public static int ERROR_FILE_NOT_FOUND() {
        return (int)2L;
    }
    public static int ERROR_INSUFFICIENT_BUFFER() {
        return (int)122L;
    }
    public static int ERROR_MORE_DATA() {
        return (int)234L;
    }
    public static int ERROR_NO_MORE_ITEMS() {
        return (int)259L;
    }
}


