package Week_1.Lab2holder;
import java.util.Scanner;
import java.lang.Math; 

public class lab2pt6 {
    public static void main(String[] args) {
        String string = roundUp();

        System.out.println(string);
    }
    /**
 * @return
 */
    public static String roundUp() {
     
     //Write a method to prompt the user for a double then display the value as a whole number
     Scanner scanner = new Scanner(System.in);
    System.out.print("Please input number -> ");
    double numA = scanner.nextInt();
    //int numB;

    //special formula (i googled)
    
    float numB = Math.round(numA);
    //close out
    scanner.close();
    
    return "New number is " + numB;
    }
}

