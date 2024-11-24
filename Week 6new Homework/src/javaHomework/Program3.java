package javaHomework;/* 3. Write a Java programme using the following steps.
3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the
print statement.
3.5 Declare the Main method.
3.6 Call both instance and static methods into the Main method and run the programme.*/

public class Program3 {
    String Name = "Shah"; //Instance Method
    static int Age = 25;// Static Method

    //Main Method
    public static void main(String[] args) {
        Program3 obj = new Program3();
        obj.iMethod();
        sMethod();
    }

    //Instance method
    public void iMethod() {
        System.out.println(Name);
        System.out.println(Age);
    }

    //Static Method
    public static void sMethod() {
        Program3 iVariable = new Program3();
        System.out.println(iVariable.Name);
        System.out.println(Age);
    }
}
