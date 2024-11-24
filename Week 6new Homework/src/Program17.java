/*17. Write a Java Program using below steps.
17.1 Declare your city as instance variables.
17.2 Declare your country as static variables.
17.3 Declare one instance method and call static variable in print statement
17.4 Declare static method and call instance variable in print Statement.
17.5 Call both user defined methods into main method.*/
public class Program17 {
    String city = "goa"; //instance variable.
    static String country = "India"; //static Variable.

    //Instance Method
    public void iMethod(){
        System.out.println(country);
    }
    //Static Method
    public static void sMethod(){
        Program17 obj = new Program17(); // Object for Instance Variable
        System.out.println(obj.city);
    }
    //Main Method
    public static void main(String[] args) {
        Program17 m1 = new Program17();
        m1.iMethod();
        sMethod();
    }

}
