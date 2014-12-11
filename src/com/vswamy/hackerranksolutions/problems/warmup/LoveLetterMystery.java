package com.vswamy.hackerranksolutions.problems;

import java.util.Scanner;

import com.vswamy.hackerranksolutions.interfaces.Problem;

/**
 * @author vswamy
 * @Problem statement: https://www.hackerrank.com/challenges/the-love-letter-mystery
 */

public class LoveLetterMystery implements Problem
{

    @Override
    public void run()
    {
        Scanner scanner = new Scanner(System.in);
        int numberOfTestCases = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < numberOfTestCases; i++)
        {
            String str = scanner.nextLine();
            printMinimumCount(str);
        }
    }

    private void printMinimumCount(String str)
    {
        int strLength = str.length();
        int count = 0;
        for(int i = 0; i < strLength/2; i++)
        {
            count += Math.abs(str.charAt(i) - str.charAt(strLength-1-i));
        }
        System.out.println(count);
    }
}
