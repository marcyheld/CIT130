
/**
 * Male and Female Percentages programming challenge.
 * Displays use of casting.
 * 
 * @author Marcy Held
 * Date: 08-20-15
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class MaleAndFemalePercentages {

    public static void main(String[] args) {
        int male;
        int female;
        int total; //could also declare as double, instead of casting
        // double total;
        double percentMale;
        double percentFemale;
        
        DecimalFormat df = new DecimalFormat ("0.0%");
        Scanner keyboard = new Scanner (System.in);
        
        System.out.print ("Enter the number of male students --> ");
        male = keyboard.nextInt();
        
        System.out.print ("Enter the number of female students --> ");
        female = keyboard.nextInt();
        
        total = male + female;
        // NEED TO CAST one of the operands !!!
        // percent(Fe)Male is a double, and (fe)male variables are int
        percentMale = (double) male / total;
        
        percentFemale = (double) female / total;
        
        System.out.println("Male: " + df.format(percentMale));
        System.out.println ("Female: " + df.format(percentFemale));
    }
    
}
