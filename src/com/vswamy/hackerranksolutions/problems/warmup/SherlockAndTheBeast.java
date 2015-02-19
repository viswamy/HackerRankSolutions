package com.vswamy.hackerranksolutions.problems.warmup;

import java.util.Scanner;

import com.vswamy.hackerranksolutions.interfaces.Problem;

/**
 * @author vswamy
 * @Problem statement: https://www.hackerrank.com/challenges/sherlock-and-the-beast/
 */

public class SherlockAndTheBeast implements Problem
{

    @Override
    public void run()
    {
        Scanner scanner = new Scanner(System.in);
        int numberOfTestCases = scanner.nextInt();scanner.nextLine();
        for(int i = 0; i < numberOfTestCases; i++)
        {
            int t = scanner.nextInt();
            printKey(t);
        }
        return;
    }
    
    private void printKey(int x)
    {
    	int fives = x;
    	int threes = 0;
    	
    	while(fives % 3 != 0 && fives >= 0)
    	{
    		fives = fives - 5;
    		threes = threes + 5;
    	}
    	
    	if(fives < 0)
    	{
    		System.out.println("-1");
    		return;
    	}
    	
    	StringBuffer fiveBuffer = new StringBuffer();
    	StringBuffer threeBuffer = new StringBuffer();
    	for(int i = 0 ; i < fives; i++)
    		fiveBuffer.append('5');
    	for(int i = 0; i < threes; i++)
    		fiveBuffer.append('3');
    	System.out.print(fiveBuffer);
    	System.out.print(threeBuffer);
    	System.out.println("");
    }
}
