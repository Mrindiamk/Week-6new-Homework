package javaHomework;/* 4. Write a Java programme using the following steps.
4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the
print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme.*/

public class Program4 {
    String Name1 = "Patel";
    int Age1= 25;
    static String Name2 = "Panchal";
    static int Age2 =20;

    //Instance Method
    public void iMethod(){
        System.out.println(Name1);
        System.out.println(Age1);
        System.out.println(Name2);
        System.out.println(Age2);
    }
     //Static Method
    public static void sMethod(){
       Program4 iVariable = new Program4();//Variable for name1
        System.out.println(iVariable.Name1);
       Program4 aVariable = new Program4(); //Variable for age1
        System.out.println(aVariable.Age1);
        System.out.println(Name2);
        System.out.println(Age2);
    }
    //Main Method
    public static void main(String[] args) {
        Program4 obj = new Program4();
        obj.iMethod();
        sMethod();
    }
}
