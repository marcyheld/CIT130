import java.util.Scanner; // Needed for the Scanner class
import java.text.DecimalFormat;
/**
   This program calculates male and female percentages.
   Create a method with the following header:
   private static void calcDisplayResults(int f, int m) 
   This method calculates the percentages and displays the results.
   Add a loop to this program in main() to allow multiple entries.
   Start by doing a file save as and name the class MaleFemaleFinal.
   * 
   * Marcy Held
   * Date: 09-17-15
*/

public class MaleAndFemalePercentages2
{
    public static void calcDisplayResults (int f, int m) {
      int total;           // Total number of students
      double percentMale;     // Percentage of male students
      double percentFemale;   // Percentage of female students
      DecimalFormat df = new DecimalFormat("0.0%");
      
      // Calculate the total number of students.
      total = m + f;
      
      // Calculate the percentage of male students using casting.
      percentMale = (double)m / total ;
      
      // Calculate the percentage of female students.
      percentFemale = f / (double)total ;
      
      // Display the percentage of male students.
      System.out.println("Male: " + df.format(percentMale));
      
      // Display the percentage of female students.
      System.out.println("Female: " + df.format(percentFemale));      
      
      
    }
    public static void main(String[] args)
    {
      int male;               // To hold the number of male students
      int female;             // To hold the number of female students
      String doAgain;
      
      do {
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Get the number of male students.
      System.out.print("Enter the number of male students: --> ");
      male = keyboard.nextInt();
      
      // Get the number of female students.
      System.out.print("Enter the number of female students: --> ");
      female = keyboard.nextInt();
      
      calcDisplayResults (female, male);
      
      System.out.print ("Enter 'YES' to repeat --> ");
      doAgain = keyboard.next();
      } while (doAgain.equalsIgnoreCase("yes"));

    }
}
