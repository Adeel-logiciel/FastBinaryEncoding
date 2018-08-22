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

// Fast Binary Encoding StructNested field model class
public final class FieldModelStructNested extends FieldModel
{
    public final FieldModelStructOptional parent;
    public final FieldModelEnumSimple f1000;
    public final FieldModelOptionalEnumSimple f1001;
    public final FieldModelEnumTyped f1002;
    public final FieldModelOptionalEnumTyped f1003;
    public final FieldModelFlagsSimple f1004;
    public final FieldModelOptionalFlagsSimple f1005;
    public final FieldModelFlagsTyped f1006;
    public final FieldModelOptionalFlagsTyped f1007;
    public final FieldModelStructSimple f1008;
    public final FieldModelOptionalStructSimple f1009;
    public final FieldModelStructOptional f1010;
    public final FieldModelOptionalStructOptional f1011;

    public FieldModelStructNested(Buffer buffer, long offset)
    {
        super(buffer, offset);
        parent = new FieldModelStructOptional(buffer, 4 + 4);
        f1000 = new FieldModelEnumSimple(buffer, parent.FBEOffset() + parent.FBEBody() - 4 - 4);
        f1001 = new FieldModelOptionalEnumSimple(buffer, f1000.FBEOffset() + f1000.FBESize());
        f1002 = new FieldModelEnumTyped(buffer, f1001.FBEOffset() + f1001.FBESize());
        f1003 = new FieldModelOptionalEnumTyped(buffer, f1002.FBEOffset() + f1002.FBESize());
        f1004 = new FieldModelFlagsSimple(buffer, f1003.FBEOffset() + f1003.FBESize());
        f1005 = new FieldModelOptionalFlagsSimple(buffer, f1004.FBEOffset() + f1004.FBESize());
        f1006 = new FieldModelFlagsTyped(buffer, f1005.FBEOffset() + f1005.FBESize());
        f1007 = new FieldModelOptionalFlagsTyped(buffer, f1006.FBEOffset() + f1006.FBESize());
        f1008 = new FieldModelStructSimple(buffer, f1007.FBEOffset() + f1007.FBESize());
        f1009 = new FieldModelOptionalStructSimple(buffer, f1008.FBEOffset() + f1008.FBESize());
        f1010 = new FieldModelStructOptional(buffer, f1009.FBEOffset() + f1009.FBESize());
        f1011 = new FieldModelOptionalStructOptional(buffer, f1010.FBEOffset() + f1010.FBESize());
    }

    // Get the field size
    @Override
    public long FBESize() { return 4; }
    // Get the field body size
    public long FBEBody()
    {
        long fbeResult = 4 + 4
            + parent.FBEBody() - 4 - 4
            + f1000.FBESize()
            + f1001.FBESize()
            + f1002.FBESize()
            + f1003.FBESize()
            + f1004.FBESize()
            + f1005.FBESize()
            + f1006.FBESize()
            + f1007.FBESize()
            + f1008.FBESize()
            + f1009.FBESize()
            + f1010.FBESize()
            + f1011.FBESize()
            ;
        return fbeResult;
    }
    // Get the field extra size
    @Override
    public long FBEExtra()
    {
        if ((_buffer.getOffset() + FBEOffset() + FBESize()) > _buffer.getSize())
            return 0;

        int fbeStructOffset = readInt32(FBEOffset());
        if ((fbeStructOffset == 0) || ((_buffer.getOffset() + fbeStructOffset + 4) > _buffer.getSize()))
            return 0;

        _buffer.shift(fbeStructOffset);

        long fbeResult = FBEBody()
            + parent.FBEExtra()
            + f1000.FBEExtra()
            + f1001.FBEExtra()
            + f1002.FBEExtra()
            + f1003.FBEExtra()
            + f1004.FBEExtra()
            + f1005.FBEExtra()
            + f1006.FBEExtra()
            + f1007.FBEExtra()
            + f1008.FBEExtra()
            + f1009.FBEExtra()
            + f1010.FBEExtra()
            + f1011.FBEExtra()
            ;

        _buffer.unshift(fbeStructOffset);

        return fbeResult;
    }
    // Get the field type
    public long FBEType() { return 112; }

    // Check if the struct value is valid
    @Override
    public boolean verify() { return verify(true); }
    public boolean verify(boolean fbeVerifyType)
    {
        if ((_buffer.getOffset() + FBEOffset() + FBESize()) > _buffer.getSize())
            return true;

        int fbeStructOffset = readInt32(FBEOffset());
        if ((fbeStructOffset == 0) || ((_buffer.getOffset() + fbeStructOffset + 4 + 4) > _buffer.getSize()))
            return false;

        int fbeStructSize = readInt32(fbeStructOffset);
        if (fbeStructSize < 4 + 4)
            return false;

        int fbeStructType = readInt32(fbeStructOffset + 4);
        if (fbeVerifyType && (fbeStructType != FBEType()))
            return false;

        _buffer.shift(fbeStructOffset);
        boolean fbeResult = verifyFields(fbeStructSize);
        _buffer.unshift(fbeStructOffset);
        return fbeResult;
    }

