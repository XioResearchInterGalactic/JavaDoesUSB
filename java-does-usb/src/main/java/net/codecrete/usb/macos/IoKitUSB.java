//
// Java Does USB
// Copyright (c) 2022 Manuel Bleichenbacher
// Licensed under MIT License
// https://opensource.org/licenses/MIT
//

package net.codecrete.usb.macos;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.MemoryLayout.structLayout;
import static java.lang.foreign.ValueLayout.*;

public class IoKitUSB {
    public static final short kIOUSBFindInterfaceDontCare = (short) 0xFFFF;

    public static final GroupLayout IOUSBFindInterfaceRequest$Struct;
    public static final VarHandle IOUSBFindInterfaceRequest_bInterfaceClass;
    public static final VarHandle IOUSBFindInterfaceRequest_bInterfaceSubClass;
    public static final VarHandle IOUSBFindInterfaceRequest_bInterfaceProtocol;
    public static final VarHandle IOUSBFindInterfaceRequest_bAlternateSetting;

    private static final GroupLayout IOUSBDevice$Struct;

    private static final VarHandle IOUSBDevice_USBDeviceOpen;
    private static final VarHandle IOUSBDevice_USBDeviceClose;
    private static final VarHandle IOUSBDevice_SetConfiguration;
    private static final VarHandle IOUSBDevice_GetConfigurationDescriptorPtr;
    private static final VarHandle IOUSBDevice_GetNumberOfConfigurations;
    private static final VarHandle IOUSBDevice_CreateInterfaceIterator;
    private static final VarHandle IOUSBDevice_DeviceRequest;

    private static final MethodHandle USBDeviceOpen$Func;
    private static final MethodHandle USBDeviceClose$Func;
    private static final MethodHandle SetConfiguration$Func;
    private static final MethodHandle GetConfigurationDescriptorPtr$Func;
    private static final MethodHandle GetNumberOfConfigurations$Func;
    private static final MethodHandle CreateInterfaceIterator$Func;
    private static final MethodHandle DeviceRequest$Func;

    private static final GroupLayout IOUSBInterface$Struct;

    private static final VarHandle IOUSBInterface_USBInterfaceOpen;
    private static final VarHandle IOUSBInterface_USBInterfaceClose;
    private static final VarHandle IOUSBInterface_GetInterfaceNumber;
    private static final VarHandle IOUSBInterface_GetNumEndpoints;
    private static final VarHandle IOUSBInterface_GetPipeProperties;
    private static final VarHandle IOUSBInterface_ReadPipe;
    private static final VarHandle IOUSBInterface_WritePipe;

    private static final MethodHandle USBInterfaceOpen$Func;
    private static final MethodHandle USBInterfaceClose$Func;
    private static final MethodHandle GetInterfaceNumber$Func;
    private static final MethodHandle GetNumEndpoints$Func;
    private static final MethodHandle GetPipeProperties$Func;
    private static final MethodHandle ReadPipe$Func;
    private static final MethodHandle WritePipe$Func;

    public static final GroupLayout IOUSBDevRequest$Struct;
    public static final VarHandle IOUSBDevRequest_bmRequestType;
    public static final VarHandle IOUSBDevRequest_bRequest;
    public static final VarHandle IOUSBDevRequest_wValue;
    public static final VarHandle IOUSBDevRequest_wIndex;
    public static final VarHandle IOUSBDevRequest_wLength;
    public static final VarHandle IOUSBDevRequest_pData;
    public static final VarHandle IOUSBDevRequest_wLenDone;


