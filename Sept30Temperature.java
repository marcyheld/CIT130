
/**
 * This is my attempt to create the Temperature class.
 * 
 * @author Marcy Held
 * Date: 09-30-15
 */
public class Sept30Temperature 
{
    private double ftemp;
    
    
    public Sept30Temperature (double t) 
    {
        ftemp = t;
    }
    
    public void setFarenheit (double t) 
    {
        ftemp = t;
    }
    
    public double getFarenheit ()
    {
        return ftemp;
    }
    
    public double getCelsius () 
    {
        return (((ftemp - 32.0)* 5)/9);
    }
    
    public double getKelvin () 
    {
        return (((ftemp + 459.67)* 5)/9);
    }   
    
}
