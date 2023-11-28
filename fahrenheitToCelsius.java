package com.mycompany.metricconverter;
import java.util.Scanner;

public class fahrenheitToCelsius {

    public static void main(String[] args) {
        //Variables
        double fahrenheit;
        double celsius;
        //Scanner object
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a value in fahrenheit:");
        fahrenheit = input.nextDouble();
        //Compute kilograms
        //One kg is 0.454
        celsius = (fahrenheit-32) * 5/9;
        //Display the output
        System.out.println(fahrenheit + " is " + fahrenheit + " celcius ");
        
        
    }
}

