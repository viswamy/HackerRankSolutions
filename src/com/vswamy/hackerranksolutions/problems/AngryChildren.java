package com.vswamy.hackerranksolutions.problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

import com.vswamy.hackerranksolutions.interfaces.Problem;

/**
 * @author vswamy
 * @Problem statement: https://www.hackerrank.com/challenges/angry-children
 */

public class AngryChildren implements Problem
{

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder out = new StringBuilder();

    @Override
    public void run()
    {
        try
        {
            int numPackets = Integer.parseInt(in.readLine());
            int numKids = Integer.parseInt(in.readLine());
            int[] packets = new int[numPackets];

            for (int i = 0; i < numPackets; i++)
            {
                packets[i] = Integer.parseInt(in.readLine());
            }
            Arrays.sort(packets);
            int unfairness = Integer.MAX_VALUE;
            for (int i = numKids - 1; i < numPackets; i++)
            {
                int diff = packets[i] - packets[i - numKids + 1];
                if (unfairness > diff)
                {
                    unfairness = diff;
                }
            }
            System.out.println(unfairness);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
