/*16. Write a Java Program to print as below. (All details to be stored in variable)

"+------------------------+"
"| |"
"| CORNER STORE |"
"| |"
"| 2015-03-29 04:38PM |"
"| |"
"| Gallons: 10.870 |"
"| Price/gallon: $ 2.89 |"
"| |"
"| Fuel total: $ 22.71 |"
"| |"
"+------------------------+"*/
public class Program16 {
    public static void main(String[] args) {
        String name = "CORNER STORE";
        String date = "2015-03-29";
        String time = "04:38PM";
        String weight = "Gallons: 10.870";
        String price = "Price/gallon: $ 2.89";
        String total = "Fuel total: $ 22.71 ";
        System.out.println("+--------------------------------+");
        System.out.println("|                                |");
        System.out.println("|  "+name+"                  |");
        System.out.println("|                                |");
        System.out.println("|  "+date+"  "+time+"           |");
        System.out.println("|                                |");
        System.out.println("|  "+weight+"               |" );
        System.out.println("|  "+price+"          |");
        System.out.println("|                                |");
        System.out.println("|  "+total+"          |");
        System.out.println("|                                |");
        System.out.println("+--------------------------------+");

    }
}
