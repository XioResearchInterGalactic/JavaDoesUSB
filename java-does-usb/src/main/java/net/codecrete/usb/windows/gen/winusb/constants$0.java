// Generated by jextract

package net.codecrete.usb.windows.gen.winusb;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;
class constants$0 {

    static final FunctionDescriptor WinUsb_Initialize$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WinUsb_Initialize$MH = RuntimeHelper.downcallHandle(
        "WinUsb_Initialize",
        constants$0.WinUsb_Initialize$FUNC
    );
    static final FunctionDescriptor WinUsb_Free$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WinUsb_Free$MH = RuntimeHelper.downcallHandle(
        "WinUsb_Free",
        constants$0.WinUsb_Free$FUNC
    );
    static final FunctionDescriptor WinUsb_GetAssociatedInterface$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WinUsb_GetAssociatedInterface$MH = RuntimeHelper.downcallHandle(
        "WinUsb_GetAssociatedInterface",
        constants$0.WinUsb_GetAssociatedInterface$FUNC
    );
    static final FunctionDescriptor WinUsb_GetDescriptor$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WinUsb_GetDescriptor$MH = RuntimeHelper.downcallHandle(
        "WinUsb_GetDescriptor",
        constants$0.WinUsb_GetDescriptor$FUNC
    );
    static final FunctionDescriptor WinUsb_SetCurrentAlternateSetting$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle WinUsb_SetCurrentAlternateSetting$MH = RuntimeHelper.downcallHandle(
        "WinUsb_SetCurrentAlternateSetting",
        constants$0.WinUsb_SetCurrentAlternateSetting$FUNC
    );
    static final FunctionDescriptor WinUsb_SetPipePolicy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WinUsb_SetPipePolicy$MH = RuntimeHelper.downcallHandle(
        "WinUsb_SetPipePolicy",
        constants$0.WinUsb_SetPipePolicy$FUNC
    );
}


