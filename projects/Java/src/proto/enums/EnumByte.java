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

public final class EnumByte implements Comparable<EnumByte>
{
    public static final EnumByte ENUM_VALUE_0 = new EnumByte(EnumByteEnum.ENUM_VALUE_0);
    public static final EnumByte ENUM_VALUE_1 = new EnumByte(EnumByteEnum.ENUM_VALUE_1);
    public static final EnumByte ENUM_VALUE_2 = new EnumByte(EnumByteEnum.ENUM_VALUE_2);
    public static final EnumByte ENUM_VALUE_3 = new EnumByte(EnumByteEnum.ENUM_VALUE_3);
    public static final EnumByte ENUM_VALUE_4 = new EnumByte(EnumByteEnum.ENUM_VALUE_4);
    public static final EnumByte ENUM_VALUE_5 = new EnumByte(EnumByteEnum.ENUM_VALUE_5);

    private EnumByteEnum value = EnumByteEnum.values()[0];

    public EnumByte() {}
    public EnumByte(byte value) { setEnum(value); }
    public EnumByte(EnumByteEnum value) { setEnum(value); }
    public EnumByte(EnumByte value) { setEnum(value); }

    public EnumByteEnum getEnum() { return value; }
    public byte getRaw() { return value.getRaw(); }

    public void setDefault() { setEnum((byte)0); }

    public void setEnum(byte value) { this.value = EnumByteEnum.mapValue(value); }
    public void setEnum(EnumByteEnum value) { this.value = value; }
    public void setEnum(EnumByte value) { this.value = value.value; }

    @Override
    public int compareTo(EnumByte other)
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

        if (!EnumByte.class.isAssignableFrom(obj.getClass()))
            return false;

        final EnumByte other = (EnumByte)obj;

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
