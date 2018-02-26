package Code;
// Needs a package declaration to move to another folder

import edu.cmu.ri.createlab.terk.robot.finch.Finch;
import java.awt.Color;

/**
 * Created by:
 * Date:
 * A starter file to use the Finch
 */

public class FinchTemplateFile
   {
   public static void main(final String[] args)
      {
      // Instantiating the Finch object
      Finch myFinch = new Finch();
      myFinch.setLED(Color.BLUE);
      myFinch.saySomething("Take me to your leader");
      myFinch.sleep(3000);

      // Write some code here!

      // Always end your program with finch.quit()
      myFinch.quit();
      System.exit(0);
      }
   }

