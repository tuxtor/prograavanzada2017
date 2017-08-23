package com.nabenik.demo;

/**
 * Basic class that represents entry point for the demo
 * @author tuxtor
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Author autor1 = new Author("O. Deittel", 
    			"deittel@url.edu.gt", 
    			'm');
    	Book book1 = new Book("Java: SE 8", autor1, 10.0, 1);
    	
    	System.out.println(book1.toString());
    	
    }
}
