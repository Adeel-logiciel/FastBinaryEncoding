// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding

package proto.fbe;

import java.io.*;
import java.lang.*;
import java.lang.reflect.*;
import java.math.*;
import java.nio.charset.*;
import java.time.*;
import java.util.*;
import javafx.util.*;

import fbe.*;
import proto.*;

// Fast Binary Encoding Order vector final model class
public final class FinalModelVectorOrder extends FinalModel
{
    private final FinalModelOrder _model;

    public FinalModelVectorOrder(Buffer buffer, long offset)
    {
        super(buffer, offset);
        _model = new FinalModelOrder(buffer, offset);
    }

    // Get the allocation size
    public long FBEAllocationSize(Order[] values)
    {
        long size = 4;
        for (var value : values)
            size += _model.FBEAllocationSize(value);
        return size;
    }
    public long FBEAllocationSize(ArrayList<Order> values)
    {
        long size = 4;
        for (var value : values)
            size += _model.FBEAllocationSize(value);
        return size;
    }
    public long FBEAllocationSize(LinkedList<Order> values)
    {
        long size = 4;
        for (var value : values)
            size += _model.FBEAllocationSize(value);
        return size;
    }
    public long FBEAllocationSize(HashSet<Order> values)
    {
        long size = 4;
        for (var value : values)
            size += _model.FBEAllocationSize(value);
        return size;
    }

    // Check if the vector is valid
    @Override
    public long verify()
    {
        if ((_buffer.getOffset() + FBEOffset() + 4) > _buffer.getSize())
            return Long.MAX_VALUE;

        int fbeVectorSize = readInt32(FBEOffset());

        long size = 4;
        _model.FBEOffset(FBEOffset() + 4);
        for (int i = fbeVectorSize; i-- > 0;)
        {
            long offset = _model.verify();
            if (offset == Long.MAX_VALUE)
                return Long.MAX_VALUE;
            _model.FBEShift(offset);
            size += offset;
        }
        return size;
    }

    // Get the vector
    public Order[] get(Size size)
    {
        assert ((_buffer.getOffset() + FBEOffset() + 4) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + FBEOffset() + 4) > _buffer.getSize())
        {
            size.value = 0;
            return new Order[0];
        }

        long fbeVectorSize = readInt32(FBEOffset());
        if (fbeVectorSize == 0)
        {
            size.value = 4;
            return new Order[0];
        }

        var values = new Order[(int)fbeVectorSize];

        size.value = 4;
        var offset = new Size();
        _model.FBEOffset(FBEOffset() + 4);
        for (long i = 0; i < fbeVectorSize; i++)
        {
            offset.value = 0;
            values[(int)i] = _model.get(offset);
            _model.FBEShift(offset.value);
            size.value += offset.value;
        }
        return values;
    }

    // Get the vector
    public long get(Order[] values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        assert ((_buffer.getOffset() + FBEOffset() + 4) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + FBEOffset() + 4) > _buffer.getSize())
        {
            values = new Order[0];
            return 0;
        }

        long fbeVectorSize = readInt32(FBEOffset());
        if (fbeVectorSize == 0)
        {
            values = new Order[0];
            return 4;
        }

        values = new Order[(int)fbeVectorSize];

        long size = 4;
        var offset = new Size();
        _model.FBEOffset(FBEOffset() + 4);
        for (long i = 0; i < fbeVectorSize; i++)
        {
            offset.value = 0;
            values[(int)i] = _model.get(offset);
            _model.FBEShift(offset.value);
            size += offset.value;
        }
        return size;
    }

    // Get the vector as ArrayList
    public long get(ArrayList<Order> values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        values.clear();

        assert ((_buffer.getOffset() + FBEOffset() + 4) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + FBEOffset() + 4) > _buffer.getSize())
            return 0;

        long fbeVectorSize = readInt32(FBEOffset());
        if (fbeVectorSize == 0)
            return 4;

        values.ensureCapacity((int)fbeVectorSize);

        long size = 4;
        var offset = new Size();
        _model.FBEOffset(FBEOffset() + 4);
        for (long i = 0; i < fbeVectorSize; i++)
        {
            offset.value = 0;
            Order value = _model.get(offset);
            values.add(value);
            _model.FBEShift(offset.value);
            size += offset.value;
        }
        return size;
    }

    // Get the vector as LinkedList
    public long get(LinkedList<Order> values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        values.clear();

        assert ((_buffer.getOffset() + FBEOffset() + 4) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + FBEOffset() + 4) > _buffer.getSize())
            return 0;

        long fbeVectorSize = readInt32(FBEOffset());
        if (fbeVectorSize == 0)
            return 4;

        long size = 4;
        var offset = new Size();
        _model.FBEOffset(FBEOffset() + 4);
        for (long i = 0; i < fbeVectorSize; i++)
        {
            offset.value = 0;
            Order value = _model.get(offset);
            values.add(value);
            _model.FBEShift(offset.value);
            size += offset.value;
        }
        return size;
    }

    // Get the vector as HashSet
    public long get(HashSet<Order> values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        values.clear();

        assert ((_buffer.getOffset() + FBEOffset() + 4) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + FBEOffset() + 4) > _buffer.getSize())
            return 0;

        long fbeVectorSize = readInt32(FBEOffset());
        if (fbeVectorSize == 0)
            return 4;

        long size = 4;
        var offset = new Size();
        _model.FBEOffset(FBEOffset() + 4);
        for (long i = 0; i < fbeVectorSize; i++)
        {
            offset.value = 0;
            Order value = _model.get(offset);
            values.add(value);
            _model.FBEShift(offset.value);
            size += offset.value;
        }
        return size;
    }

    // Set the vector
    public long set(Order[] values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        assert ((_buffer.getOffset() + FBEOffset() + 4) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + FBEOffset() + 4) > _buffer.getSize())
            return 0;

        write(FBEOffset(), (int)values.length);

        long size = 4;
        _model.FBEOffset(FBEOffset() + 4);
        for (var value : values)
        {
            long offset = _model.set(value);
            _model.FBEShift(offset);
            size += offset;
        }
        return size;
    }

    // Set the vector as ArrayList
    public long set(ArrayList<Order> values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        assert ((_buffer.getOffset() + FBEOffset() + 4) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + FBEOffset() + 4) > _buffer.getSize())
            return 0;

        write(FBEOffset(), (int)values.size());

        long size = 4;
        _model.FBEOffset(FBEOffset() + 4);
        for (var value : values)
        {
            long offset = _model.set(value);
            _model.FBEShift(offset);
            size += offset;
        }
        return size;
    }

    // Set the vector as LinkedList
    public long set(LinkedList<Order> values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        assert ((_buffer.getOffset() + FBEOffset() + 4) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + FBEOffset() + 4) > _buffer.getSize())
            return 0;

        write(FBEOffset(), (int)values.size());

        long size = 4;
        _model.FBEOffset(FBEOffset() + 4);
        for (var value : values)
        {
            long offset = _model.set(value);
            _model.FBEShift(offset);
            size += offset;
        }
        return size;
    }

    // Set the vector as HashSet
    public long set(HashSet<Order> values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        assert ((_buffer.getOffset() + FBEOffset() + 4) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + FBEOffset() + 4) > _buffer.getSize())
            return 0;

        write(FBEOffset(), (int)values.size());

        long size = 4;
        _model.FBEOffset(FBEOffset() + 4);
        for (var value : values)
        {
            long offset = _model.set(value);
            _model.FBEShift(offset);
            size += offset;
        }
        return size;
    }
}
