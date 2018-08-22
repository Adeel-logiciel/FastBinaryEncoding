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

// Fast Binary Encoding OptionalByte array final model class
public final class FinalModelArrayOptionalByte extends FinalModel
{
    private final FinalModelOptionalByte _model;
    private final long _size;

    public FinalModelArrayOptionalByte(Buffer buffer, long offset, long size)
    {
        super(buffer, offset);
        _model = new FinalModelOptionalByte(buffer, offset);
        _size = size;
    }

    // Get the allocation size
    public long FBEAllocationSize(Byte[] values)
    {
        long size = 0;
        for (long i = 0; (i < values.length) && (i < _size); i++)
            size += _model.FBEAllocationSize(values[(int)i]);
        return size;
    }
    public long FBEAllocationSize(ArrayList<Byte> values)
    {
        long size = 0;
        for (long i = 0; (i < values.size()) && (i < _size); i++)
            size += _model.FBEAllocationSize(values.get((int)i));
        return size;
    }

    // Check if the array is valid
    @Override
    public long verify()
    {
        if ((_buffer.getOffset() + FBEOffset()) > _buffer.getSize())
            return Long.MAX_VALUE;

        long size = 0;
        _model.FBEOffset(FBEOffset());
        for (long i = _size; i-- > 0;)
        {
            long offset = _model.verify();
            if (offset == Long.MAX_VALUE)
                return Long.MAX_VALUE;
            _model.FBEShift(offset);
            size += offset;
        }
        return size;
    }

    // Get the array
    public Byte[] get(Size size)
    {
        var values = new Byte[(int)_size];

        assert ((_buffer.getOffset() + FBEOffset()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + FBEOffset()) > _buffer.getSize())
        {
            size.value = 0;
            return values;
        }

        size.value = 0;
        var offset = new Size();
        _model.FBEOffset(FBEOffset());
        for (long i = 0; i < _size; i++)
        {
            offset.value = 0;
            values[(int)i] = _model.get(offset);
            _model.FBEShift(offset.value);
            size.value += offset.value;
        }
        return values;
    }

    // Get the array
    public long get(Byte[] values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        assert ((_buffer.getOffset() + FBEOffset()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + FBEOffset()) > _buffer.getSize())
            return 0;

        long size = 0;
        var offset = new Size();
        _model.FBEOffset(FBEOffset());
        for (long i = 0; (i < values.length) && (i < _size); i++)
        {
            offset.value = 0;
            values[(int)i] = _model.get(offset);
            _model.FBEShift(offset.value);
            size += offset.value;
        }
        return size;
    }

    // Get the array as ArrayList
    public long get(ArrayList<Byte> values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        values.clear();

        assert ((_buffer.getOffset() + FBEOffset()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + FBEOffset()) > _buffer.getSize())
            return 0;

        values.ensureCapacity((int)_size);

        long size = 0;
        var offset = new Size();
        _model.FBEOffset(FBEOffset());
        for (long i = _size; i-- > 0;)
        {
            offset.value = 0;
            Byte value = _model.get(offset);
            values.add(value);
            _model.FBEShift(offset.value);
            size += offset.value;
        }
        return size;
    }

    // Set the array
    public long set(Byte[] values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        assert ((_buffer.getOffset() + FBEOffset()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + FBEOffset()) > _buffer.getSize())
            return 0;

        long size = 0;
        _model.FBEOffset(FBEOffset());
        for (long i = 0; (i < values.length) && (i < _size); i++)
        {
            long offset = _model.set(values[(int)i]);
            _model.FBEShift(offset);
            size += offset;
        }
        return size;
    }

    // Set the array as List
    public long set(ArrayList<Byte> values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        assert ((_buffer.getOffset() + FBEOffset()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + FBEOffset()) > _buffer.getSize())
            return 0;

        long size = 0;
        _model.FBEOffset(FBEOffset());
        for (long i = 0; (i < values.size()) && (i < _size); i++)
        {
            long offset = _model.set(values.get((int)i));
            _model.FBEShift(offset);
            size += offset;
        }
        return size;
    }
}
