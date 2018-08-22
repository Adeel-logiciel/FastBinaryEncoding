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

// Fast Binary Encoding StructSet model class
public final class StructSetModel extends Model
{
    public final FieldModelStructSet model;

    public StructSetModel() { model = new FieldModelStructSet(getBuffer(), 4); }
    public StructSetModel(Buffer buffer) { super(buffer); model = new FieldModelStructSet(getBuffer(), 4); }

    // Get the model size
    public long FBESize() { return model.FBESize() + model.FBEExtra(); }
    // Get the model type
    public long FBEType() { return model.FBEType(); }

    // Check if the struct value is valid
    public boolean verify()
    {
        if ((getBuffer().getOffset() + model.FBEOffset() - 4) > getBuffer().getSize())
            return false;

        int fbeFullSize = readInt32(model.FBEOffset() - 4);
        if (fbeFullSize < model.FBESize())
            return false;

        return model.verify();
    }

    // Create a new model (begin phase)
    public long createBegin()
    {
        long fbeBegin = getBuffer().allocate(4 + model.FBESize());
        return fbeBegin;
    }

    // Create a new model (end phase)
    public long createEnd(long fbeBegin)
    {
        long fbeEnd = getBuffer().getSize();
        int fbeFullSize = (int)(fbeEnd - fbeBegin);
        write(model.FBEOffset() - 4, fbeFullSize);
        return fbeFullSize;
    }

    // Serialize the struct value
    public long serialize(StructSet value)
    {
        long fbeBegin = createBegin();
        model.set(value);
        long fbeFullSize = createEnd(fbeBegin);
        return fbeFullSize;
    }

    // Deserialize the struct value
    public StructSet deserialize() { var value = new StructSet(); deserialize(value); return value; }
    public long deserialize(StructSet value)
    {
        if ((getBuffer().getOffset() + model.FBEOffset() - 4) > getBuffer().getSize())
        {
            value = new StructSet();
            return 0;
        }

        int fbeFullSize = readInt32(model.FBEOffset() - 4);
        assert (fbeFullSize >= model.FBESize()) : "Model is broken!";
        if (fbeFullSize < model.FBESize())
        {
            value = new StructSet();
            return 0;
        }

        value = model.get(value);
        return fbeFullSize;
    }

    // Move to the next struct value
    public void next(long prev)
    {
        model.FBEShift(prev);
    }
}
