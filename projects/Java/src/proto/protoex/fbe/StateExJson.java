// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding

package protoex;

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

import com.google.gson.*;

public final class StateExJson implements JsonSerializer<StateEx>, JsonDeserializer<StateEx>
{

    @Override
    public JsonElement serialize(StateEx src, Type typeOfSrc, JsonSerializationContext context)
    {
        return new JsonPrimitive(src.getRaw());
    }

    @Override
    public StateEx deserialize(JsonElement json, Type type, JsonDeserializationContext context) throws JsonParseException
    {
        return new StateEx(json.getAsJsonPrimitive().getAsByte());
    }
}
