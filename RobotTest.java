
package Code;

import edu.cmu.ri.createlab.terk.robot.finch.Finch;
import java.awt.Color;

/**
 * This program demonstrates the Finch Class methods.
 * @author Marcy Held
 * Date: 09-03-15
 */

public class RobotTest {

    public static void main(String[] args) {
        
        Finch max = new Finch ();
        double currentTempC, currentTempF;
        max.setLED (Color.GREEN);
        
        for (int i = 1; i <= 5; i++) 
        {
            max.setWheelVelocities (100, 100, 500); // speed L, speed R,  time
            max.setWheelVelocities (-100, -100, 500);
            System.out.println("" + i + "\n");
            
            max.saySomething("" + i, 500);
        }
        
        for (int i = 10; i >= 1; i--) {
            max.saySomething ("" + i, 500);
        }
        
        currentTempC = max.getTemperature();
        currentTempF = (currentTempC * 1.8) + 32;
        
        System.out.println(currentTempF);
        
        max.saySomething("The current temperature is " + currentTempF + 
                "degrees Fahrenheit.", 4000);
        
        max.quit();
        System.exit(0);
    }
    
}
