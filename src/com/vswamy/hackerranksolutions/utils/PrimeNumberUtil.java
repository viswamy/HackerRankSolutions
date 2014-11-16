package com.vswamy.hackerranksolutions.utils;

import java.util.HashMap;

public enum PrimeNumberUtil
{
    INSTANCE;
    public HashMap<Integer, Integer> getPrimeFactorization(int n)
    {
        if (n < 2) return null;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int curPrime = 2;
        while (n > 1)
        {
            if (n % curPrime == 0)
            {
                if (map.containsKey(curPrime))
                {
                    int value = map.get(curPrime);
                    map.put(curPrime, value + 1);
                }
                else
                {
                    map.put(curPrime, 1);
                }
                n = n / curPrime;
            }
            else
            {
                curPrime++;
            }
        }
        return map;
    }

    public HashMap<Integer, Integer> getPrimeFactorizationForFactorial(int n)
    {
        if (n < 2) return null;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> temp;
        for (int i = 2; i <= n; i++)
        {
            temp = getPrimeFactorization(i);
            for (Integer key : temp.keySet())
            {
                int curvalue = temp.get(key);
                if (map.containsKey(key))
                {
                    int mapvalue = map.get(key);
                    map.put(key, mapvalue + curvalue);
                }
                else
                {
                    map.put(key, curvalue);
                }
            }
        }
        return map;
    }
}
