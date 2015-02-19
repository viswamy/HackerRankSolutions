package com.vswamy.hackerranksolutions.problems.warmup;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

import com.vswamy.hackerranksolutions.interfaces.Problem;

/**
 * @author vswamy
 * @Problem statement: https://www.hackerrank.com/challenges/manasa-and-stones
 */

public class ManasaAndStones implements Problem
{

    @Override
    public void run()
    {
        Scanner scanner = new Scanner(System.in);
        int numberOfTestCases = scanner.nextInt();scanner.nextLine();
        for(int i = 0; i < numberOfTestCases; i++)
        {
            int numberOfStones = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            
            HashSet<Integer> set = new HashSet<Integer>(); 
            for(int j = 0; j < numberOfStones; j++)
                set.add(a*(numberOfStones - j -1) + b*j);
            Object[] arr = set.toArray();
            Arrays.sort(arr);
            for(int j = 0; j < arr.length; j++)
                System.out.print(arr[j] + " ");
            System.out.println("");
        }
        return;
    }
}

