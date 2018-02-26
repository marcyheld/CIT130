
/**
 * This program demonstrates how to use an initialization list to fill an array,
 * and how to use the .binarySearch and .toString methods of the Arrays class.
 * 
 * @author Marcy Held
 * Date: 10-09-15
 */
import java.util.*;
import javax.swing.*;

public class Packet_ArraysDemo2 {

    public static void main(String[] args) {
        char [] grades = {'A', 'B', 'C', 'D', 'F'};
        String entry;
        char myGrade;
        int position;
        
        entry = JOptionPane.showInputDialog (null, "Enter student grade");
        myGrade = entry.charAt(0);
        position = Arrays.binarySearch(grades, myGrade);
        
        if (position >= 0)
        {
            JOptionPane.showMessageDialog (null, "Position of " +
                    myGrade + " is " + position);
        }
        else
            JOptionPane.showMessageDialog (null, 
                    "Invalid grade");
        
        System.out.println(Arrays.toString (grades));
        System.exit(0);
        
    }
    
}
