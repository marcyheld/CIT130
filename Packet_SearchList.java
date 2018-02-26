import javax.swing.JOptionPane;

/**
 *
 * @author Marcy Held
 * Date: 10-14-15
 */
public class Packet_SearchList {

    public static void main(String[] args) {
        String [] deptName = { "Accounting", "Human Resources", "Sales" };
        String dept;
        int x;
        boolean deptWasFound = false;
        
        dept = JOptionPane.showInputDialog (null, "Enter a department name");
        for (x = 0; x < deptName.length; ++x)
            if (dept.equals (deptName[x]))
                deptWasFound = true;
        
        if (deptWasFound)
            JOptionPane.showMessageDialog (null, 
                dept + " was found in the list");
        else
            JOptionPane.showMessageDialog (null, dept + 
                " was not found in the list");
        
        System.exit (0);   
    }
    
}
