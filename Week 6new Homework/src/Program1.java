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
