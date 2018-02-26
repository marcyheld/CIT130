
/**
 * This program prompts the user for 3 names, and displays the names in 
 * alphabetical order.
 * @author Marcy Held
 * Date: 08-27-15
 */
import java.util.Scanner;

public class NameSort {

    public static void main(String[] args) {
        String name1, name2, name3; //input values
        String place1 = "", place2 = "", place3 = ""; // alphabetized values
        Scanner scan = new Scanner (System.in);
        
        System.out.print ("Enter the first name --> ");
        name1 = scan.nextLine ();
        System.out.print ("Enter the second name --> ");
        name2 = scan.nextLine ();
        System.out.print ("Enter the third name --> ");
        name3 = scan.nextLine();
        
        // checking the first name with the other names
        if (name1.compareTo(name2) <= 0 && name1.compareTo (name3) <= 0) 
        {
         place1 = name1;
             if (name2.compareTo(name3) <= 0)
             {
                 place2 = name2;
                 place3 = name3;
             }
             else
             {
                 place2 = name3;
                 place3 = name2;
             }
        }
        
        // checking the second name with the other names
        else if (name2.compareTo(name1) <= 0 && name2.compareTo(name3) <=0)
        {
            place1 = name2;
            if (name1.compareTo(name3) <=0)
            {
                place2 = name1;
                place3 = name3;
            }
            else
            {
                place2 = name3;
                place3 = name1;
            }
        }
        
        // checking the third name with the other names
        /* can also just use:
         else
         {
         if (name1.compareTo (name2) <= 0)
         {
              place2 = name1
              place3 = name2
         }
         else
         {
              place2 = name2
              place3 = name1
         }
        } */
        // because name3 being first is the only other option after
        // going through the first if and else if.
        else if (name3.compareTo(name1) <= 0 && name3.compareTo(name2) <= 0)
        {
            place1 = name3;
            if (name1.compareTo(name2) <= 0)
            {
                place2 = name1;
                place3 = name2;        
            }
            else
            {
                place2 = name2;
                place3 = name1;
            }
        }
        
        System.out.println ("The 3 names in alphabetical order are: " +
                place1 + ", " + place2 + ", " + place3);
        
    }
    
}
