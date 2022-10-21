// Generated by jextract

package net.codecrete.usb.windows.gen.winusb;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
class constants$1 {

    static final FunctionDescriptor WinUsb_ReadPipe$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WinUsb_ReadPipe$MH = RuntimeHelper.downcallHandle(
        "WinUsb_ReadPipe",
        constants$1.WinUsb_ReadPipe$FUNC
    );
    static final FunctionDescriptor WinUsb_WritePipe$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WinUsb_WritePipe$MH = RuntimeHelper.downcallHandle(
        "WinUsb_WritePipe",
        constants$1.WinUsb_WritePipe$FUNC
    );
    static final FunctionDescriptor WinUsb_ControlTransfer$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_CHAR$LAYOUT.withName("RequestType"),
            Constants$root.C_CHAR$LAYOUT.withName("Request"),
            Constants$root.C_SHORT$LAYOUT.withName("Value"),
            Constants$root.C_SHORT$LAYOUT.withName("Index"),
            Constants$root.C_SHORT$LAYOUT.withName("Length")
        ).withName("_WINUSB_SETUP_PACKET"),
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WinUsb_ControlTransfer$MH = RuntimeHelper.downcallHandle(
        "WinUsb_ControlTransfer",
        constants$1.WinUsb_ControlTransfer$FUNC
    );
    static final FunctionDescriptor WinUsb_ResetPipe$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle WinUsb_ResetPipe$MH = RuntimeHelper.downcallHandle(
        "WinUsb_ResetPipe",
        constants$1.WinUsb_ResetPipe$FUNC
    );
}


