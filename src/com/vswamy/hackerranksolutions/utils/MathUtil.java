package com.vswamy.hackerranksolutions.utils;


/**
 * @author vswamy
 * 
 */

public enum MathUtil
{
    INSTANCE;
    public int  gcd(int a, int b)
    {
        if(a == b) return a;
        if(a > b) return gcd(a-b, b);
        return gcd(a, b-a);
    }
}
