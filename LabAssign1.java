
/**
 * This is lab 1.
 * @author Marcy Held
 * Date: 08-26-15
 */
import java.util.Scanner;

public class LabAssign1 {

    public static void main(String[] args) {
        double time1, time2, time3, 
                first = 0, second = 0, third = 0;
        String runner1, runner2, runner3, 
                firstRunner = "", secondRunner = "", thirdRunner = "";
        
        Scanner scanInfo = new Scanner (System.in);
        
        // Intro text
        System.out.println ("This program displays the first, second, "
                + "and third\nplace runners in a race.");
        System.out.println ("No ties, please.\n");
        
        // Get input for 1st runner
        System.out.print ("Enter the first runner's name: --> ");
        runner1 = scanInfo.nextLine ();
        System.out.print ("Enter the first runner's time: --> ");
        time1 = scanInfo.nextDouble();
        
        scanInfo.nextLine();
        
        // Get input for 2nd runner
        System.out.print ("Enter the second runner's name: --> ");
        runner2 = scanInfo.nextLine ();
        System.out.print ("Enter the second runner's time: --> ");
        time2 = scanInfo.nextDouble();
        
        scanInfo.nextLine ();
        
        // Get input for 3rd runner
        System.out.print ("Enter the third runner's name: --> ");
        runner3 = scanInfo.nextLine ();
        System.out.print ("Enter the third runner's time: --> ");
        time3 = scanInfo.nextDouble();
        
        // Outcome possibilities if runner 1 comes in first
        // runner1, runner2, runner3
        if (time1 < time2 && time2 < time3) {
           first = time1;
           second = time2;
           third = time3;
           firstRunner = runner1;
           secondRunner = runner2;
           thirdRunner = runner3;
        }
        // runner1, runner3, runner2
        else if (time1 < time3 && time3 < time2) {
            first = time1;
            second = time3;
            third = time2;
            firstRunner = runner1;
            secondRunner = runner3;
            thirdRunner = runner2; // could use an ELSE here, for 
                                    // runner3 coming in second
        }
        
        // Outcome possibilities if runner 2 comes in first
        // runner2, runner1, runner3
        else if (time2 < time1 && time1 < time3) {
            first = time2;
            second = time1;
            third = time3;
            firstRunner = runner2;
            secondRunner = runner1;
            thirdRunner = runner3;
        }
        // runner2, runner3, runner1
        else if (time2 < time3 && time3 < time1) {
            first = time2;
            second = time3;
            third = time1;
            firstRunner = runner2;
            secondRunner = runner3;
            thirdRunner = runner1;
        }
        
        // Outcome possibilities if runner 3 comes in first
        // runner3, runner1, runner2
        else if (time3 < time1 && time1 < time2) {
            first = time3;
            second = time1;
            third = time2;
            firstRunner = runner3;
            secondRunner = runner1;
            thirdRunner = runner2;
        }
        // runner3, runner2, runner1
        else if (time3 < time2 && time2 < time1) {
            first = time3;
            second = time2;
            third = time1;
            firstRunner = runner3;
            secondRunner = runner2;
            thirdRunner = runner1;
        }
        
        // Display output
        System.out.println ("\n1st place: " + firstRunner + ", " + 
                "Time: " + first);
        System.out.println ("2nd place: " + secondRunner + ", " +
                "Time: " + second);
        System.out.println("3rd place: " + thirdRunner + ", " +
                "Time: " + third); 
    }
    
}
