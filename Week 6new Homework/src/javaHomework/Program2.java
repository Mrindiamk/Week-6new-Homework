package javaHomework;/* 2. Write a Java programme using the following steps.
2.1 Declare two static variables.
2.2 Declare one static method.
2.3 Call both static variables into the static method inside the print statement.
2.4 Declare the Main method.
2.5 Call the static method into the Main method and run the programme.*/

public class Program2 {

    static String name = "Amin";
    static int Age = 25;

    public static void main(String[] args) {
        sMethod();
    }

    public static void sMethod() {
        System.out.println(name);
        System.out.println(Age);
    }
}
