/*18. Write a Java Program using below steps.
18.1 Declare your council name as static variables.
18.2 Declare your house number as instance variables.
18.3 Declare one instance method name borough() and call Static variable
18.4 Declare static method name address() and call instance variable
18.5 Call both user defined methods into main method.*/
public class Program18 {
    static String council = "Brent"; //Static Variable
    int houseNo = 35;// Instance Variable

    //Instance Method
    public void borough() {
        System.out.println(council);
    }

    //Static Method
    public static void address() {
        Program18 obj = new Program18(); // Object for Instance Variable.
        System.out.println(obj.houseNo);
    }

    //Main Method
    public static void main(String[] args) {
        Program18 a1 = new Program18();// Object for Instance Method
        a1.borough();
        address();

    }
}
