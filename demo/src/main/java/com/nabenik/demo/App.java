package com.nabenik.demo;

public class App 
{
    public static void main( String[] args )
    {
    	Car car1 = new Car();
    	Car car2 = new Car();
    	
    	car1.setColor("Blue");
    	car2.setColor("Red");

    	System.out.println(car1.toString());
    	System.out.println(car2.toString());
    }
}
