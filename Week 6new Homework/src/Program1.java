/*1. Write a Java programme using the following steps.
1.1 Declare two instance variables.
1.2 Declare one instance method.
1.3 Call both instance variables into the instance method inside the print statement.
1.4 Declare the Main method.
1.5 Call the above instance method into the Main method and run the programme. */

public class Program1 {

      String Name = "Amin"; //Instance Variable1
      int Age = 25; //Instance Variable2

    //Main Method
    public static void main(String[] args) {
        Program1 m = new Program1(); //Constructor(Object)
        m.m1();
    }

    //Instance Method
    public void m1(){
        System.out.println(Name); // print statement
        System.out.println(Age); // print statement
    }
}
