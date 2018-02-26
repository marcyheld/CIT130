/**
 * This program demonstrates the use of static and non-static methods.
 * 
 * @author Marcy Held
 * Date: 08-25-15
 */
import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.util.Random;
//OR can use: import java.text.*;

public class StaticNonStatic {

    public static void main(String[] args) {
        // examples of using static methods
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(6);
        System.out.println(nf.format(Math.PI));
        
        // Math.random returns a double, incl 0 and up to/not incl 1
        // multiply by 10, get any number 0 to 9.99999(etc.)
        // cast as an int, gets any number 0 to 9
        // add 1 to this, get any number 1 - 10
        int aNumber = (int)(Math.random() * 10) + 1; 
        System.out.println ("The random number is " + aNumber);
        
        double aNumber2 = 10000 * Math.random();
        NumberFormat nf2 = NumberFormat.getCurrencyInstance();
        System.out.println ("The fractional random number is " + aNumber2);
        System.out.println ("The random number as currency is " + 
                nf2.format(aNumber2));
        
        // examples of using non-static methods
        System.out.println ("******************************************");
        DecimalFormat df = new DecimalFormat("#,##0.00");
        System.out.println(df.format(Math.PI));
        
        Random rNum = new Random();
        aNumber = rNum.nextInt(10) + 1; // creates number 0 to 9, must add 1
        System.out.println ("The random number is " + aNumber);
        aNumber2 = rNum.nextInt (10000) * .001; // fractional value from Random class
        DecimalFormat df2 = new DecimalFormat ("$#,##0.00");
        System.out.println ("The random number as currency is " + 
                df2.format(aNumber2));
                
    }
    
}
