
/**
 *
 * @author Marcy Held, Joshua Rodstein, Joey Reidell, Dante Zitello
 * Date: 10-13-15
 */
import java.util.Arrays;
import java.util.Random;


public class RandomArrayDemo2 {

    public static void main(String[] args) {
        int evenIndex = 0, oddIndex = 0, y = 0, x = 0;
        
        // create array of random values, display array's content
        int [] randArray = new int [15];
        Random getNumbers = new Random ( );
        
        /* This is the code we wrote, it doesn't actually work because
        if a new random number is generated in the inner for loop, it is not
        checked against the other previous numbers in the array.
        
        for (int index = 0; index < randArray.length; index++)
        {
            randArray[index] = getNumbers.nextInt (50) + 1; 
            for (int r = 0; r < index; r++)
            {
                if (randArray[index] == randArray[r])
                    randArray[index] = getNumbers.nextInt (50) + 1;
            }
        }
        Mr. Smith's code is below, this is the code that works. Once a duplicate
        number is found, the program decrements index and drops out of the
        inner for loop to generate a new random number in the outer for loop, and
        then check that new random number against all of the other numbers in 
        the array.
        */
        for (int index = 0; index < randArray.length; index++)
        {
            randArray[index] = getNumbers.nextInt (50) + 1;
            for (int r = 0; r < index; r++)
            {
                if (randArray[index] == randArray[r])
                {
                    --index;
                    break;
                }
            }
        }
        
        System.out.println ("Random array: ");
        System.out.println(Arrays.toString(randArray));
        
        // determine number of even and odd numbers
        for (int i = 0; i < randArray.length; i++)
        {
            if ((randArray[i] % 2) == 0)
                evenIndex++;
            else
                oddIndex++;     
        }
        
        // create 2 arrays to hold even and odd values
        int [] evenArray = new int [evenIndex];
        int [] oddArray = new int [oddIndex];
        
        for (int i = 0; i < randArray.length; i++) 
        {
            if ((randArray[i] % 2) == 0) 
            {
                evenArray[y] = randArray[i];
                y++;
            } else 
            {
                oddArray[x] = randArray[i];
                x++;
            }
        }
        System.out.println ("Even array: ");
        System.out.println(Arrays.toString(evenArray));
        
     
        System.out.println ("Odd array: ");
        System.out.println(Arrays.toString(oddArray));
        
        // sort even array and odd array
        Arrays.sort (evenArray);
        Arrays.sort (oddArray);
        
        System.out.println ("Even array: ");
        System.out.println(Arrays.toString(evenArray));
        
     
        System.out.println ("Odd array: ");
        System.out.println(Arrays.toString(oddArray));
        
        // sort randArray, print out highest value
        Arrays.sort(randArray);
        System.out.println("Highest value is " + 
                (randArray[randArray.length - 1]));
    }
    
}
