
/**
 * This is practice exam 1, problem 2.
 * @author Marcy Held
 * Date: 09-22-15
 */
import java.util.Scanner;
import java.text.NumberFormat;

public class PracticeExam1B {

    private static float getValidInput (Scanner scan2) {
        float validInput;
        
        do {
            System.out.print ("Enter any positive currency amount: --> ");
            validInput = scan2.nextFloat();
        } while (validInput < 0);
        
        return validInput;
    }
    private static void displayCoins (float dollarAmt) {
        int startAmt, leftOver, quarters, dimes, nickels, pennies;
        
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        
        startAmt = (int) (dollarAmt * 100);
        quarters = startAmt / 25;
        leftOver = startAmt % 25;
        dimes = leftOver / 10;
        leftOver = leftOver % 10;
        nickels = leftOver / 5;
        pennies = leftOver % 5;

        System.out.println ("\nThe amount of coins for " + 
                nf.format(dollarAmt) + " are: ");
        System.out.println ("Quarters:  " + quarters +
                "\nDimes:   " + dimes +
                "\nNickels:  " + nickels +
                "\nPennies:  " + pennies);
    }
    
    public static void main(String[] args) {    
        float userInput;
        String repeat;
        
        do {
            Scanner keyboard = new Scanner (System.in);
            userInput = getValidInput (keyboard);
        
            displayCoins (userInput);
            
            System.out.print ("\nEnter \"yes\" to repeat: --> ");
            repeat = keyboard.next();
        } while (repeat.equalsIgnoreCase ("yes"));

    }
    
}
