package com.vswamy.hackerranksolutions.problems;

import java.util.Scanner;

import com.vswamy.hackerranksolutions.interfaces.Problem;

/**
 * @author vswamy
 * @Problem statement: https://www.hackerrank.com/challenges/maximizing-xor
 */

public class AlternatingCharacters implements Problem
{

    @Override
    public void run()
    {
        Scanner scanner = new Scanner(System.in);
        int numberOfTestCases = scanner.nextInt();scanner.nextLine();
        for(int i = 0; i < numberOfTestCases; i++)
        {
            String t = scanner.nextLine();
            printMinimumCountToMakeAlternatingCharacters(t);
        }
        return;
    }

    private void printMinimumCountToMakeAlternatingCharacters(String t)
    {
        if(t == null || t.length() == 0)
        {
            System.out.println("0");
            return;
        }
        char curChar = t.charAt(0);
        int count = 0;
        for(int i = 1; i < t.length(); i++)
        {
            if(curChar == t.charAt(i))
                count++;
            else
                curChar = t.charAt(i);
        }
        System.out.println(count);
    }
}
