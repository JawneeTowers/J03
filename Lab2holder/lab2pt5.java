package Week_1.Lab2holder;
/*import java.util.Scanner;

public class lab2pt5 {
    public static void main(String[] args) {
//Write a method to prompt the user for a letter 
//of the alphabet and display it's ascii value.
//first problem google ascii
char ch = 'j';
int as_chi = ch;
System.out.println("ASCII value of " + ch + "is - " as_chi);


    }    
}
*/ 
public class lab2pt5 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String alphabets = "a";
        for(int i=0;i<alphabets.length();i++){
            char ch = alphabets.charAt(i);
            System.out.println("ASCII value of " + ch + " is - " + (int)ch);
        }
    }
}