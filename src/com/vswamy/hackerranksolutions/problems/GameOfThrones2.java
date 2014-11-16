package com.vswamy.hackerranksolutions.problems;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.lang.Character;
import com.vswamy.hackerranksolutions.interfaces.Problem;
import com.vswamy.hackerranksolutions.utils.PrimeNumberUtil;

/**
 * @author vswamy Problem statement:
 *         https://www.hackerrank.com/contests/july13/challenges
 *         /game-of-throne-ii
 */

public class GameOfThrones2 implements Problem
{

    @Override
    public void run()
    {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        System.out.println(getAnagramPalindromeCount(inputString));
        return;
    }

    private Collection<Integer> getCharacterRepeatCounts(String inputString)
    {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < inputString.length(); i++)
        {
            char currentCharacter = inputString.charAt(i);
            if (map.containsKey(currentCharacter))
            {
                int currentValueForKey = map.get(currentCharacter);
                map.put(currentCharacter, currentValueForKey + 1);
            }
            else
            {
                map.put(currentCharacter, 1);
            }
        }
        return map.values();
    }

    private long getAnagramPalindromeCount(String inputString)
    {
        int n = inputString.length() / 2;
        Collection<Integer> subvalues = getCharacterRepeatCounts(inputString);
        
        HashMap<Integer, Integer> nPrimeFactorization = PrimeNumberUtil.INSTANCE
                .getPrimeFactorizationForFactorial(n);
        for (Integer temp : subvalues)
        {
            HashMap<Integer, Integer> tempPrimeFactorization = PrimeNumberUtil.INSTANCE
                    .getPrimeFactorizationForFactorial(temp / 2);
            if (tempPrimeFactorization != null)
            {
                for (Integer curkey : tempPrimeFactorization.keySet())
                {
                    int curvalue = tempPrimeFactorization.get(curkey);
                    int nvalue = nPrimeFactorization.get(curkey);
                    nPrimeFactorization.put(curkey, nvalue - curvalue);
                }
            }
        }
        long returnvalue = 1;
        for (Integer curkey : nPrimeFactorization.keySet())
        {
            int curvalue = nPrimeFactorization.get(curkey);
            for (int i = 0; i < curvalue; i++)
            {
                returnvalue = returnvalue * curkey;
            }
        }
        return returnvalue;
    }
}
