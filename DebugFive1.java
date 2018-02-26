// DebugFive1
// Adds your lunch bill
// Burger and hot dog are $2.59
// Grilled cheese and fish are $1.99
// Fries are 89 cents
import javax.swing.*;
public class DebugFive1
{
  public static void main(String args[]) throws Exception
  {
	String usersChoiceString;
        int usersChoice;
        double bill = 0.0;
	usersChoiceString = JOptionPane.showInputDialog(null,
              "Order please\n1 - Burger\n2 - Hotdog" +
              "\n3 - Grilled cheese\n4 - Fish sandwich");
	usersChoice= Integer.parseInt(usersChoiceString);
	if(usersChoice == 1 || usersChoice == 2)
	  bill +=2.59;
        else
          bill += 1.99;
        usersChoiceString = JOptionPane.showInputDialog(null,
          "Fries with that?\n1 - Yes\n2 - No");
        usersChoice = Integer.parseInt (usersChoiceString);
        if (usersChoice == 1)
            bill+=.89;
       JOptionPane.showMessageDialog(null,"Bill is " + bill);
       System.exit(0);
  }
}
