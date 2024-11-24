/*19. Write a Java Program using below steps.
19.1 Declare one of your group member names as instance variable.
19.2 Declare one of your group member names as static variable.
19.3 Declare one instance method name with group name (e.g. selenium())and call both global
variables.
19.4 Declare static method name agile() and call both variable
19.5 Call both user defined methods into main method.
Note: Declare 1 local variables in all user defined method and main method and print in to statement*/
public class Program19 {
    static String name1 = "Shah"; //Static Variable
    String  name2  = "Amin";// Instance Variable

    //Instance Method
    public void cypress() {
        System.out.println(name1);
        System.out.println(name2);
        String country = "India";
        System.out.println(country);
    }

    //Static Method
    public static void agile() {
        Program19 obj = new Program19(); // Object for Instance Variable.
        System.out.println(name1);
        System.out.println(obj.name2);
        int rank = 2;
        System.out.println(rank);
    }

    //Main Method
    public static void main(String[] args) {
        Program19 a1 = new Program19();// Object for Instance Method
        a1.cypress();
        agile();
        String city = "Goa";
        System.out.println(city);

    }
}


