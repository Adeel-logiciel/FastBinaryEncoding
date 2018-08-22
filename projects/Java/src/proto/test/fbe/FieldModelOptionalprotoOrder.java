// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding

package test.fbe;

import java.io.*;
import java.lang.*;
import java.lang.reflect.*;
import java.math.*;
import java.nio.charset.*;
import java.time.*;
import java.util.*;
import javafx.util.*;

import fbe.*;
import test.*;

// Fast Binary Encoding optional protoOrder field model class
public final class FieldModelOptionalprotoOrder extends FieldModel
{
    public FieldModelOptionalprotoOrder(Buffer buffer, long offset)
    {
        super(buffer, offset);
        value = new proto.fbe.FieldModelOrder(buffer, 0);
    }

    // Get the field size
    @Override
    public long FBESize() { return 1 + 4; }
    // Get the field extra size
    @Override
    public long FBEExtra()
    {
        if (!hasValue())
            return 0;

        int fbeOptionalOffset = readInt32(FBEOffset() + 1);
        if ((fbeOptionalOffset == 0) || ((_buffer.getOffset() + fbeOptionalOffset + 4) > _buffer.getSize()))
            return 0;

        _buffer.shift(fbeOptionalOffset);
        long fbeResult = value.FBESize() + value.FBEExtra();
        _buffer.unshift(fbeOptionalOffset);
        return fbeResult;
    }

    // Checks whether the object contains a value
    public boolean hasValue()
    {
        if ((_buffer.getOffset() + FBEOffset() + FBESize()) > _buffer.getSize())
            return false;

        byte fbeHasValue = readInt8(FBEOffset());
        return (fbeHasValue != 0);
    }

    // Base field model value
    public final proto.fbe.FieldModelOrder value;

    // Check if the optional value is valid
    @Override
    public boolean verify()
    {
        if ((_buffer.getOffset() + FBEOffset() + FBESize()) > _buffer.getSize())
            return true;

        byte fbeHasValue = readInt8(FBEOffset());
        if (fbeHasValue == 0)
            return true;

        int fbeOptionalOffset = readInt32(FBEOffset());
        if (fbeOptionalOffset == 0)
            return false;

        _buffer.shift(fbeOptionalOffset);
        boolean fbeResult = value.verify();
        _buffer.unshift(fbeOptionalOffset);
        return fbeResult;
    }

    // Get the optional value (being phase)
    public long getBegin()
    {
        if (!hasValue())
            return 0;

        int fbeOptionalOffset = readInt32(FBEOffset() + 1);
        assert (fbeOptionalOffset > 0) : "Model is broken!";
        if (fbeOptionalOffset <= 0)
            return 0;

        _buffer.shift(fbeOptionalOffset);
        return fbeOptionalOffset;
    }

    // Get the optional value (end phase)
    public void getEnd(long fbeBegin)
    {
        _buffer.unshift(fbeBegin);
    }

    // Get the optional value
    public proto.Order get() { return get(null); }
    public proto.Order get(proto.Order defaults)
    {
        long fbeBegin = getBegin();
        if (fbeBegin == 0)
            return defaults;

        proto.Order optional = value.get();

        getEnd(fbeBegin);

        return optional;
    }

    // Set the optional value (begin phase)
    public long setBegin(boolean hasValue)
    {
        assert ((_buffer.getOffset() + FBEOffset() + FBESize()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + FBEOffset() + FBESize()) > _buffer.getSize())
            return 0;

        byte fbeHasValue = (byte)(hasValue ? 1 : 0);
        write(FBEOffset(), fbeHasValue);
        if (fbeHasValue == 0)
            return 0;

        int fbeOptionalSize = (int)value.FBESize();
        int fbeOptionalOffset = (int)(_buffer.allocate(fbeOptionalSize) - _buffer.getOffset());
        assert ((fbeOptionalOffset > 0) && ((_buffer.getOffset() + fbeOptionalOffset + fbeOptionalSize) <= _buffer.getSize())) : "Model is broken!";
        if ((fbeOptionalOffset <= 0) || ((_buffer.getOffset() + fbeOptionalOffset + fbeOptionalSize) > _buffer.getSize()))
            return 0;

        write(FBEOffset() + 1, fbeOptionalOffset);

        _buffer.shift(fbeOptionalOffset);
        return fbeOptionalOffset;
    }

    // Set the optional value (end phase)
    public void setEnd(long fbeBegin)
    {
        _buffer.unshift(fbeBegin);
    }

    // Set the optional value
    public void set(proto.Order optional)
    {
        long fbeBegin = setBegin(optional != null);
        if (fbeBegin == 0)
            return;

        value.set(optional);

        setEnd(fbeBegin);
    }
}
