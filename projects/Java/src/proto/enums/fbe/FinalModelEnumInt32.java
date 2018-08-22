// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding

package enums.fbe;

import java.io.*;
import java.lang.*;
import java.lang.reflect.*;
import java.math.*;
import java.nio.charset.*;
import java.time.*;
import java.util.*;
import javafx.util.*;

import fbe.*;
import enums.*;

// Fast Binary Encoding EnumInt32 final model class
public final class FinalModelEnumInt32 extends FinalModel
{
    public FinalModelEnumInt32(Buffer buffer, long offset) { super(buffer, offset); }

    // Get the allocation size
    public long FBEAllocationSize(EnumInt32 value) { return FBESize(); }

    // Get the final size
    @Override
    public long FBESize() { return 4; }

    // Check if the value is valid
    @Override
    public long verify()
    {
        if ((_buffer.getOffset() + FBEOffset() + FBESize()) > _buffer.getSize())
            return Long.MAX_VALUE;

        return FBESize();
    }

    // Get the value
    public EnumInt32 get(Size size)
    {
        if ((_buffer.getOffset() + FBEOffset() + FBESize()) > _buffer.getSize())
            return new EnumInt32();

        size.value = FBESize();
        return new EnumInt32(readInt32(FBEOffset()));
    }

    // Set the value
    public long set(EnumInt32 value)
    {
        assert ((_buffer.getOffset() + FBEOffset() + FBESize()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + FBEOffset() + FBESize()) > _buffer.getSize())
            return 0;

        write(FBEOffset(), value.getRaw());
        return FBESize();
    }
}
