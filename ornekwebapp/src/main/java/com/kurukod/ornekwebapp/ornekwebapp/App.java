package com.kurukod.ornekwebapp.ornekwebapp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) 
    {
        Car bmw = new Car();
        bmw.setName("3.20d");
        bmw.setYear(2018);
        
        System.out.println(bmw.getName() + " " + bmw.getYear());
        
        Car reno = new Car();
        
        reno.setName("Laguna");
        reno.setYear(2001);
        
        System.out.println(reno.getName() + " " + reno.getYear());
    }
}
