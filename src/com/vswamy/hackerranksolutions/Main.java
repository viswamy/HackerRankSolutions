package com.vswamy.hackerranksolutions;

import com.vswamy.hackerranksolutions.interfaces.Problem;
import com.vswamy.hackerranksolutions.problems.*;

/**
 * @author vswamy 
 * Main class to run execute multiple problems
 */

public class Main
{
    public static void main(String[] args)
    {
        Problem problem = new AlternatingCharacters();
        problem.run();
        return;
    }
}
