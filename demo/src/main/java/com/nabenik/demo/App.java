package com.nabenik.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Basic class that represents entry point for the demos
 * @author tuxtor
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String");
        String s = br.readLine();
    	System.out.println(s);
    }
}
