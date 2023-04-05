package Week_1.Lab2holder;
import java.util.Scanner;

public class lab2pt4 {
    public static void main(String[] args) {
        //Write a method to prompt the user for an 
        //Integer then display the same value with one decimal place.
        String string = decimalAdded();

        System.out.println(string);

    }

/**
 * @return
 */
public static String decimalAdded() {
    Scanner scanner = new Scanner(System.in);
    //get question
    System.out.print("Please type in a number -> ");
    int number = scanner.nextInt();
    String newNumber = number +".0"; 
    // make it into a decimal
    
    //add message
    scanner.close();
    return "You entered: " + number + " , New value is " + newNumber;

}

    
}
