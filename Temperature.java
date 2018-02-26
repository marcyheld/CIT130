
import java.text.DecimalFormat;


/**
 * This is a user defined class.
 * @author Marcy Held
 * Date: 10-01-15
 */
public class Temperature {
    // field
    private double ftemp;
    
    // constructor
    public Temperature (double t) 
    {
        ftemp = t;
    }
    
    // setter methods
    // could use if/else to set range of temps accepted by setFarenheit method
    public void setFarenheit (double t) 
    {
        ftemp = t;    
    }
    
    // getter methods
    public double getFarenheit ()
    {
        return ftemp;
    }
    
    public double getCelsius ()
    {
        return ((5.0 / 9.0) * (ftemp - 32));
    }
    
    // could also call getCelsius method from the getKelvin method
    public double getKelvin ()
    {
        return ((5.0 / 9.0) * (ftemp - 32.0) + 273.0);
    }
    
    public String toString ()
    {
        DecimalFormat df = new DecimalFormat ("0.00");
                
        return "Celsius temperature is " + df.format(getCelsius()) +
                "Farenheit temperature is " + df.format (ftemp);
    }
    
}
