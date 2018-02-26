/**
 * This is practice exam 1, problem 1.
 * @author Marcy Held
 * Date: 09-22-15
 */
import java.util.Scanner;
import java.text.NumberFormat;

public class PracticeExam1A {

    public static void main(String[] args) {
        int quarters = 0, dimes = 0, nickels = 0, pennies = 0, 
                startAmt, leftOver;
        float userInput;
        
        Scanner keyboard = new Scanner (System.in);
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        
        do {
            System.out.print ("Enter any positive currency amount: --> ");
            userInput = keyboard.nextFloat();
        } while (userInput < 0);
        
        // convert float userInput to int, whole number of pennies
        startAmt = (int)(userInput * 100);
        
        // complete calculations to find number of each type of coin
        quarters = startAmt / 25;
        leftOver = startAmt % 25;
        dimes = leftOver / 10;
        leftOver = leftOver % 10;
        nickels = leftOver / 5;
        pennies = leftOver % 5;

        System.out.println ("The amount of coins for " + 
                nf.format(userInput) + " are: ");
        System.out.println ("Quarters:\t" + quarters +
                "\nDimes:\t" + dimes +
                "\nNickels:\t" + nickels +
                "\nPennies:\t" + pennies);
        
        
    }
    
}
