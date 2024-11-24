/*6. Write a java program which replace a “I@love@java” to “we love java”
Expected output: We love java*/
package stringHomework;

public class Question6 {
    public static void main(String[] args) {
        String m1 =  "I@love@java" ;
        String m2 =  "We love java" ;
        System.out.println(m1.replaceAll(m1,m2));
    }
}
