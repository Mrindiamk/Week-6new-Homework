/*2. Write a java program which remove extra space from both side “ I love
java ”
Expected output: “I love java”*/
package stringHomework;

public class Question2 {
    public static void main(String[] args) {
        String m1 =  "           I love java              " ;
        System.out.println(m1);
        System.out.println(m1.trim());
    }
}
