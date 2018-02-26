package Code;
// Needs a package declaration to move to another folder

import edu.cmu.ri.createlab.terk.robot.finch.Finch;
import java.awt.Color;

/**
 * Created by: Marcy Held
 * Date: 09-17-15
 * A starter file to use the Finch
 */

public class MethodsExample
   {
    
    public static Color setBeakColor (Finch m) {
      
        int sum = m.getLeftLightSensor() + m.getRightLightSensor();
        if (sum <= 100)
        {
            return Color.BLUE;
        }
        
        else if (sum <= 200)
        {
            return Color.GREEN;
        }
        
        else if (sum <= 300)
        {
            return Color.YELLOW;
        }
        
        else
            return Color.RED;
    }
            
    public static void main(final String[] args)
      {
      // Instantiating the Finch object
      Finch max = new Finch();
      
      while (max.isFinchLevel())
      {
          max.setLED (setBeakColor (max));
          max.saySomething ("New color", 1500);
      }

      // Always end your program with finch.quit()
      max.quit();
      System.exit(0);
      }
   }

