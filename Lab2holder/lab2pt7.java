package Week_1.Lab2holder;
import java.util.Scanner;

public class lab2pt7 {

    
    public static void main(String[] args) {
        String string = leapYear();

        System.out.println(string);
    }

    /**
     * @return 
     */
    public static String leapYear() {
        //Write a method to prompt the user for 4 digits representing a year. Then determine If Year Is a Leap Year.
        Scanner scanner = new Scanner (System.in);
        //get the question
        System.out.print( "What is the year -> ");
        int year = scanner.nextInt();

        if(year%4 == 0) {

            if(year%100 == 0) 

                System.out.println( "The year is a leap year!");
            } else {
                System.out.println( "The year is not a leap year.");
            }
        
        //close out
        scanner.close();
      
        return "Thank you!";
    }
    
}

