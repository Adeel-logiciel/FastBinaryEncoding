// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// Version: 1.3.0.0

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.enums.fbe

// Fast Binary Encoding com.chronoxor.enums final sender
@Suppress("MemberVisibilityCanBePrivate", "PropertyName")
open class FinalSender : com.chronoxor.fbe.Sender, IFinalSenderListener
{
    // Sender models accessors

    constructor() : super(true)
    {
    }

    constructor(buffer: com.chronoxor.fbe.Buffer) : super(buffer, true)
    {
    }

    fun send(obj: Any): Long
    {
        return sendListener(this, obj)
    }

    @Suppress("JoinDeclarationAndAssignment", "UNUSED_PARAMETER")
    fun sendListener(listener: IFinalSenderListener, obj: Any): Long
    {

        return 0
    }

}
