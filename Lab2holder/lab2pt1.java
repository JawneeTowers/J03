package Week_1.Lab2holder;
import java.util.Scanner;

public class lab2pt1 {


    public static void main(String[] args) {
        String string = circle();

        System.out.println(string);
    }

     /**
     * @return
     */
    public static String circle() {
        // Write a method to prompt the user to enter the radius of the circle. Then calculate the area and circumference of the circle.
        Scanner scanner = new Scanner(System.in);
        //get question
        System.out.print("What is the radius -> " );
        int radius = scanner.nextInt();
        // define values
        double pi = 3.14;
        // do the math
        double area = (radius*radius) * pi;

        double circumference = 2 * pi * radius;
        //close out
        scanner.close();

        return "Area is: " + area + " Circumference is:" + circumference;

    }

    
        

}