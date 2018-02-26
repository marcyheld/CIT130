
import java.util.Scanner; // Needed for the Scanner class
import java.util.Random;  // Needed for the Random class

/**
* This program demonstrates the Random class.
* (Mr. Smith's solution)
* 
* Marcy Held
* Date: 09-08-15
*/

public class MathTutor2B
{
   public static void main(String[] args)
   {
      int number1;      // A number
      int number2;      // Another number
      int sum;          // The sum of the numbers
      int userAnswer;   // The user's answer
      int correct = 0;
      int answers = 0;
      double percent;
      String doAgain;
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Create a Random class object.
      Random randomNumbers = new Random();
      
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
      answers++;

      // Display the user's results.
      if (userAnswer == sum)
      {   System.out.println("Correct!");
            correct++; 
      }
      else
      {
         System.out.println("Sorry, wrong answer. " +
                            "The correct answer is " +
                            sum);
      }
      
      System.out.print ("Enter \"YES\" to repeat --> ");
      doAgain = keyboard.next();
      }
      while (doAgain.equalsIgnoreCase ("yes"));
      
      percent = ((double) correct / answers) * 100.0;
      System.out.printf ("\nThe percent correct is %.1f percent\n", percent);   
   }
}
