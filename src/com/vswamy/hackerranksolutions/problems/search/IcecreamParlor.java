package com.vswamy.hackerranksolutions.problems.search;

import java.util.Arrays;
import java.util.Scanner;

import com.vswamy.hackerranksolutions.interfaces.Problem;

/**
 * @author vswamy
 * @problem statement: https://www.hackerrank.com/challenges/icecream-parlor
 */

public class IcecreamParlor implements Problem
{

    @Override
    public void run()
    {
        Scanner in = new Scanner(System.in);
        int numOfTestCases = in.nextInt();
        for (int i = 0; i < numOfTestCases; i++)
        {
            int totalDollars = in.nextInt();
            int totalFlavors = in.nextInt();
            in.nextLine(); // flush out newline
            String[] priceOfFlavors = in.nextLine().split(" ");
            int[] prices = new int[priceOfFlavors.length];
            for (int k = 0; k < priceOfFlavors.length; k++)
            {
                prices[k] = Integer.parseInt(priceOfFlavors[k]);
            }
            for (int i1 = 0; i1 < prices.length; i1++)
            {
                for (int i2 = i1 + 1; i2 < prices.length; i2++)
                {
                    if (prices[i1] + prices[i2] == totalDollars)
                    {
                        System.out.println((i1 + 1) + " " + (i2 + 1));
                    }
                }
            }
        }
        return;
    }

}
