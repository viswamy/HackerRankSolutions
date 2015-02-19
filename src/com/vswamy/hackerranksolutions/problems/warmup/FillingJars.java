package com.vswamy.hackerranksolutions.problems.warmup;

import java.util.Scanner;

import com.vswamy.hackerranksolutions.interfaces.Problem;

/**
 * @author vswamy
 * @Problem statement: https://www.hackerrank.com/challenges/filling-jars
 */
//Incorrect solution.. 
public class FillingJars implements Problem
{

    @Override
    public void run()
    {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        double totalValue = 0;

        for(int i = 0; i < m ; i++)
        {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long value = scanner.nextLong();
            totalValue += (value) * (b - a + 1) / n ;
        }
        System.out.println((long)totalValue);
    }

}
