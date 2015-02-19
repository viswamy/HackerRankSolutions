package com.vswamy.hackerranksolutions.problems.warmup;

import java.util.Scanner;

import com.vswamy.hackerranksolutions.interfaces.Problem;

/**
 * @author vswamy
 * @Problem statement: https://www.hackerrank.com/challenges/halloween-party
 */

public class HalloweenParty implements Problem
{

    @Override
    public void run()
    {
        Scanner scanner = new Scanner(System.in);
        int numberOfTestCases = scanner.nextInt();
        for(int i = 0; i < numberOfTestCases; i++)
        {
            long t = scanner.nextLong();
            System.out.println(maximumNumPieces(t));
        }
        return;
    }

    long maximumNumPieces(long x)
    {
        long firsthalf = x / 2;
        long secondhalf = x - firsthalf;
        return firsthalf * secondhalf;
    }
}
