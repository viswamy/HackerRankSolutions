package com.vswamy.hackerranksolutions.problems.warmup;

import java.util.Scanner;

import com.vswamy.hackerranksolutions.interfaces.Problem;

/**
 * @author vswamy
 * Problem statement: https://www.hackerrank.com/challenges/find-digits
 */


public class FindDigits implements Problem
{

    @Override
    public void run()
    {
        Scanner scanner = new Scanner(System.in);
        int numberOfTestCases = scanner.nextInt();
        long[] inputNumbers = new long[numberOfTestCases];
        for(int i = 0; i < inputNumbers.length; i++)
        {
            inputNumbers[i] = scanner.nextLong();
        }
        
        for(int i = 0; i < inputNumbers.length; i++)
        {
            System.out.println(getDivisibleCount(inputNumbers[i]));
        }
        return;
    }

    private int getDivisibleCount(long n)
    {
        long temp = n; int count = 0;
        while(temp > 0)
        {
            int lastDigit = (int) (temp % 10);
            temp /= 10;
            if(lastDigit!= 0 && n % lastDigit == 0) count++;
        }
        return count;
    }
}
