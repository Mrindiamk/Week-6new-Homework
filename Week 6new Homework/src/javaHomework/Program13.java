package javaHomework;

/*13. Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.6 Height = 8.5
Expected Output:
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20*/
public class Program13 {
    public static void main(String[] args) {
        double width = 5.6;
        double Height = 8.5;
        double perimeter = 2*(Height+width); //formula for perimeter
        double area = width*Height; //Formula for area
        System.out.println("Perimeter is 2 * "+"("+ width +"+"+ Height +")"+"=" +(width+Height)*2);
        System.out.println("Area is "+width+" * "+ Height +" = "+(width*Height));
    }
}
