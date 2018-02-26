
/**
 * This is an application class that uses the Temperature class.
 * @author Marcy Held
 * Date: 10-01-15
 */
import java.util.Scanner;

public class TemperatureDemo {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        double temp;
        Temperature reading;
        
        System.out.print ("Enter a temperature in Farenheit --> ");
        temp = scan.nextDouble();
        
        // creates object of Temperature class
        reading = new Temperature (temp);
        
        System.out.printf ("Celsius: %.2f\n", reading.getCelsius());
        System.out.printf ("Kelvin: %.2f\n", reading.getKelvin());
        
    }
    
}
