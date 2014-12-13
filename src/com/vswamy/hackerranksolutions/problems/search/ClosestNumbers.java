package com.vswamy.hackerranksolutions.problems.search;

import java.util.Arrays;
import java.util.Scanner;

import com.vswamy.hackerranksolutions.interfaces.Problem;

/**
 * @author vswamy 
 * @problem statement: https://www.hackerrank.com/challenges/closest-numbers
 */

public class ClosestNumbers implements Problem
{

    @Override
    public void run()
    {
        Scanner in = new Scanner(System.in);
        
        int arrayLength = Integer.parseInt(in.nextLine());
        long[] array = new long[arrayLength];
        
        String next = in.nextLine();
        String[] next_split = next.split(" ");

        for (int i = 0; i < arrayLength; i++)
        {
            array[i] = Integer.parseInt(next_split[i]);
        }
        Arrays.sort(array);
        printClosestNumbers(array);
        return;
    }

    private void printClosestNumbers(long[] array)
    {
        long absoluteDifference = Long.MAX_VALUE;
        for(int i = 0; i < array.length-1; i++)
        {
            long diff = Math.abs(array[i] - array[i+1]);
            if(absoluteDifference > diff) absoluteDifference = diff;
        }
        for(int i = 0; i < array.length-1; i++)
        {
            long diff = Math.abs(array[i] - array[i+1]);
            if(absoluteDifference == diff)
                System.out.print(array[i] + " " + array[i+1] + " ");
        }
    }
}