    static {
        var linker = Linker.nativeLinker();

        // typedef struct {
        //     UInt16 bInterfaceClass;                     // requested class
        //     UInt16 bInterfaceSubClass;                  // requested subclass
        //     UInt16 bInterfaceProtocol;                  // requested protocol
        //     UInt16 bAlternateSetting;                   // requested alt setting
        // } IOUSBFindInterfaceRequest;
        IOUSBFindInterfaceRequest$Struct = structLayout(
                JAVA_SHORT.withName("bInterfaceClass"),
                JAVA_SHORT.withName("bInterfaceSubClass"),
                JAVA_SHORT.withName("bInterfaceProtocol"),
                JAVA_SHORT.withName("bAlternateSetting")
        );

        IOUSBFindInterfaceRequest_bInterfaceClass = IOUSBFindInterfaceRequest$Struct.varHandle(groupElement("bInterfaceClass"));
        IOUSBFindInterfaceRequest_bInterfaceSubClass = IOUSBFindInterfaceRequest$Struct.varHandle(groupElement("bInterfaceSubClass"));
        IOUSBFindInterfaceRequest_bInterfaceProtocol = IOUSBFindInterfaceRequest$Struct.varHandle(groupElement("bInterfaceProtocol"));
        IOUSBFindInterfaceRequest_bAlternateSetting = IOUSBFindInterfaceRequest$Struct.varHandle(groupElement("bAlternateSetting"));

        IOUSBDevice$Struct = structLayout(
                ADDRESS.withName("_reserved"), // void *_reserved;
                ADDRESS.withName("QueryInterface"), // HRESULT (STDMETHODCALLTYPE *QueryInterface)(void *thisPointer, REFIID iid, LPVOID *ppv);
                ADDRESS.withName("AddRef"), // ULONG (STDMETHODCALLTYPE *AddRef)(void *thisPointer);
                ADDRESS.withName("Release"), // ULONG (STDMETHODCALLTYPE *Release)(void *thisPointer);
                ADDRESS.withName("CreateDeviceAsyncEventSource"), // IOReturn (*CreateDeviceAsyncEventSource)(void *self, CFRunLoopSourceRef *source);
                ADDRESS.withName("GetDeviceAsyncEventSource"), //  CFRunLoopSourceRef (*GetDeviceAsyncEventSource)(void *self);
                ADDRESS.withName("CreateDeviceAsyncPort"), //  IOReturn (*CreateDeviceAsyncPort)(void *self, mach_port_t *port);
                ADDRESS.withName("GetDeviceAsyncPort"), //  mach_port_t (*GetDeviceAsyncPort)(void *self);
                ADDRESS.withName("USBDeviceOpen"), //  IOReturn (*USBDeviceOpen)(void *self);
                ADDRESS.withName("USBDeviceClose"), //  IOReturn (*USBDeviceClose)(void *self);
                ADDRESS.withName("GetDeviceClass"), //  IOReturn (*GetDeviceClass)(void *self, UInt8 *devClass);
                ADDRESS.withName("GetDeviceSubClass"), //  IOReturn (*GetDeviceSubClass)(void *self, UInt8 *devSubClass);
                ADDRESS.withName("GetDeviceProtocol"), //  IOReturn (*GetDeviceProtocol)(void *self, UInt8 *devProtocol);
                ADDRESS.withName("GetDeviceVendor"), //  IOReturn (*GetDeviceVendor)(void *self, UInt16 *devVendor);
                ADDRESS.withName("GetDeviceProduct"), //  IOReturn (*GetDeviceProduct)(void *self, UInt16 *devProduct);
                ADDRESS.withName("GetDeviceReleaseNumber"), //  IOReturn (*GetDeviceReleaseNumber)(void *self, UInt16 *devRelNum);
                ADDRESS.withName("GetDeviceAddress"), //  IOReturn (*GetDeviceAddress)(void *self, USBDeviceAddress *addr);
                ADDRESS.withName("GetDeviceBusPowerAvailable"), //  IOReturn (*GetDeviceBusPowerAvailable)(void *self, UInt32 *powerAvailable);
                ADDRESS.withName("GetDeviceSpeed"), //  IOReturn (*GetDeviceSpeed)(void *self, UInt8 *devSpeed);
                ADDRESS.withName("GetNumberOfConfigurations"), //  IOReturn (*GetNumberOfConfigurations)(void *self, UInt8 *numConfig);
                ADDRESS.withName("GetLocationID"), //  IOReturn (*GetLocationID)(void *self, UInt32 *locationID);
                ADDRESS.withName("GetConfigurationDescriptorPtr"), //  IOReturn (*GetConfigurationDescriptorPtr)(void *self, UInt8 configIndex, IOUSBConfigurationDescriptorPtr *desc);
                ADDRESS.withName("GetConfiguration"), //  IOReturn (*GetConfiguration)(void *self, UInt8 *configNum);
                ADDRESS.withName("SetConfiguration"), //  IOReturn (*SetConfiguration)(void *self, UInt8 configNum);
                ADDRESS.withName("GetBusFrameNumber"), //  IOReturn (*GetBusFrameNumber)(void *self, UInt64 *frame, AbsoluteTime *atTime);
                ADDRESS.withName("ResetDevice"), //  IOReturn (*ResetDevice)(void *self);
                ADDRESS.withName("DeviceRequest"), //  IOReturn (*DeviceRequest)(void *self, IOUSBDevRequest *req);
                ADDRESS.withName("DeviceRequestAsync"), //  IOReturn (*DeviceRequestAsync)(void *self, IOUSBDevRequest *req, IOAsyncCallback1 callback, void *refCon);
                ADDRESS.withName("CreateInterfaceIterator"), //  IOReturn (*CreateInterfaceIterator)(void *self, IOUSBFindInterfaceRequest *req, io_iterator_t *iter);
                ADDRESS.withName("USBDeviceOpenSeize"), //  IOReturn (*USBDeviceOpenSeize)(void *self);
                ADDRESS.withName("DeviceRequestTO"), //  IOReturn (*DeviceRequestTO)(void *self, IOUSBDevRequestTO *req);
                ADDRESS.withName("DeviceRequestAsyncTO"), //  IOReturn (*DeviceRequestAsyncTO)(void *self, IOUSBDevRequestTO *req, IOAsyncCallback1 callback, void *refCon);
                ADDRESS.withName("USBDeviceSuspend"), //  IOReturn (*USBDeviceSuspend)(void *self, Boolean suspend);
                ADDRESS.withName("USBDeviceAbortPipeZero"), //  IOReturn (*USBDeviceAbortPipeZero)(void *self);
                ADDRESS.withName("USBGetManufacturerStringIndex"), //  IOReturn (*USBGetManufacturerStringIndex)(void *self, UInt8 *msi);
                ADDRESS.withName("USBGetProductStringIndex"), //  IOReturn (*USBGetProductStringIndex)(void *self, UInt8 *psi);
                ADDRESS.withName("USBGetSerialNumberStringIndex"), //  IOReturn (*USBGetSerialNumberStringIndex)(void *self, UInt8 *snsi);
                ADDRESS.withName("USBDeviceReEnumerate"), //  IOReturn (*USBDeviceReEnumerate)(void *self, UInt32 options);
                ADDRESS.withName("GetBusMicroFrameNumber"), //  IOReturn (*GetBusMicroFrameNumber)(void *self, UInt64 *microFrame, AbsoluteTime *atTime);
                ADDRESS.withName("GetIOUSBLibVersion"), //  IOReturn (*GetIOUSBLibVersion)(void *self, NumVersion *ioUSBLibVersion, NumVersion *usbFamilyVersion);
                ADDRESS.withName("GetBusFrameNumberWithTime"), //  IOReturn (*GetBusFrameNumberWithTime)(void *self, UInt64 *frame, AbsoluteTime *atTime);
                ADDRESS.withName("GetUSBDeviceInformation"), //  IOReturn (*GetUSBDeviceInformation)(void *self, UInt32 *info);
                ADDRESS.withName("RequestExtraPower"), //  IOReturn (*RequestExtraPower)(void *self, UInt32 type, UInt32 requestedPower, UInt32 *powerAvailable);
                ADDRESS.withName("ReturnExtraPower"), //  IOReturn (*ReturnExtraPower)(void *self, UInt32 type, UInt32 powerReturned);
                ADDRESS.withName("GetExtraPowerAllocated"), //  IOReturn (*GetExtraPowerAllocated)(void *self, UInt32 type, UInt32 *powerAllocated);
                ADDRESS.withName("GetBandwidthAvailableForDevice"), //  IOReturn (*GetBandwidthAvailableForDevice)(void *self, UInt32 *bandwidth);
                ADDRESS.withName("SetConfigurationV2"), //  IOReturn (*SetConfigurationV2)(void *self, UInt8 configNum, bool startInterfaceMatching, bool issueRemoteWakeup);
                ADDRESS.withName("RegisterForNotification"), //  IOReturn (*RegisterForNotification)(void * self, UInt64 notificationMask, IOAsyncCallback2 callback, void *refCon, UInt64 *pRegistrationToken);
                ADDRESS.withName("UnregisterNotification"), //  IOReturn (*UnregisterNotification)(void *self, UInt64 registrationToken);
                ADDRESS.withName("AcknowledgeNotification") //  IOReturn (*AcknowledgeNotification)(void *self, UInt64 notificationToken);
        );

        IOUSBDevice_USBDeviceOpen = IOUSBDevice$Struct.varHandle(groupElement("USBDeviceOpen"));
        IOUSBDevice_USBDeviceClose = IOUSBDevice$Struct.varHandle(groupElement("USBDeviceClose"));
        IOUSBDevice_GetNumberOfConfigurations = IOUSBDevice$Struct.varHandle(groupElement("GetNumberOfConfigurations"));
        IOUSBDevice_GetConfigurationDescriptorPtr = IOUSBDevice$Struct.varHandle(groupElement("GetConfigurationDescriptorPtr"));
        IOUSBDevice_SetConfiguration = IOUSBDevice$Struct.varHandle(groupElement("SetConfiguration"));
        IOUSBDevice_CreateInterfaceIterator = IOUSBDevice$Struct.varHandle(groupElement("CreateInterfaceIterator"));
        IOUSBDevice_DeviceRequest = IOUSBDevice$Struct.varHandle(groupElement("DeviceRequest"));

        // IOReturn (*USBDeviceOpen)(void *self);
        USBDeviceOpen$Func = linker.downcallHandle(
                FunctionDescriptor.of(JAVA_INT, ADDRESS)
        );

        // IOReturn (*USBDeviceClose)(void *self);
        USBDeviceClose$Func = linker.downcallHandle(
                FunctionDescriptor.of(JAVA_INT, ADDRESS)
        );

        //  IOReturn (*GetNumberOfConfigurations)(void *self, UInt8 *numConfig);
        GetNumberOfConfigurations$Func = linker.downcallHandle(
                FunctionDescriptor.of(JAVA_INT, ADDRESS, ADDRESS)
        );

        // IOReturn (*GetConfigurationDescriptorPtr)(void *self, UInt8 configIndex, IOUSBConfigurationDescriptorPtr *desc);
        GetConfigurationDescriptorPtr$Func = linker.downcallHandle(
                FunctionDescriptor.of(JAVA_INT, ADDRESS, JAVA_BYTE, ADDRESS)
        );

        // IOReturn (*SetConfiguration)(void *self, UInt8 configNum);
        SetConfiguration$Func = linker.downcallHandle(
                FunctionDescriptor.of(JAVA_INT, ADDRESS, JAVA_BYTE)
        );

        // IOReturn (*CreateInterfaceIterator)(void *self, IOUSBFindInterfaceRequest *req, io_iterator_t *iter);
        CreateInterfaceIterator$Func = linker.downcallHandle(
                FunctionDescriptor.of(JAVA_INT, ADDRESS, ADDRESS, ADDRESS)
        );

        // IOReturn (*DeviceRequest)(void *self, IOUSBDevRequest *req);
        DeviceRequest$Func = linker.downcallHandle(
                FunctionDescriptor.of(JAVA_INT, ADDRESS, ADDRESS)
        );

        IOUSBInterface$Struct = structLayout(
                ADDRESS.withName("_reserved"), // void *_reserved;
                ADDRESS.withName("QueryInterface"), // HRESULT (STDMETHODCALLTYPE *QueryInterface)(void *thisPointer, REFIID iid, LPVOID *ppv);
                ADDRESS.withName("AddRef"), // ULONG (STDMETHODCALLTYPE *AddRef)(void *thisPointer);
                ADDRESS.withName("Release"), // ULONG (STDMETHODCALLTYPE *Release)(void *thisPointer);
                ADDRESS.withName("CreateInterfaceAsyncEventSource"), //    IOReturn (*CreateInterfaceAsyncEventSource)(void *self, CFRunLoopSourceRef *source);
                ADDRESS.withName("GetInterfaceAsyncEventSource"), //    CFRunLoopSourceRef (*GetInterfaceAsyncEventSource)(void *self);
                ADDRESS.withName("CreateInterfaceAsyncPort"), //    IOReturn (*CreateInterfaceAsyncPort)(void *self, mach_port_t *port);
                ADDRESS.withName("GetInterfaceAsyncPort"), //    mach_port_t (*GetInterfaceAsyncPort)(void *self);
                ADDRESS.withName("USBInterfaceOpen"), //    IOReturn (*USBInterfaceOpen)(void *self);
                ADDRESS.withName("USBInterfaceClose"), //    IOReturn (*USBInterfaceClose)(void *self);
                ADDRESS.withName("GetInterfaceClass"), //    IOReturn (*GetInterfaceClass)(void *self, UInt8 *intfClass);
                ADDRESS.withName("GetInterfaceSubClass"), //    IOReturn (*GetInterfaceSubClass)(void *self, UInt8 *intfSubClass);
                ADDRESS.withName("GetInterfaceProtocol"), //    IOReturn (*GetInterfaceProtocol)(void *self, UInt8 *intfProtocol);
                ADDRESS.withName("GetDeviceVendor"), //    IOReturn (*GetDeviceVendor)(void *self, UInt16 *devVendor);
                ADDRESS.withName("GetDeviceProduct"), //    IOReturn (*GetDeviceProduct)(void *self, UInt16 *devProduct);
                ADDRESS.withName("GetDeviceReleaseNumber"), //    IOReturn (*GetDeviceReleaseNumber)(void *self, UInt16 *devRelNum);
                ADDRESS.withName("GetConfigurationValue"), //    IOReturn (*GetConfigurationValue)(void *self, UInt8 *configVal);
                ADDRESS.withName("GetInterfaceNumber"), //    IOReturn (*GetInterfaceNumber)(void *self, UInt8 *intfNumber);
                ADDRESS.withName("GetAlternateSetting"), //    IOReturn (*GetAlternateSetting)(void *self, UInt8 *intfAltSetting);
                ADDRESS.withName("GetNumEndpoints"), //    IOReturn (*GetNumEndpoints)(void *self, UInt8 *intfNumEndpoints);
                ADDRESS.withName("GetLocationID"), //    IOReturn (*GetLocationID)(void *self, UInt32 *locationID);
                ADDRESS.withName("GetDevice"), //    IOReturn (*GetDevice)(void *self, io_service_t *device);
                ADDRESS.withName("SetAlternateInterface"), //    IOReturn (*SetAlternateInterface)(void *self, UInt8 alternateSetting);
                ADDRESS.withName("GetBusFrameNumber"), //    IOReturn (*GetBusFrameNumber)(void *self, UInt64 *frame, AbsoluteTime *atTime);
                ADDRESS.withName("ControlRequest"), //    IOReturn (*ControlRequest)(void *self, UInt8 pipeRef, IOUSBDevRequest *req);
                ADDRESS.withName("ControlRequestAsync"), //    IOReturn (*ControlRequestAsync)(void *self, UInt8 pipeRef, IOUSBDevRequest *req, IOAsyncCallback1 callback, void *refCon);
                ADDRESS.withName("GetPipeProperties"), //    IOReturn (*GetPipeProperties)(void *self, UInt8 pipeRef, UInt8 *direction, UInt8 *number, UInt8 *transferType, UInt16 *maxPacketSize, UInt8 *interval);
                ADDRESS.withName("GetPipeStatus"), //    IOReturn (*GetPipeStatus)(void *self, UInt8 pipeRef);
                ADDRESS.withName("AbortPipe"), //    IOReturn (*AbortPipe)(void *self, UInt8 pipeRef);
                ADDRESS.withName("ResetPipe"), //    IOReturn (*ResetPipe)(void *self, UInt8 pipeRef);
                ADDRESS.withName("ClearPipeStall"), //    IOReturn (*ClearPipeStall)(void *self, UInt8 pipeRef);
                ADDRESS.withName("ReadPipe"), //    IOReturn (*ReadPipe)(void *self, UInt8 pipeRef, void *buf, UInt32 *size);
                ADDRESS.withName("WritePipe"), //    IOReturn (*WritePipe)(void *self, UInt8 pipeRef, void *buf, UInt32 size);
                ADDRESS.withName("ReadPipeAsync"), //    IOReturn (*ReadPipeAsync)(void *self, UInt8 pipeRef, void *buf, UInt32 size, IOAsyncCallback1 callback, void *refcon);
                ADDRESS.withName("WritePipeAsync"), //    IOReturn (*WritePipeAsync)(void *self, UInt8 pipeRef, void *buf, UInt32 size, IOAsyncCallback1 callback, void *refcon);
                ADDRESS.withName("ReadIsochPipeAsync"), //    IOReturn (*ReadIsochPipeAsync)(void *self, UInt8 pipeRef, void *buf, UInt64 frameStart, UInt32 numFrames, IOUSBIsocFrame *frameList, IOAsyncCallback1 callback, void *refcon);
                ADDRESS.withName("WriteIsochPipeAsync"), //    IOReturn (*WriteIsochPipeAsync)(void *self, UInt8 pipeRef, void *buf, UInt64 frameStart, UInt32 numFrames, IOUSBIsocFrame *frameList, IOAsyncCallback1 callback, void *refcon);
                ADDRESS.withName("ControlRequestTO"), //    IOReturn (*ControlRequestTO)(void *self, UInt8 pipeRef, IOUSBDevRequestTO *req);
                ADDRESS.withName("ControlRequestAsyncTO"), //    IOReturn (*ControlRequestAsyncTO)(void *self, UInt8 pipeRef, IOUSBDevRequestTO *req, IOAsyncCallback1 callback, void *refCon);
                ADDRESS.withName("ReadPipeTO"), //    IOReturn (*ReadPipeTO)(void *self, UInt8 pipeRef, void *buf, UInt32 *size, UInt32 noDataTimeout, UInt32 completionTimeout);
                ADDRESS.withName("WritePipeTO"), //    IOReturn (*WritePipeTO)(void *self, UInt8 pipeRef, void *buf, UInt32 size, UInt32 noDataTimeout, UInt32 completionTimeout);
                ADDRESS.withName("ReadPipeAsyncTO"), //    IOReturn (*ReadPipeAsyncTO)(void *self, UInt8 pipeRef, void *buf, UInt32 size, UInt32 noDataTimeout, UInt32 completionTimeout, IOAsyncCallback1 callback, void *refcon);
                ADDRESS.withName("WritePipeAsyncTO"), //    IOReturn (*WritePipeAsyncTO)(void *self, UInt8 pipeRef, void *buf, UInt32 size, UInt32 noDataTimeout, UInt32 completionTimeout, IOAsyncCallback1 callback, void *refcon);
                ADDRESS.withName("USBInterfaceGetStringIndex"), //    IOReturn (*USBInterfaceGetStringIndex)(void *self, UInt8 *si);
                ADDRESS.withName("USBInterfaceOpenSeize"), //    IOReturn (*USBInterfaceOpenSeize)(void *self);
                ADDRESS.withName("ClearPipeStallBothEnds"), //    IOReturn (*ClearPipeStallBothEnds)(void *self, UInt8 pipeRef);
                ADDRESS.withName("SetPipePolicy"), //    IOReturn (*SetPipePolicy)(void *self, UInt8 pipeRef, UInt16 maxPacketSize, UInt8 maxInterval);
                ADDRESS.withName("GetBandwidthAvailable"), //    IOReturn (*GetBandwidthAvailable)(void *self, UInt32 *bandwidth);
                ADDRESS.withName("GetEndpointProperties"), //    IOReturn (*GetEndpointProperties)(void *self, UInt8 alternateSetting, UInt8 endpointNumber, UInt8 direction, UInt8 *transferType, UInt16 *maxPacketSize, UInt8 *interval);
                ADDRESS.withName("LowLatencyReadIsochPipeAsync"), //    IOReturn (*LowLatencyReadIsochPipeAsync)(void *self, UInt8 pipeRef, void *buf, UInt64 frameStart, UInt32 numFrames, UInt32 updateFrequency, IOUSBLowLatencyIsocFrame *frameList, IOAsyncCallback1 callback, void *refcon);
                ADDRESS.withName("LowLatencyWriteIsochPipeAsync"), //    IOReturn (*LowLatencyWriteIsochPipeAsync)(void *self, UInt8 pipeRef, void *buf, UInt64 frameStart, UInt32 numFrames, UInt32 updateFrequency, IOUSBLowLatencyIsocFrame *frameList, IOAsyncCallback1 callback, void *refcon);
                ADDRESS.withName("LowLatencyCreateBuffer"), //    IOReturn (*LowLatencyCreateBuffer)(void * self, void **buffer, IOByteCount size, UInt32 bufferType);
                ADDRESS.withName("LowLatencyDestroyBuffer"), //    IOReturn (*LowLatencyDestroyBuffer) (void * self, void * buffer );
                ADDRESS.withName("GetBusMicroFrameNumber"), //    IOReturn (*GetBusMicroFrameNumber)(void *self, UInt64 *microFrame, AbsoluteTime *atTime);
                ADDRESS.withName("GetFrameListTime"), //    IOReturn (*GetFrameListTime)(void *self, UInt32 *microsecondsInFrame);
                ADDRESS.withName("GetIOUSBLibVersion"), //    IOReturn (*GetIOUSBLibVersion)(void *self, NumVersion *ioUSBLibVersion, NumVersion *usbFamilyVersion);
                ADDRESS.withName("FindNextAssociatedDescriptor"), //    IOUSBDescriptorHeader * (*FindNextAssociatedDescriptor)(void *self, const void *currentDescriptor, UInt8 descriptorType);
                ADDRESS.withName("FindNextAltInterface"), //    IOUSBDescriptorHeader * (*FindNextAltInterface)(void *self, const void *current, IOUSBFindInterfaceRequest *request);
                ADDRESS.withName("GetBusFrameNumberWithTime"), //    IOReturn (*GetBusFrameNumberWithTime)(void *self, UInt64 *frame, AbsoluteTime *atTime);
                ADDRESS.withName("GetPipePropertiesV2"), //    IOReturn (*GetPipePropertiesV2)(void *self, UInt8 pipeRef, UInt8 *direction, UInt8 *number, UInt8 *transferType, UInt16 *maxPacketSize, UInt8 *interval, UInt8 *maxBurst, UInt8 *mult, UInt16 *bytesPerInterval);
                ADDRESS.withName("GetPipePropertiesV3"), //    IOReturn (*GetPipePropertiesV3)(void *self, UInt8 pipeRef, IOUSBEndpointProperties *properties);
                ADDRESS.withName("GetEndpointPropertiesV3"), //    IOReturn (*GetEndpointPropertiesV3)(void *self, IOUSBEndpointProperties *properties);
                ADDRESS.withName("SupportsStreams"), //    IOReturn (*SupportsStreams)(void *self, UInt8 pipeRef, UInt32 *supportsStreams);
                ADDRESS.withName("CreateStreams"), //    IOReturn (*CreateStreams)(void *self, UInt8 pipeRef, UInt32 streamID);
                ADDRESS.withName("GetConfiguredStreams"), //    IOReturn (*GetConfiguredStreams)(void *self, UInt8 pipeRef, UInt32 *configuredStreams);
                ADDRESS.withName("ReadStreamsPipeTO"), //    IOReturn (*ReadStreamsPipeTO)(void *self, UInt8 pipeRef, UInt32 streamID, void *buf, UInt32 *size, UInt32 noDataTimeout, UInt32 completionTimeout);
                ADDRESS.withName("WriteStreamsPipeTO"), //    IOReturn (*WriteStreamsPipeTO)(void *self, UInt8 pipeRef, UInt32 streamID, void *buf, UInt32 size, UInt32 noDataTimeout, UInt32 completionTimeout);
                ADDRESS.withName("ReadStreamsPipeAsyncTO"), //    IOReturn (*ReadStreamsPipeAsyncTO)(void *self, UInt8 pipeRef, UInt32 streamID, void *buf, UInt32 size, UInt32 noDataTimeout, UInt32 completionTimeout, IOAsyncCallback1 callback, void *refcon);
                ADDRESS.withName("WriteStreamsPipeAsyncTO"), //    IOReturn (*WriteStreamsPipeAsyncTO)(void *self, UInt8 pipeRef, UInt32 streamID, void *buf, UInt32 size, UInt32 noDataTimeout, UInt32 completionTimeout, IOAsyncCallback1 callback, void *refcon);
                ADDRESS.withName("AbortStreamsPipe"), //    IOReturn (*AbortStreamsPipe)(void *self, UInt8 pipeRef, UInt32 streamID);
                ADDRESS.withName("RegisterForNotification"), //    IOReturn (*RegisterForNotification)(void * self, UInt64 notificationMask, IOAsyncCallback2 callback, void *refCon, UInt64 *pRegistrationToken);
                ADDRESS.withName("UnregisterNotification"), //    IOReturn (*UnregisterNotification)(void *self, UInt64 registrationToken);
                ADDRESS.withName("AcknowledgeNotification"), //    IOReturn (*AcknowledgeNotification)(void *self, UInt64 notificationToken);
                ADDRESS.withName("RegisterDriver") //    IOReturn (*RegisterDriver)(void *self);
        );

        IOUSBInterface_USBInterfaceOpen = IOUSBInterface$Struct.varHandle(groupElement("USBInterfaceOpen"));
        IOUSBInterface_USBInterfaceClose = IOUSBInterface$Struct.varHandle(groupElement("USBInterfaceClose"));
        IOUSBInterface_GetInterfaceNumber = IOUSBInterface$Struct.varHandle(groupElement("GetInterfaceNumber"));
        IOUSBInterface_GetNumEndpoints = IOUSBInterface$Struct.varHandle(groupElement("GetNumEndpoints"));
        IOUSBInterface_GetPipeProperties = IOUSBInterface$Struct.varHandle(groupElement("GetPipeProperties"));
        IOUSBInterface_ReadPipe = IOUSBInterface$Struct.varHandle(groupElement("ReadPipe"));
        IOUSBInterface_WritePipe = IOUSBInterface$Struct.varHandle(groupElement("WritePipe"));

        // IOReturn (*USBInterfaceOpen)(void *self);;
        USBInterfaceOpen$Func = linker.downcallHandle(
                FunctionDescriptor.of(JAVA_INT, ADDRESS)
        );

        // IOReturn (*USBInterfaceClose)(void *self);;
        USBInterfaceClose$Func = linker.downcallHandle(
                FunctionDescriptor.of(JAVA_INT, ADDRESS)
        );

        // IOReturn (*GetInterfaceNumber)(void *self, UInt8 *intfNumber);
        GetInterfaceNumber$Func = linker.downcallHandle(
                FunctionDescriptor.of(JAVA_INT, ADDRESS, ADDRESS)
        );

        // IOReturn (*GetNumEndpoints)(void *self, UInt8 *intfNumEndpoints);
        GetNumEndpoints$Func = linker.downcallHandle(
                FunctionDescriptor.of(JAVA_INT, ADDRESS, ADDRESS)
        );

        // IOReturn (*GetPipeProperties)(void *self, UInt8 pipeRef, UInt8 *direction, UInt8 *number, UInt8 *transferType, UInt16 *maxPacketSize, UInt8 *interval);
        GetPipeProperties$Func = linker.downcallHandle(
                FunctionDescriptor.of(JAVA_INT, ADDRESS, JAVA_BYTE, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS)
        );

        // IOReturn (*ReadPipe)(void *self, UInt8 pipeRef, void *buf, UInt32 *size);
        ReadPipe$Func = linker.downcallHandle(
                FunctionDescriptor.of(JAVA_INT, ADDRESS, JAVA_BYTE, ADDRESS, ADDRESS)
        );

        // IOReturn (*WritePipe)(void *self, UInt8 pipeRef, void *buf, UInt32 size);
        WritePipe$Func = linker.downcallHandle(
                FunctionDescriptor.of(JAVA_INT, ADDRESS, JAVA_BYTE, ADDRESS, JAVA_INT)
        );

        // typedef struct {
        //    UInt8  bmRequestType;
        //    UInt8  bRequest;
        //    UInt16 wValue;
        //    UInt16 wIndex;
        //    UInt16 wLength;
        //    void*  pData;
        //    UInt32 wLenDone;
        //} IOUSBDevRequest;
        IOUSBDevRequest$Struct = structLayout(
                JAVA_BYTE.withName("bmRequestType"),
                JAVA_BYTE.withName("bRequest"),
                JAVA_SHORT.withName("wValue"),
                JAVA_SHORT.withName("wIndex"),
                JAVA_SHORT.withName("wLength"),
                ADDRESS.withName("pData"),
                JAVA_INT.withName("wLenDone")
        );

        IOUSBDevRequest_bmRequestType = IOUSBDevRequest$Struct.varHandle(groupElement("bmRequestType"));
        IOUSBDevRequest_bRequest = IOUSBDevRequest$Struct.varHandle(groupElement("bRequest"));
        IOUSBDevRequest_wValue = IOUSBDevRequest$Struct.varHandle(groupElement("wValue"));
        IOUSBDevRequest_wIndex = IOUSBDevRequest$Struct.varHandle(groupElement("wIndex"));
        IOUSBDevRequest_wLength = IOUSBDevRequest$Struct.varHandle(groupElement("wLength"));
        IOUSBDevRequest_pData = IOUSBDevRequest$Struct.varHandle(groupElement("pData"));
        IOUSBDevRequest_wLenDone = IOUSBDevRequest$Struct.varHandle(groupElement("wLenDone"));
    }

