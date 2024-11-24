import java.util.Scanner;

/*12. Write a Java program that takes three numbers as input to calculate and print the
average of the numbers.*/
public class Program12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your First number");
        int num1 = scan.nextInt();
        System.out.println("Enter your Second number");
        int num2 = scan.nextInt();
        System.out.println("Enter your Third number");
        int num3 = scan.nextInt();
        System.out.println("The average of entered number is :"+avr(num1,num2,num3) );
    }

    public static int avr(int a,int b, int c){
        return (a+b+c)/3;

    }
}
