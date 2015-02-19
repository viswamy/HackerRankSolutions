package com.vswamy.hackerranksolutions.problems.warmup;

import java.util.Scanner;

import com.vswamy.hackerranksolutions.interfaces.Problem;
import com.vswamy.hackerranksolutions.utils.*;

/**
 * @author vswamy
 * @Problem statement: https://www.hackerrank.com/challenges/sherlock-and-gcd
 */

public class SherlockAndGCD implements Problem
{

    @Override
    public void run()
    {
        Scanner scanner = new Scanner(System.in);
        int numberOfTestCases = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < numberOfTestCases; i++)
        {
            int length = scanner.nextInt();
            int[] elements = new int[length];
            for (int j = 0; j < length; j++)
                elements[j] = scanner.nextInt();
            foo(elements);
        }
        return;
    }

    private void foo(int[] elements)
    {
        for (int i = 0; i < elements.length; i++)
            for (int j = i + 1; j < elements.length; j++)
                if (MathUtil.INSTANCE.gcd(elements[i], elements[j]) == 1)
                {
                    System.out.println("YES");
                    return;
                }
        System.out.println("NO");
        return;
    }
}