    // Check if the struct fields are valid
    public boolean verifyFields(long fbeStructSize)
    {
        long fbeCurrentSize = 4 + 4;

        if ((fbeCurrentSize + parent.FBEBody() - 4 - 4) > fbeStructSize)
            return true;
        if (!parent.verifyFields(fbeStructSize))
            return false;
        fbeCurrentSize += parent.FBEBody() - 4 - 4;

        if ((fbeCurrentSize + f1000.FBESize()) > fbeStructSize)
            return true;
        if (!f1000.verify())
            return false;
        fbeCurrentSize += f1000.FBESize();

        if ((fbeCurrentSize + f1001.FBESize()) > fbeStructSize)
            return true;
        if (!f1001.verify())
            return false;
        fbeCurrentSize += f1001.FBESize();

        if ((fbeCurrentSize + f1002.FBESize()) > fbeStructSize)
            return true;
        if (!f1002.verify())
            return false;
        fbeCurrentSize += f1002.FBESize();

        if ((fbeCurrentSize + f1003.FBESize()) > fbeStructSize)
            return true;
        if (!f1003.verify())
            return false;
        fbeCurrentSize += f1003.FBESize();

        if ((fbeCurrentSize + f1004.FBESize()) > fbeStructSize)
            return true;
        if (!f1004.verify())
            return false;
        fbeCurrentSize += f1004.FBESize();

        if ((fbeCurrentSize + f1005.FBESize()) > fbeStructSize)
            return true;
        if (!f1005.verify())
            return false;
        fbeCurrentSize += f1005.FBESize();

        if ((fbeCurrentSize + f1006.FBESize()) > fbeStructSize)
            return true;
        if (!f1006.verify())
            return false;
        fbeCurrentSize += f1006.FBESize();

        if ((fbeCurrentSize + f1007.FBESize()) > fbeStructSize)
            return true;
        if (!f1007.verify())
            return false;
        fbeCurrentSize += f1007.FBESize();

        if ((fbeCurrentSize + f1008.FBESize()) > fbeStructSize)
            return true;
        if (!f1008.verify())
            return false;
        fbeCurrentSize += f1008.FBESize();

        if ((fbeCurrentSize + f1009.FBESize()) > fbeStructSize)
            return true;
        if (!f1009.verify())
            return false;
        fbeCurrentSize += f1009.FBESize();

        if ((fbeCurrentSize + f1010.FBESize()) > fbeStructSize)
            return true;
        if (!f1010.verify())
            return false;
        fbeCurrentSize += f1010.FBESize();

        if ((fbeCurrentSize + f1011.FBESize()) > fbeStructSize)
            return true;
        if (!f1011.verify())
            return false;
        fbeCurrentSize += f1011.FBESize();

        return true;
    }

    // Get the struct value (begin phase)
    public long getBegin()
    {
        if ((_buffer.getOffset() + FBEOffset() + FBESize()) > _buffer.getSize())
            return 0;

        int fbeStructOffset = readInt32(FBEOffset());
        assert ((fbeStructOffset > 0) && ((_buffer.getOffset() + fbeStructOffset + 4 + 4) <= _buffer.getSize())) : "Model is broken!";
        if ((fbeStructOffset == 0) || ((_buffer.getOffset() + fbeStructOffset + 4 + 4) > _buffer.getSize()))
            return 0;

        int fbeStructSize = readInt32(fbeStructOffset);
        assert (fbeStructSize >= 4 + 4) : "Model is broken!";
        if (fbeStructSize < 4 + 4)
            return 0;

        _buffer.shift(fbeStructOffset);
        return fbeStructOffset;
    }

    // Get the struct value (end phase)
    public void getEnd(long fbeBegin)
    {
        _buffer.unshift(fbeBegin);
    }

    // Get the struct value
    public StructNested get() { return get(new StructNested()); }
    public StructNested get(StructNested fbeValue)
    {
        long fbeBegin = getBegin();
        if (fbeBegin == 0)
            return fbeValue;

        int fbeStructSize = readInt32(0);
        getFields(fbeValue, fbeStructSize);
        getEnd(fbeBegin);
        return fbeValue;
    }

