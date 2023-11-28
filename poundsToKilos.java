package com.mycompany.metricconverter;
import java.util.Scanner;

public class poundsToKilos {

    public static void main(String[] args) {
        //Variables
        double pounds;
        double kilograms;
        //Scanner object
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a value in pounds:");
        pounds = input.nextDouble();
        //Compute kilograms
        //One kg is 0.454
        kilograms = pounds * 0.454;
        //Display the output
        System.out.println(pounds + " is " + pounds + " kgs ");
        
        
    }
}
