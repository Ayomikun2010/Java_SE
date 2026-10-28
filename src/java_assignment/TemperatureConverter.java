package java_assignment;

import java.util.Scanner;

public class TemperatureConverter {

//    formular for calculating temperature is:
//    Celsius = (fahrenheit - 32) * 5/9

    public static void main(String[] args){
        temperatureConverter();
    }

    public static void temperatureConverter(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a fahrenheit temperature");
        int fahrenheit = input.nextInt();
        double celsius = (double) (fahrenheit - 32) * 5 / 9;
        System.out.println(celsius);
        input.close();
    }
    }

