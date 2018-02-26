// DebugFive3.java
// Determines whether item number on order is valid
// Over 999 invalid
// Less than 111 Invalid
// Valid and less than 500 - Automotive Department
// Valid and 500 or higher Housewares Department
import javax.swing.*;
public class DebugFive3
{
   public static void main (String args[])
   {
      int item;
      String itemString, output;
      itemString = JOptionPane.showInputDialog(null,
         "Please enter item number");
      item = Integer.parseInt(itemString);
      if(item < 111)
         output = "Item number too low";
      else if (item > 999)
        output = "Item number too high";
        else
        {  
          if(item < 500)
               output = "Valid - in Automotive Department";
          else
               output = "Valid - Item in Housewares Department";
        }
      
       JOptionPane.showMessageDialog(null, output);
       System.exit(0);
   }
}


