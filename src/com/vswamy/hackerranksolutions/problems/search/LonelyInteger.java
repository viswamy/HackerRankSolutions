package com.vswamy.hackerranksolutions.problems.search;

import java.util.Scanner;

import com.vswamy.hackerranksolutions.interfaces.Problem;

/**
 * @author vswamy 
 * @problem statement: https://www.hackerrank.com/challenges/lonely-integer
 */

public class LonelyInteger implements Problem
{

    @Override
    public void run()
    {
        Scanner in = new Scanner(System.in);
        int res;

        int _a_size = Integer.parseInt(in.nextLine());
        int[] _a = new int[_a_size];
        int _a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");

        for (int _a_i = 0; _a_i < _a_size; _a_i++)
        {
            _a_item = Integer.parseInt(next_split[_a_i]);
            _a[_a_i] = _a_item;
        }

        res = lonelyinteger(_a);
        System.out.println(res);
        return;
    }

    private int lonelyinteger(int[] array)
    {
        int answer = 0;
        for(int i = 0; i < array.length; i++)
        {
            answer ^= array[i];
        }
        return answer;
    }
}
