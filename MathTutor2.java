
import java.util.Scanner; // Needed for the Scanner class
import java.util.Random;  // Needed for the Random class
import java.text.NumberFormat;
/**
   * This program demonstrates the Random class.
   * 
   * Marcy Held
   * Date: 09-08-15
*/

public class MathTutor2
{
   public static void main(String[] args)
   {
      int number1;      // A number
      int number2;      // Another number
      int sum;          // The sum of the numbers
      int userAnswer;   // The user's answer
      int correct = 0;
      int total = 0;
      double percentageCorrect;
      String input;
      char answer;
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Create a Random class object.
      Random randomNumbers = new Random();
      
      NumberFormat percentFormat = NumberFormat.getPercentInstance();
      percentFormat.setMaximumFractionDigits(1);
      
      do {
      
      // Get two random numbers
      number1 = randomNumbers.nextInt(100);
      number2 = randomNumbers.nextInt(100);

      // Display an addition problem.
      System.out.println("What is the answer to the " +
                         "following problem?");
      System.out.print(number1 + " + " +
                       number2 + " = ? ");

      // Calculate the answer.
      sum = number1 + number2;

      // Get the user's answer.
      userAnswer = keyboard.nextInt();
      
      //keyboard.nextLine();

      // Display the user's results.
      if (userAnswer == sum)
      {   System.out.println("Correct!");
            correct++; 
            total++; }
      else
      {
         System.out.println("Sorry, wrong answer. " +
                            "The correct answer is " +
                            sum);
         total++;
      }
      
      System.out.print ("Type 'y' to repeat --> ");
      input = keyboard.next();
      answer = input.charAt(0);
      }
      while (answer == 'y' || answer == 'Y');
      
      percentageCorrect = (double) correct / total;
      System.out.println ("\nThe percent correct is " + 
              percentFormat.format(percentageCorrect));
      
   }
}
