package javaHomework;

import java.util.Scanner;

/*7. Write a program to insert any temperature value in degree Fahrenheit and convert
to degree Celsius ((F − 32) × 5/9 = 0°C). */
public class Program7 {
    public static void main(String[] args) {
        double a , c;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Fahrenhit temperature.");
        a=scan.nextDouble();
        System.out.println("Celcious temperature is = "+celsius(a));

    }
    static double celsius(double f){
        return (f-32)*5/9 ;
    }
}
