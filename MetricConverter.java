package com.mycompany.metricconverter;
import java.util.Scanner;

public class MetricConverter {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a valid option for conversion:");
        System.out.println("Feet to Meters (1)" +
                          "\nPounds to Kgs (2)" +
                          "\nFahrenheit to Celsius (3)");
        int choice = input.nextInt();
        
        if (choice == 1){
        //Variables
        double feet;
        double meter;
        //Scanner object
        System.out.println("Enter a value of feet:");
        feet = input.nextDouble();
        //Compute meter
        //One foot is 0.305
        meter = feet * 0.305;
        //Display the output
        System.out.println(feet + "feets" + " is " + meter + " meters ");
           
        }
        
        else if (choice == 2){
            //Variables
        double pounds;
        double kilograms;
        //Scanner object
        System.out.println("Enter a value in pounds:");
        pounds = input.nextDouble();
        //Compute kilograms
        //One kg is 0.454
        kilograms = pounds * 0.454;
        //Display the output
        System.out.println(pounds + " is " + kilograms + " kgs ");
        
        }
        
        else if (choice == 3){
            //Variables
        double fahrenheit;
        double celsius;
        //Scanner object  
        System.out.println("Enter a value in fahrenheit:");
        fahrenheit = input.nextDouble();
        //Compute kilograms
        //One kg is 0.454
        celsius = (fahrenheit-32) * 5/9;
        //Display the output
        System.out.println(fahrenheit + " is " + celsius + " celcius ");
        
        }
        else{
            System.out.println("Please choose a valid option:");
        
        }
        
        
        
    }
}
