package javaHomework;

/*14. Write a Java program to print the sum (addition), multiply, subtract, divide and
remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output:
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5*/
public class Program14 {
    public static void main(String[] args) {
        int num1 = 125;
        int num2 = 24;
        int addition = num1+num2;
        int subtraction = num1-num2;
        int multiply = num1*num2;
        int divide = num1/num2;
        int remainder = num1%num2;
        System.out.println(num1 + " + " +num2+ " = " + addition );
        System.out.println(num1 + " - " +num2+ " = " + subtraction );
        System.out.println(num1 + " * " +num2+ " = " + multiply );
        System.out.println(num1 + " / " +num2+ " = " + divide );
        System.out.println(num1 + " % " +num2+ " = " + remainder );

    }
}
