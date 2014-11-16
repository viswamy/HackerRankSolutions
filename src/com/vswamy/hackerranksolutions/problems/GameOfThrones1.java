package com.vswamy.hackerranksolutions.problems;

import java.util.HashSet;
import java.util.Scanner;
import java.lang.Character;

import com.vswamy.hackerranksolutions.interfaces.Problem;

/**
 * @author vswamy
 * Problem statement: https://www.hackerrank.com/challenges/game-of-thrones
 */

public class GameOfThrones1 implements Problem
{

    @Override
    public void run()
    {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        System.out.println(isAnyAnagramPalindrome(inputString) ? "YES" : "NO");
        return;
    }

    private boolean isAnyAnagramPalindrome(String inputString)
    {
        HashSet<Character> set = new HashSet<Character>();
        for(int i = 0; i<inputString.length(); i++)
        {
            Character c = inputString.charAt(i);
            if(set.contains(c)) set.remove(c);
            else set.add(c);
        }
        return set.size() == 0 || set.size() == 1;
    }
}
