package com.vswamy.hackerranksolutions.problems.warmup;

import java.util.Scanner;

import com.vswamy.hackerranksolutions.interfaces.Problem;

/**
 * @author vswamy
 * @Problem statement: https://www.hackerrank.com/challenges/maximizing-xor
 */

public class MaximizeXOR implements Problem
{

    @Override
    public void run()
    {
        Scanner scanner = new Scanner(System.in);
        int startingNumber = scanner.nextInt();
        int endingNumber = scanner.nextInt();
        printMaximumXOR(startingNumber, endingNumber);
        return;
    }

    private void printMaximumXOR(int snumber, int enumber)
    {
        int value = snumber ^ enumber;
        for (int i = snumber; i < enumber; i++)
            for (int j = i + 1; j <= enumber; j++)
                if (value < (i ^ j)) value = i ^ j;
        System.out.println(value);
    }
}
