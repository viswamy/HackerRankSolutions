package com.vswamy.hackerranksolutions.problems.warmup;

import java.util.Scanner;

import com.vswamy.hackerranksolutions.interfaces.Problem;

/**
 * @author vswamy
 * @Problem statement: https://www.hackerrank.com/challenges/chocolate-feast
 */

public class ChocolateFeast implements Problem
{

    @Override
    public void run()
    {
        Scanner scanner = new Scanner(System.in);
        int numberOfTestCases = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < numberOfTestCases; i++)
        {
            long n = scanner.nextLong();
            long c = scanner.nextLong();
            long m = scanner.nextLong();

            System.out.println(foo(n, c, m));
        }
        return;
    }

    private long foo(long n, long c, long m)
    {
        long totalChocalates = 0;
        long totalWraps = 0;
        totalChocalates += n / c;
        totalWraps += n / c;
        while (totalWraps / m > 0)
        {
            long temp = totalWraps / m;
            totalWraps = totalWraps % m;
            totalWraps += temp;
            totalChocalates += temp;
        }
        return totalChocalates;
    }
}
