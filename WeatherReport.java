package Code;
// Needs a package declaration to move to another folder

import edu.cmu.ri.createlab.rss.readers.WeatherReader;
import edu.cmu.ri.createlab.terk.robot.finch.Finch;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 * Created by:
 * Date:
 * A starter file to use the Finch
 */

public class WeatherReport
   {
   public static void main(final String[] args)
      {
      Finch max = new Finch();
      String input;
      WeatherReader getW;
      
      input = JOptionPane.showInputDialog(null, 
              "Enter a city for a weather report", "Title Bar",
              JOptionPane.PLAIN_MESSAGE);
      // Can reference loop number in "Title Bar" area to update location number
      
      getW = new WeatherReader (input);
      
      max.setLED (Color.BLUE);
      max.saySomething (getW.getConditions() + getW.getTemperature()
              + " degrees", 5000);
      max.sleep (3000);

      // Always end your program with finch.quit()
      max.quit();
      System.exit(0);
      }
   }

