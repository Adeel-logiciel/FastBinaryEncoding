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

// Fast Binary Encoding Bytes array final model class
public final class FinalModelArrayBytes extends FinalModel
{
    private final FinalModelBytes _model;
    private final long _size;

    public FinalModelArrayBytes(Buffer buffer, long offset, long size)
    {
        super(buffer, offset);
        _model = new FinalModelBytes(buffer, offset);
        _size = size;
    }

    // Get the allocation size
    public long FBEAllocationSize(byte[][] values)
    {
        long size = 0;
        for (long i = 0; (i < values.length) && (i < _size); i++)
            size += _model.FBEAllocationSize(values[(int)i]);
        return size;
    }
    public long FBEAllocationSize(ArrayList<byte[]> values)
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
    public byte[][] get(Size size)
    {
        var values = new byte[(int)_size][];

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
    public long get(byte[][] values)
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
    public long get(ArrayList<byte[]> values)
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
            byte[] value = _model.get(offset);
            values.add(value);
            _model.FBEShift(offset.value);
            size += offset.value;
        }
        return size;
    }

    // Set the array
    public long set(byte[][] values)
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
    public long set(ArrayList<byte[]> values)
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
