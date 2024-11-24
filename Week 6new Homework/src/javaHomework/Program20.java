package javaHomework;

/*20. Write a Java Program using below steps.
20.1 Declare your Spain as static variable.
20.2 Declare your United Kingdom as instance variable.
20.3 Declare instance method name homeCountry()and call static variable.
20.4 Declare static method name holidays() and call instance variable
20.5 Call both methods in main method.*/
public class Program20 {
    String country1 = "UK"; //instance variable.
    static String country2 = "Spain"; //static Variable.

    //Instance Method
    public void homeCountry(){
        System.out.println(country2);
    }
    //Static Method
    public static void holidays(){
        Program20 obj = new Program20(); // Object for Instance Variable
        System.out.println(obj.country1);
    }
    //Main Method
    public static void main(String[] args) {
        Program20 m1 = new Program20();
        m1.homeCountry();
        holidays();
    }
}