    // Get the struct fields values
    public void getFields(StructNested fbeValue, long fbeStructSize)
    {
        long fbeCurrentSize = 4 + 4;

        if ((fbeCurrentSize + parent.FBEBody() - 4 - 4) <= fbeStructSize)
            parent.getFields(fbeValue, fbeStructSize);
        fbeCurrentSize += parent.FBEBody() - 4 - 4;

        if ((fbeCurrentSize + f1000.FBESize()) <= fbeStructSize)
            fbeValue.f1000 = f1000.get();
        else
            fbeValue.f1000 = new EnumSimple();
        fbeCurrentSize += f1000.FBESize();

        if ((fbeCurrentSize + f1001.FBESize()) <= fbeStructSize)
            fbeValue.f1001 = f1001.get();
        else
            fbeValue.f1001 = null;
        fbeCurrentSize += f1001.FBESize();

        if ((fbeCurrentSize + f1002.FBESize()) <= fbeStructSize)
            fbeValue.f1002 = f1002.get(EnumTyped.ENUM_VALUE_2);
        else
            fbeValue.f1002 = EnumTyped.ENUM_VALUE_2;
        fbeCurrentSize += f1002.FBESize();

        if ((fbeCurrentSize + f1003.FBESize()) <= fbeStructSize)
            fbeValue.f1003 = f1003.get(null);
        else
            fbeValue.f1003 = null;
        fbeCurrentSize += f1003.FBESize();

        if ((fbeCurrentSize + f1004.FBESize()) <= fbeStructSize)
            fbeValue.f1004 = f1004.get();
        else
            fbeValue.f1004 = new FlagsSimple();
        fbeCurrentSize += f1004.FBESize();

        if ((fbeCurrentSize + f1005.FBESize()) <= fbeStructSize)
            fbeValue.f1005 = f1005.get();
        else
            fbeValue.f1005 = null;
        fbeCurrentSize += f1005.FBESize();

        if ((fbeCurrentSize + f1006.FBESize()) <= fbeStructSize)
            fbeValue.f1006 = f1006.get(FlagsTyped.fromSet(EnumSet.of(FlagsTyped.FLAG_VALUE_2.getEnum(), FlagsTyped.FLAG_VALUE_4.getEnum(), FlagsTyped.FLAG_VALUE_6.getEnum())));
        else
            fbeValue.f1006 = FlagsTyped.fromSet(EnumSet.of(FlagsTyped.FLAG_VALUE_2.getEnum(), FlagsTyped.FLAG_VALUE_4.getEnum(), FlagsTyped.FLAG_VALUE_6.getEnum()));
        fbeCurrentSize += f1006.FBESize();

        if ((fbeCurrentSize + f1007.FBESize()) <= fbeStructSize)
            fbeValue.f1007 = f1007.get(null);
        else
            fbeValue.f1007 = null;
        fbeCurrentSize += f1007.FBESize();

        if ((fbeCurrentSize + f1008.FBESize()) <= fbeStructSize)
            fbeValue.f1008 = f1008.get();
        else
            fbeValue.f1008 = new StructSimple();
        fbeCurrentSize += f1008.FBESize();

        if ((fbeCurrentSize + f1009.FBESize()) <= fbeStructSize)
            fbeValue.f1009 = f1009.get();
        else
            fbeValue.f1009 = null;
        fbeCurrentSize += f1009.FBESize();

        if ((fbeCurrentSize + f1010.FBESize()) <= fbeStructSize)
            fbeValue.f1010 = f1010.get();
        else
            fbeValue.f1010 = new StructOptional();
        fbeCurrentSize += f1010.FBESize();

        if ((fbeCurrentSize + f1011.FBESize()) <= fbeStructSize)
            fbeValue.f1011 = f1011.get(null);
        else
            fbeValue.f1011 = null;
        fbeCurrentSize += f1011.FBESize();
    }

    // Set the struct value (begin phase)
    public long setBegin()
    {
        assert ((_buffer.getOffset() + FBEOffset() + FBESize()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + FBEOffset() + FBESize()) > _buffer.getSize())
            return 0;

        int fbeStructSize = (int)FBEBody();
        int fbeStructOffset = (int)(_buffer.allocate(fbeStructSize) - _buffer.getOffset());
        assert ((fbeStructOffset > 0) && ((_buffer.getOffset() + fbeStructOffset + fbeStructSize) <= _buffer.getSize())) : "Model is broken!";
        if ((fbeStructOffset <= 0) || ((_buffer.getOffset() + fbeStructOffset + fbeStructSize) > _buffer.getSize()))
            return 0;

        write(FBEOffset(), fbeStructOffset);
        write(fbeStructOffset, fbeStructSize);
        write(fbeStructOffset + 4, (int)FBEType());

        _buffer.shift(fbeStructOffset);
        return fbeStructOffset;
    }

    // Set the struct value (end phase)
    public void setEnd(long fbeBegin)
    {
        _buffer.unshift(fbeBegin);
    }

    // Set the struct value
    public void set(StructNested fbeValue)
    {
        long fbeBegin = setBegin();
        if (fbeBegin == 0)
            return;

        setFields(fbeValue);
        setEnd(fbeBegin);
    }

    // Set the struct fields values
    public void setFields(StructNested fbeValue)
    {
        parent.setFields(fbeValue);
        f1000.set(fbeValue.f1000);
        f1001.set(fbeValue.f1001);
        f1002.set(fbeValue.f1002);
        f1003.set(fbeValue.f1003);
        f1004.set(fbeValue.f1004);
        f1005.set(fbeValue.f1005);
        f1006.set(fbeValue.f1006);
        f1007.set(fbeValue.f1007);
        f1008.set(fbeValue.f1008);
        f1009.set(fbeValue.f1009);
        f1010.set(fbeValue.f1010);
        f1011.set(fbeValue.f1011);
    }
}
