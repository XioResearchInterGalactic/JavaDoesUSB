// Generated by jextract

package net.codecrete.usb.windows.gen.kernel32;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;
class constants$0 {

    static final FunctionDescriptor CreateFileW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateFileW$MH = RuntimeHelper.downcallHandle(
        "CreateFileW",
        constants$0.CreateFileW$FUNC
    );
    static final FunctionDescriptor CloseHandle$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CloseHandle$MH = RuntimeHelper.downcallHandle(
        "CloseHandle",
        constants$0.CloseHandle$FUNC
    );
    static final FunctionDescriptor GetLastError$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle GetLastError$MH = RuntimeHelper.downcallHandle(
        "GetLastError",
        constants$0.GetLastError$FUNC
    );
    static final FunctionDescriptor DeviceIoControl$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeviceIoControl$MH = RuntimeHelper.downcallHandle(
        "DeviceIoControl",
        constants$0.DeviceIoControl$FUNC
    );
    static final FunctionDescriptor GetModuleHandleW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetModuleHandleW$MH = RuntimeHelper.downcallHandle(
        "GetModuleHandleW",
        constants$0.GetModuleHandleW$FUNC
    );
}


