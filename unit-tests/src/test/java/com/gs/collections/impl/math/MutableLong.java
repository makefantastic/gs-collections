package com.gs.collections.impl.math;

public final class MutableLong extends Number implements Comparable<MutableLong>
{
    private static final long serialVersionUID = 1L;
    private long value = 0L;

    public MutableLong(long value)
    {
        this.value = value;
    }

    public MutableLong()
    {
        this(0L);
    }

    public int compareTo(MutableLong other)
    {
        return Long.compare(this.value, other.value);
    }

    @Override
    public boolean equals(Object other)
    {
        if (this == other)
        {
            return true;
        }
        if (other == null || this.getClass() != other.getClass())
        {
            return false;
        }
        return this.value == ((MutableLong) other).value;
    }

    @Override
    public int hashCode()
    {
        return (int) (this.value ^ (this.value >>> 32));
    }

    public void setValue(long value)
    {
        this.value = value;
    }

    public MutableLong add(double number)
    {
        this.value += number;
        return this;
    }

    public MutableLong subtract(double number)
    {
        this.value -= number;
        return this;
    }

    public MutableLong multiply(double number)
    {
        this.value *= number;
        return this;
    }

    public MutableLong divide(double number)
    {
        this.value /= number;
        return this;
    }

    public MutableLong min(long number)
    {
        this.value = Math.min(this.value, number);
        return this;
    }

    public MutableLong max(long number)
    {
        this.value = Math.max(this.value, number);
        return this;
    }

    public MutableLong abs()
    {
        this.value = Math.abs(this.value);
        return this;
    }

    public Long toLong()
    {
        return Long.valueOf(this.value);
    }

    @Override
    public int intValue()
    {
        return (int) this.value;
    }

    @Override
    public long longValue()
    {
        return this.value;
    }

    @Override
    public float floatValue()
    {
        return (float) this.value;
    }

    @Override
    public double doubleValue()
    {
        return (double) this.value;
    }

    @Override
    public String toString()
    {
        return "MutableLong{" +
            "value=" + this.value +
            '}';
    }
}
