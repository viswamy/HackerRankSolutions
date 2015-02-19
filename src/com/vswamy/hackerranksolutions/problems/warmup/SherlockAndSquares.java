package com.vswamy.hackerranksolutions.problems.warmup;

import java.util.Scanner;

import com.vswamy.hackerranksolutions.interfaces.Problem;

/**
 * @author vswamy
 * @Problem statement:
 *          https://www.hackerrank.com/challenges/sherlock-and-squares
 */

public class SherlockAndSquares implements Problem
{

    @Override
    public void run()
    {
        Scanner scanner = new Scanner(System.in);
        int numberOfTestCases = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < numberOfTestCases; i++)
        {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            double athroot = Math.sqrt(a);
            double bthroot = Math.sqrt(b);
            if (athroot % 1 != 0) athroot = (long) athroot + 1;
            System.out.println((long) (bthroot - athroot + 1));
        }
        return;
    }
}
