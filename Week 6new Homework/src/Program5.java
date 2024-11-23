/*5. Write a program for a calculator with addition, subtraction, multiplication, and division
methods all with parameters and use string concatenation methods. (Note: Two static
and Two instance methods.)*/

import java.util.Scanner;

public class Program5 {

    //Static Method
    public static void addition() {
//        System.out.println(add);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your 1 st number");
        int add1 = scan.nextInt();
        System.out.println("Enter your 2 nd number");
        int add2 = scan.nextInt();
        System.out.println(add1 + " + " + add2 + " = " + (add1 + add2));

    }

    //Static Method
    public static void subtraction() {
//        System.out.println(sub);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your 1 st number");
        int add = scan.nextInt();
        System.out.println("Enter your 2 nd number");
        int add2 = scan.nextInt();
        System.out.println(add + " - " + add2 + " = " + (add - add2));
    }

    //Instance Method
    public void multiplication() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your 1 st number");
        int add1 = scan.nextInt();
        System.out.println("Enter your 2 nd number");
        int add2 = scan.nextInt();
        System.out.println(add1 + " x " + add2 + " = " + (add1 * add2));
    }

    //Instance Method
    public void division() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your 1 st number");
        int add1 = scan.nextInt();
        System.out.println("Enter your 2 nd number");
        int add2 = scan.nextInt();
        System.out.println(add1 + " / " + add2 + " = " + (add1 / add2));

    }

    //Main Method
    public static void main(String[] args) {
        addition();
        subtraction();
        Program5 obj = new Program5();
        obj.multiplication();
        obj.division();

    }
};

//       Scanner scan = new Scanner(System.in);
//        System.out.println("Enter your 1 st number");
//        int add = scan.nextInt();
//        addition(add);
//        System.out.println("Enter your 2 nd number");
//        int add2 = scan.nextInt();
//        addition(add2);
//        System.out.println(add + " + " + add2 + " = " + (add + add2));