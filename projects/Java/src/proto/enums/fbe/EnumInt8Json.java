// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding

package enums;

import java.io.*;
import java.lang.*;
import java.lang.reflect.*;
import java.math.*;
import java.nio.charset.*;
import java.time.*;
import java.util.*;
import javafx.util.*;
import fbe.*;

import com.google.gson.*;

public final class EnumInt8Json implements JsonSerializer<EnumInt8>, JsonDeserializer<EnumInt8>
{
    @Override
    public JsonElement serialize(EnumInt8 src, Type typeOfSrc, JsonSerializationContext context)
    {
        return new JsonPrimitive(src.getRaw());
    }

    @Override
    public EnumInt8 deserialize(JsonElement json, Type type, JsonDeserializationContext context) throws JsonParseException
    {
        return new EnumInt8(json.getAsJsonPrimitive().getAsByte());
    }
}
