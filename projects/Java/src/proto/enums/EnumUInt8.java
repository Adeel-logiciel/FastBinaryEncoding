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

public final class EnumUInt8 implements Comparable<EnumUInt8>
{
    public static final EnumUInt8 ENUM_VALUE_0 = new EnumUInt8(EnumUInt8Enum.ENUM_VALUE_0);
    public static final EnumUInt8 ENUM_VALUE_1 = new EnumUInt8(EnumUInt8Enum.ENUM_VALUE_1);
    public static final EnumUInt8 ENUM_VALUE_2 = new EnumUInt8(EnumUInt8Enum.ENUM_VALUE_2);
    public static final EnumUInt8 ENUM_VALUE_3 = new EnumUInt8(EnumUInt8Enum.ENUM_VALUE_3);
    public static final EnumUInt8 ENUM_VALUE_4 = new EnumUInt8(EnumUInt8Enum.ENUM_VALUE_4);
    public static final EnumUInt8 ENUM_VALUE_5 = new EnumUInt8(EnumUInt8Enum.ENUM_VALUE_5);

    private EnumUInt8Enum value = EnumUInt8Enum.values()[0];

    public EnumUInt8() {}
    public EnumUInt8(byte value) { setEnum(value); }
    public EnumUInt8(EnumUInt8Enum value) { setEnum(value); }
    public EnumUInt8(EnumUInt8 value) { setEnum(value); }

    public EnumUInt8Enum getEnum() { return value; }
    public byte getRaw() { return value.getRaw(); }

    public void setDefault() { setEnum((byte)0); }

    public void setEnum(byte value) { this.value = EnumUInt8Enum.mapValue(value); }
    public void setEnum(EnumUInt8Enum value) { this.value = value; }
    public void setEnum(EnumUInt8 value) { this.value = value.value; }

    @Override
    public int compareTo(EnumUInt8 other)
    {
        if (value == null)
            return -1;
        if (other.value == null)
            return 1;
        return (int)(value.getRaw() - other.value.getRaw());
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == null)
            return false;

        if (!EnumUInt8.class.isAssignableFrom(obj.getClass()))
            return false;

        final EnumUInt8 other = (EnumUInt8)obj;

        if ((value == null) || (other.value == null))
            return false;
        if (value.getRaw() != other.value.getRaw())
            return false;
        return true;
    }

    @Override
    public int hashCode()
    {
        int hash = 17;
        hash = hash * 31 + ((value != null) ? value.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() { return (value != null) ? value.toString() : "<unknown>"; }
}
