//
// Java Does USB
// Copyright (c) 2022 Manuel Bleichenbacher
// Licensed under MIT License
// https://opensource.org/licenses/MIT
//
// Reference C++ code for Linux
//

#pragma  once

#include <functional>
#include <iostream>
#include <mutex>
#include <linux/usbdevice_fs.h>
#include "usb_device.hpp"
#include "blocking_queue.hpp"

/**
 * Input stream buffer for USB bulk or interrupt endpoint.
 *
 * The stream buffer is internally used by an input stream. It submits multiple asynchronous IO requests to
 * achieve maximum throughput.
 */
class usb_istreambuf : public std::streambuf {
public:
    /// Constructor
    usb_istreambuf(usb_device_ptr device, int ep_num);
    /// Destructor
    virtual ~usb_istreambuf();
    
protected:
    /// Called when the internal buffer has no further data to read.
    virtual int_type underflow();
    
private:
    /// Transfer request
    struct transfer_request {
        /// USB request buffer
        usbdevfs_urb urb;
        /// IO completion handler
        usb_io_callback io_completion;
        /// indicates if the request has completed
        bool is_completed;

        int result_code() {
            return urb.status;
        }

        int result_size() {
            return urb.actual_length;
        }
    };

    void submit_transfer(transfer_request* request);
    void close();
    void on_completed(transfer_request* request);
    transfer_request* wait_for_request_completion();

    /// Maximum number of concurrently outstanding requests
    static constexpr int max_outstanding_requests = 4;
    
    /// USB device
    usb_device_ptr device;
    /// endpoint number
    int endpoint_number;
    /// Indicates that this stream buffer is closed
    bool is_closed;
    /// buffer size
    int buffer_size;
    /// transfer requests
    transfer_request requests[max_outstanding_requests];
    /// queue with completed requests
    blocking_queue<transfer_request*> completed_request_queue;
    /// number of outstanding requests (requests pending with OS and requests in queue)
    int num_outstanding_requests;
    /// current request being read from
    transfer_request* current_request;};

/**
 * Output stream buffer for USB bulk or interrupt endpoint.
 *
 * The stream buffer is internally used by an output stream. It submits multiple asynchronous IO requests to
 * achieve maximum throughput.
 */
class usb_ostreambuf : public std::streambuf {
public:
    /// Constructor
    usb_ostreambuf(usb_device_ptr device, int ep_num);
    /// Destructor
    virtual ~usb_ostreambuf();
    
    virtual int sync();
    
protected:
    /// Called when the internal buffer has no space left to add more data.
    virtual int overflow (int c);
    
private:
    /// Transfer request
    struct transfer_request {
        /// USB request buffer
        usbdevfs_urb urb;
        /// IO completion handler
        usb_io_callback io_completion;
        /// indicates if the request has completed
        bool is_completed;

        int result_code() {
            return urb.status;
        }

        int result_size() {
            return urb.actual_length;
        }
    };

    void fill_queue();
    void submit_transfer(int size);
    transfer_request* wait_for_available_transfer();
    void on_completed(transfer_request* request);

    /// Maximum number of concurrently outstanding requests
    static constexpr int max_outstanding_requests = 4;

    /// USB device
    usb_device_ptr device;
    /// endpoint number
    int endpoint_number;
    /// Indicates that this stream buffer is closed
    bool is_closed;
    /// Indicates if a zero-length packet is required
    bool needs_zlp;
    /// packet size
    int packet_size;
    /// buffer size
    int buffer_size;
    /// transfer requests
    transfer_request requests[max_outstanding_requests];
    /// queue with available requests
    blocking_queue<transfer_request*> available_request_queue;
    /// current request being written to
    transfer_request* current_request;
};

/**
 * Input stream for reading from a USB bulk endpoint
 */
class usb_istream : public std::istream {
public:
    /// Constructor
    usb_istream(usb_device_ptr device, int ep_num);
    /// Destructor
    ~usb_istream();
};

/**
 * Output stream for writing to a USB bulk endpoint
 */
class usb_ostream : public std::ostream {
public:
    /// Constructor
    usb_ostream(usb_device_ptr device, int ep_num);
    /// Destructor
    ~usb_ostream();
};
