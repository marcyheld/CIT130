

/**
 * This program demonstrates .fill and .sort methods of the Arrays class, as
 * well as different ways to edit the information in an array.
 * @author Marcy Held
 * Date: 10-09-15
 */
import java.util.*;

public class Packet_ArraysDemo {

    public static void main(String[] args) 
    {
        int [] myScores = new int [5];
        
        display ("Original array:           ", myScores);
        Arrays.fill (myScores, 8);
        display ("After filling with 8s:        ", myScores);
        myScores [2] = 6;
        myScores [4] = 3;
        display ("After changing two values:        ", myScores);
        Arrays.sort(myScores);
        display("After sorting:         ", myScores);
        
    }
    
    public static void display (String message, int [] array)
    {
        int sz = array.length;
        
        System.out.print (message);
        for (int x = 0; x < sz; ++x)
        {
            System.out.print(array[x] + " ");
        }
        System.out.println();
    }
}
