package Week_1.Lab2holder;
import java.util.Scanner;
public class lab2pt3 {
    public static void main(String[] args) {
        String string = evenOdd();

        System.out.println(string);
    }

    /**
     * @return
     */
    public static String evenOdd() {
        //Write a method to prompt the user for a number then display check if the number is Even or Odd
        Scanner scanner = new Scanner(System.in);
        //get question
        System.out.print("Please type in a number -> ");
        int number = scanner.nextInt();
        //add message
        if (number%2 == 0) {
            System.out.print("Even");

        }
        else {
            System.out.print("odd");
        }
        //close out
        scanner.close();

        return " number";
    }       
    
}
