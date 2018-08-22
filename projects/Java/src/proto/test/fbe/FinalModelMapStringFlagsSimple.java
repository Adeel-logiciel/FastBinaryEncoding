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

// Fast Binary Encoding String->FlagsSimple map final model class
public final class FinalModelMapStringFlagsSimple extends FinalModel
{
    private final FinalModelString _modelKey;
    private final FinalModelFlagsSimple _modelValue;

    public FinalModelMapStringFlagsSimple(Buffer buffer, long offset)
    {
        super(buffer, offset);
        _modelKey = new FinalModelString(buffer, offset);
        _modelValue = new FinalModelFlagsSimple(buffer, offset);
    }

    // Get the allocation size
    public long FBEAllocationSize(TreeMap<String, FlagsSimple> values)
    {
        long size = 4;
        for (var value : values.entrySet())
        {
            size += _modelKey.FBEAllocationSize(value.getKey());
            size += _modelValue.FBEAllocationSize(value.getValue());
        }
        return size;
    }
    public long FBEAllocationSize(HashMap<String, FlagsSimple> values)
    {
        long size = 4;
        for (var value : values.entrySet())
        {
            size += _modelKey.FBEAllocationSize(value.getKey());
            size += _modelValue.FBEAllocationSize(value.getValue());
        }
        return size;
    }

    // Check if the map is valid
    @Override
    public long verify()
    {
        if ((_buffer.getOffset() + FBEOffset() + 4) > _buffer.getSize())
            return Long.MAX_VALUE;

        int fbeMapSize = readInt32(FBEOffset());

        long size = 4;
        _modelKey.FBEOffset(FBEOffset() + 4);
        _modelValue.FBEOffset(FBEOffset() + 4);
        for (int i = fbeMapSize; i-- > 0;)
        {
            long offsetKey = _modelKey.verify();
            if (offsetKey == Long.MAX_VALUE)
                return Long.MAX_VALUE;
            _modelKey.FBEShift(offsetKey);
            _modelValue.FBEShift(offsetKey);
            size += offsetKey;
            long offsetValue = _modelValue.verify();
            if (offsetValue == Long.MAX_VALUE)
                return Long.MAX_VALUE;
            _modelKey.FBEShift(offsetValue);
            _modelValue.FBEShift(offsetValue);
            size += offsetValue;
        }
        return size;
    }

    // Get the map as TreeMap
    public long get(TreeMap<String, FlagsSimple> values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        values.clear();

        assert ((_buffer.getOffset() + FBEOffset() + 4) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + FBEOffset() + 4) > _buffer.getSize())
            return 0;

        long fbeMapSize = readInt32(FBEOffset());
        if (fbeMapSize == 0)
            return 4;

        long size = 4;
        var offset = new Size();
        _modelKey.FBEOffset(FBEOffset() + 4);
        _modelValue.FBEOffset(FBEOffset() + 4);
        for (long i = fbeMapSize; i-- > 0;)
        {
            offset.value = 0;
            String key = _modelKey.get(offset);
            _modelKey.FBEShift(offset.value);
            _modelValue.FBEShift(offset.value);
            size += offset.value;
            offset.value = 0;
            FlagsSimple value = _modelValue.get(offset);
            _modelKey.FBEShift(offset.value);
            _modelValue.FBEShift(offset.value);
            size += offset.value;
            values.put(key, value);
        }
        return size;
    }

    // Get the map as HashMap
    public long get(HashMap<String, FlagsSimple> values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        values.clear();

        assert ((_buffer.getOffset() + FBEOffset() + 4) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + FBEOffset() + 4) > _buffer.getSize())
            return 0;

        long fbeMapSize = readInt32(FBEOffset());
        if (fbeMapSize == 0)
            return 4;

        long size = 4;
        var offset = new Size();
        _modelKey.FBEOffset(FBEOffset() + 4);
        _modelValue.FBEOffset(FBEOffset() + 4);
        for (long i = fbeMapSize; i-- > 0;)
        {
            offset.value = 0;
            String key = _modelKey.get(offset);
            _modelKey.FBEShift(offset.value);
            _modelValue.FBEShift(offset.value);
            size += offset.value;
            offset.value = 0;
            FlagsSimple value = _modelValue.get(offset);
            _modelKey.FBEShift(offset.value);
            _modelValue.FBEShift(offset.value);
            size += offset.value;

            values.put(key, value);
        }
        return size;
    }

    // Set the map as TreeMap
    public long set(TreeMap<String, FlagsSimple> values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        assert ((_buffer.getOffset() + FBEOffset() + 4) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + FBEOffset() + 4) > _buffer.getSize())
            return 0;

        write(FBEOffset(), (int)values.size());

        long size = 4;
        _modelKey.FBEOffset(FBEOffset() + 4);
        _modelValue.FBEOffset(FBEOffset() + 4);
        for (var value : values.entrySet())
        {
            long offsetKey = _modelKey.set(value.getKey());
            _modelKey.FBEShift(offsetKey);
            _modelValue.FBEShift(offsetKey);
            long offsetValue = _modelValue.set(value.getValue());
            _modelKey.FBEShift(offsetValue);
            _modelValue.FBEShift(offsetValue);
            size += offsetKey + offsetValue;
        }
        return size;
    }

    // Set the vector as HashMap
    public long set(HashMap<String, FlagsSimple> values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        assert ((_buffer.getOffset() + FBEOffset() + 4) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + FBEOffset() + 4) > _buffer.getSize())
            return 0;

        write(FBEOffset(), (int)values.size());

        long size = 4;
        _modelKey.FBEOffset(FBEOffset() + 4);
        _modelValue.FBEOffset(FBEOffset() + 4);
        for (var value : values.entrySet())
        {
            long offsetKey = _modelKey.set(value.getKey());
            _modelKey.FBEShift(offsetKey);
            _modelValue.FBEShift(offsetKey);
            long offsetValue = _modelValue.set(value.getValue());
            _modelKey.FBEShift(offsetValue);
            _modelValue.FBEShift(offsetValue);
            size += offsetKey + offsetValue;
        }
        return size;
    }
}
