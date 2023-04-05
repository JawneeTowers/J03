package Week_1.Lab2holder;
import java.util.Scanner;

public class lab2pt2 {
    public static void main(String[] args) {
    String string = triangle();

    System.out.println(string);
}

/**
 * @return
 */
public static String triangle() {
    //Write a method to prompt the user for base-width and height of a triangle, then calculate the area of the Triangle.
    Scanner scanner = new Scanner(System.in);
    //get question
    System.out.print("What is the length of the base -> ");
    int base = scanner.nextInt();
    System.out.print("What is the height -> ");
    int height = scanner.nextInt();
    //do the math
    double area = (base * height)/2;

    //close out
    scanner.close();

    return "Area is: " + area;

}
    
}
