// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: fbe
// Version: 1.3.0.0

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.fbe

// Fast Binary Encoding base sender listener interface
interface ISenderListener
{
    // Send message handler
    fun onSend(buffer: ByteArray, offset: Long, size: Long): Long { return size }
    // Send log message handler
    fun onSendLog(message: String) {}
}
