
/**
 * Exam 1, program 1
 * @author Marcy Held
 * Date: 09-24-15
 */
import java.util.Scanner;

public class DisplayGrid {

    public static void main(String[] args) {
        int rows = 0, columns = 0;
        
        Scanner userInput = new Scanner (System.in);
        
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
        
        for (int r = 0; r < rows; r++)
        {
            for (int c = 0; c < columns; c++) 
            {
                System.out.print ("*");
            }
            System.out.println();
        }
 
    }
    
}
