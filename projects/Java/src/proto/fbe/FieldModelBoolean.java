// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding

package fbe;

import java.io.*;
import java.lang.*;
import java.lang.reflect.*;
import java.math.*;
import java.nio.charset.*;
import java.time.*;
import java.util.*;
import javafx.util.*;

// Fast Binary Encoding boolean field model class
public final class FieldModelBoolean extends FieldModel
{
    public FieldModelBoolean(Buffer buffer, long offset) { super(buffer, offset); }

    // Get the field size
    @Override
    public long FBESize() { return 1; }

    // Get the value
    public boolean get() { return get(false); }
    public boolean get(boolean defaults)
    {
        if ((_buffer.getOffset() + FBEOffset() + FBESize()) > _buffer.getSize())
            return defaults;

        return readBoolean(FBEOffset());
    }

    // Set the value
    public void set(boolean value)
    {
        assert ((_buffer.getOffset() + FBEOffset() + FBESize()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + FBEOffset() + FBESize()) > _buffer.getSize())
            return;

        write(FBEOffset(), value);
    }
}