    private static Addressable IOUSBDevice$VirtFunc(MemoryAddress thisPointer, VarHandle varHandle, MemorySession session) {
        var seg = MemorySegment.ofAddress(thisPointer, ADDRESS.byteSize(), session);
        var thisValue = seg.get(ADDRESS, 0);
        var obj = MemorySegment.ofAddress(thisValue, IOUSBDevice$Struct.byteSize(), session);
        return (MemoryAddress) varHandle.get(obj);
    }

    // IOReturn (*USBDeviceOpen)(void *self);
    public static int USBDeviceOpen(MemoryAddress thisPointer) {
        try (var session = MemorySession.openShared()) {
            var funcPtr = IOUSBDevice$VirtFunc(thisPointer, IOUSBDevice_USBDeviceOpen, session);
            return (int) USBDeviceOpen$Func.invokeExact(funcPtr, (Addressable) thisPointer);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    // IOReturn (*USBDeviceClose)(void *self);
    public static int USBDeviceClose(MemoryAddress thisPointer) {
        try (var session = MemorySession.openShared()) {
            var funcPtr = IOUSBDevice$VirtFunc(thisPointer, IOUSBDevice_USBDeviceClose, session);
            return (int) USBDeviceClose$Func.invokeExact(funcPtr, (Addressable) thisPointer);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    //  IOReturn (*GetNumberOfConfigurations)(void *self, UInt8 *numConfig);
    public static int GetNumberOfConfigurations(MemoryAddress thisPointer, Addressable numConfigHolder) {
        try (var session = MemorySession.openShared()) {
            var funcPtr = IOUSBDevice$VirtFunc(thisPointer, IOUSBDevice_GetNumberOfConfigurations, session);
            return (int) GetNumberOfConfigurations$Func.invokeExact(funcPtr, (Addressable) thisPointer, numConfigHolder);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    // IOReturn (*GetConfigurationDescriptorPtr)(void *self, UInt8 configIndex, IOUSBConfigurationDescriptorPtr *desc);
    public static int GetConfigurationDescriptorPtr(MemoryAddress thisPointer, byte configIndex, Addressable descHolder) {
        try (var session = MemorySession.openShared()) {
            var funcPtr = IOUSBDevice$VirtFunc(thisPointer, IOUSBDevice_GetConfigurationDescriptorPtr, session);
            return (int) GetConfigurationDescriptorPtr$Func.invokeExact(funcPtr, (Addressable) thisPointer, configIndex, descHolder);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    // IOReturn (*SetConfiguration)(void *self, UInt8 configNum);
    public static int SetConfiguration(MemoryAddress thisPointer, byte configValue) {
        try (var session = MemorySession.openShared()) {
            var funcPtr = IOUSBDevice$VirtFunc(thisPointer, IOUSBDevice_SetConfiguration, session);
            return (int) SetConfiguration$Func.invokeExact(funcPtr, (Addressable) thisPointer, configValue);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    // IOReturn (*CreateInterfaceIterator)(void *self, IOUSBFindInterfaceRequest *req, io_iterator_t *iter);
    public static int CreateInterfaceIterator(MemoryAddress thisPointer, Addressable req, Addressable iter) {
        try (var session = MemorySession.openShared()) {
            var funcPtr = IOUSBDevice$VirtFunc(thisPointer, IOUSBDevice_CreateInterfaceIterator, session);
            return (int) CreateInterfaceIterator$Func.invokeExact(funcPtr, (Addressable) thisPointer, req, iter);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    // IOReturn (*DeviceRequest)(void *self, IOUSBDevRequest *req);
    public static int DeviceRequest(MemoryAddress thisPointer, Addressable deviceRequest) {
        try (var session = MemorySession.openShared()) {
            var funcPtr = IOUSBDevice$VirtFunc(thisPointer, IOUSBDevice_DeviceRequest, session);
            return (int) DeviceRequest$Func.invokeExact(funcPtr, (Addressable) thisPointer, deviceRequest);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    private static Addressable IOUSBInterface$VirtFunc(MemoryAddress thisPointer, VarHandle varHandle, MemorySession session) {
        var seg = MemorySegment.ofAddress(thisPointer, ADDRESS.byteSize(), session);
        var thisValue = seg.get(ADDRESS, 0);
        var obj = MemorySegment.ofAddress(thisValue, IOUSBInterface$Struct.byteSize(), session);
        return (MemoryAddress) varHandle.get(obj);
    }

    // IOReturn (*USBInterfaceOpen)(void *self);
    public static int USBInterfaceOpen(MemoryAddress thisPointer) {
        try (var session = MemorySession.openShared()) {
            var funcPtr = IOUSBInterface$VirtFunc(thisPointer, IOUSBInterface_USBInterfaceOpen, session);
            return (int) USBInterfaceOpen$Func.invokeExact(funcPtr, (Addressable) thisPointer);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    // IOReturn (*USBInterfaceClose)(void *self);
    public static int USBInterfaceClose(MemoryAddress thisPointer) {
        try (var session = MemorySession.openShared()) {
            var funcPtr = IOUSBInterface$VirtFunc(thisPointer, IOUSBInterface_USBInterfaceClose, session);
            return (int) USBInterfaceClose$Func.invokeExact(funcPtr, (Addressable) thisPointer);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    // IOReturn (*GetInterfaceNumber)(void *self, UInt8 *intfNumber);
    public static int GetInterfaceNumber(MemoryAddress thisPointer, Addressable intfNumberHolder) {
        try (var session = MemorySession.openShared()) {
            var funcPtr = IOUSBInterface$VirtFunc(thisPointer, IOUSBInterface_GetInterfaceNumber, session);
            return (int) GetInterfaceNumber$Func.invokeExact(funcPtr, (Addressable) thisPointer, intfNumberHolder);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    // IOReturn (*GetNumEndpoints)(void *self, UInt8 *intfNumEndpoints);
    public static int GetNumEndpoints(MemoryAddress thisPointer, Addressable intfNumEndpointsHolder) {
        try (var session = MemorySession.openShared()) {
            var funcPtr = IOUSBInterface$VirtFunc(thisPointer, IOUSBInterface_GetNumEndpoints, session);
            return (int) GetNumEndpoints$Func.invokeExact(funcPtr, (Addressable) thisPointer, intfNumEndpointsHolder);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    // IOReturn (*GetPipeProperties)(void *self, UInt8 pipeRef, UInt8 *direction, UInt8 *number, UInt8 *transferType, UInt16 *maxPacketSize, UInt8 *interval);
    public static int GetPipeProperties(MemoryAddress thisPointer, byte pipeRef, Addressable directionHolder,
                                        Addressable numberHolder, Addressable transferTypeHolder,
                                        Addressable maxPacketSizeHolder, Addressable intervalHolder) {
        try (var session = MemorySession.openShared()) {
            var funcPtr = IOUSBInterface$VirtFunc(thisPointer, IOUSBInterface_GetPipeProperties, session);
            return (int) GetPipeProperties$Func.invokeExact(funcPtr, (Addressable) thisPointer, pipeRef, directionHolder,
                    numberHolder, transferTypeHolder, maxPacketSizeHolder, intervalHolder);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    // IOReturn (*ReadPipe)(void *self, UInt8 pipeRef, void *buf, UInt32 *size);
    public static int ReadPipe(MemoryAddress thisPointer, byte pipeRef, Addressable buf, Addressable sizeHolder) {
        try (var session = MemorySession.openShared()) {
            var funcPtr = IOUSBInterface$VirtFunc(thisPointer, IOUSBInterface_ReadPipe, session);
            return (int) ReadPipe$Func.invokeExact(funcPtr, (Addressable) thisPointer, pipeRef, buf, sizeHolder);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    // IOReturn (*WritePipe)(void *self, UInt8 pipeRef, void *buf, UInt32 size);
    public static int WritePipe(MemoryAddress thisPointer, byte pipeRef, Addressable buf, int size) {
        try (var session = MemorySession.openShared()) {
            var funcPtr = IOUSBInterface$VirtFunc(thisPointer, IOUSBInterface_WritePipe, session);
            return (int) WritePipe$Func.invokeExact(funcPtr, (Addressable) thisPointer, pipeRef, buf, size);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
