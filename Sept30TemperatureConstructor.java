
/**
 *
 * @author Marcy Held
 * Date: 09-30-15
 */
public class Sept30TemperatureConstructor {

    public static void main(String[] args) {
        
        Sept30Temperature beach = new Sept30Temperature (83.0078);
        
        Sept30Temperature city = new Sept30Temperature (63);
        
        System.out.println ("The current temperature in the city is " + 
                city.getFarenheit () + " Farenheit." + 
                "\nThe current temperature in the city in Celsius is " +
                city.getCelsius() + " Celsius." +
                "\nThe current temperature in the city in Kelvin is " +
                city.getKelvin() + " Kelvin.");
        
        System.out.println ("\nThe temperature at the beach is " +
                beach.getFarenheit() + " Farenheit.");
        
    }
    
}
