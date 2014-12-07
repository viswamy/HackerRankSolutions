package com.vswamy.hackerranksolutions.problems;

import java.util.Scanner;

import com.vswamy.hackerranksolutions.interfaces.Problem;

/**
 * @author vswamy
 * @Problem statement: https://www.hackerrank.com/challenges/utopian-tree
 */

public class UtopianTree implements Problem
{

    @Override
    public void run()
    {
        Scanner scanner = new Scanner(System.in);
        int numberOfTestCases = scanner.nextInt();

        for (int i = 0; i < numberOfTestCases; i++)
        {
            int numberOfCycles = scanner.nextInt();
            printHeight(numberOfCycles);
        }
        return;
    }

    private void printHeight(int numberOfCycles)
    {
        int height = 1;
        boolean isSpring = true;
        while(numberOfCycles > 0)
        {
            if(isSpring)
            {
                isSpring = false;
                height = height * 2;
            }
            else
            {
                isSpring = true;
                height = height + 1;
            }
            numberOfCycles--;
        }
        System.out.println(height);
    }

}
