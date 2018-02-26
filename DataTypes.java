
/**
 * This program uses various data types.
 * @author Marcy Held
 * 08-18-15
 */
public class DataTypes {

    public static void main(String[] args) {
        byte verySmall = 4; // plus/minus 126/128 range / 1 byte of mem
        short small = -541; // 2 bytes of mem
        int standard = 15471; // !! no formatting when assigning values (ie no commas)
        long big = 285471943251L; // don't forget the suffix!!! can be upper or lower
        
        float smallF = 14.5f; // can't use variables w same name in same block of code!
        double large = 5831.12;
        
        char letter = '6';
        boolean isEmpty = true;
        
        final int NUMBER_OF_MONTHS = 12; // can use '_' and '?' in variable names
        
        small = (short) (standard / NUMBER_OF_MONTHS); // explicit casting!
        // can't cast each side of division sign, cannot cast a constant
        // this way, completes the calculation and then casts the answer
        
        large = (double) small / verySmall; 
        // must cast, outcome will always be a whole number even if the 
        // answer is assigned to a data type that can hold a fractional value
        // without casting, answer is 322.0, not 322.25
        
        System.out.println ("The value of large is " + large);
        
    }
    
}
