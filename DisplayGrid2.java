
/**
 * Exam 1, program 2
 * @author Marcy Held
 * Date: 09-24-15
 */
import java.util.Scanner;

public class DisplayGrid2 {

    public static void printGrid (int numRows, int numColumns) {
        
        for (int r = 0; r < numRows; r++)
        {
            for (int c = 0; c < numColumns; c++) 
            {
                System.out.print ("*");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        String repeat;
        
        Scanner userInput = new Scanner (System.in);
        
        do { 
            int rows = 0, columns = 0;

            while (rows <= 0) 
            { 
                System.out.print ("Enter the number of rows: --> ");
                rows = userInput.nextInt();
            }

            while (columns <=0) 
            {
                System.out.print ("Enter the number of columns: --> ");
                columns = userInput.nextInt();   
            }

            printGrid (rows, columns);

            System.out.print ("\nEnter \"YES\" to repeat: --> ");
            repeat = userInput.next();
                
        } while (repeat.equalsIgnoreCase ("yes"));

    }
    
}
