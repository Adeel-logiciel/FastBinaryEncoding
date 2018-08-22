// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding

package protoex.fbe;

import java.io.*;
import java.lang.*;
import java.lang.reflect.*;
import java.math.*;
import java.nio.charset.*;
import java.time.*;
import java.util.*;
import javafx.util.*;

import fbe.*;
import protoex.*;

// Fast Binary Encoding OrderSide final model class
public final class FinalModelOrderSide extends FinalModel
{
    public FinalModelOrderSide(Buffer buffer, long offset) { super(buffer, offset); }

    // Get the allocation size
    public long FBEAllocationSize(OrderSide value) { return FBESize(); }

    // Get the final size
    @Override
    public long FBESize() { return 1; }

    // Check if the value is valid
    @Override
    public long verify()
    {
        if ((_buffer.getOffset() + FBEOffset() + FBESize()) > _buffer.getSize())
            return Long.MAX_VALUE;

        return FBESize();
    }

    // Get the value
    public OrderSide get(Size size)
    {
        if ((_buffer.getOffset() + FBEOffset() + FBESize()) > _buffer.getSize())
            return new OrderSide();

        size.value = FBESize();
        return new OrderSide(readByte(FBEOffset()));
    }

    // Set the value
    public long set(OrderSide value)
    {
        assert ((_buffer.getOffset() + FBEOffset() + FBESize()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + FBEOffset() + FBESize()) > _buffer.getSize())
            return 0;

        write(FBEOffset(), value.getRaw());
        return FBESize();
    }
}
