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

// Fast Binary Encoding EnumSimple field model class
public final class FieldModelEnumSimple extends FieldModel
{
    public FieldModelEnumSimple(Buffer buffer, long offset) { super(buffer, offset); }

    // Get the field size
    @Override
    public long FBESize() { return 4; }

    // Get the value
    public EnumSimple get() { return get(new EnumSimple()); }
    public EnumSimple get(EnumSimple defaults)
    {
        if ((_buffer.getOffset() + FBEOffset() + FBESize()) > _buffer.getSize())
            return defaults;

        return new EnumSimple(readInt32(FBEOffset()));
    }

    // Set the value
    public void set(EnumSimple value)
    {
        assert ((_buffer.getOffset() + FBEOffset() + FBESize()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + FBEOffset() + FBESize()) > _buffer.getSize())
            return;

        write(FBEOffset(), value.getRaw());
    }
}
