package com.vswamy.hackerranksolutions.problems;

import java.util.Scanner;

import com.vswamy.hackerranksolutions.interfaces.Problem;

public class IsFibo implements Problem
{

    @Override
    public void run()
    {
        Scanner scanner = new Scanner(System.in);
        long numberOfTestCases = scanner.nextLong();
        long[] inputNumbers = new long[(int)numberOfTestCases];
        for(int i = 0; i < inputNumbers.length; i++)
        {
            inputNumbers[i] = scanner.nextLong();
        }
        
        for(int i = 0; i < inputNumbers.length; i++)
        {
            System.out.println(isFibo(inputNumbers[i]) ? "IsFibo" : "IsNotFibo");
        }
        return;
    }

    private boolean isFibo(long i)
    {
        long x = 0;
        long y = 1;
        long temp;
        
        while(x < i)
        {
            temp = x + y;
            x = y;
            y = temp;
        }
        if(x == i) return true;
        return false;
    }
}
