import javax.swing.JOptionPane;

/**
 *
 * @author Marcy Held
 * Date: 10-14-15
 */
public class Packet_FindDiscount {

    public static void main(String[] args) {
        final int NUM_RANGES = 5;
        int [] discountRangeLimit = {1, 13, 50, 100, 200};
        double [] discountRate =    {0.00, 0.10, 0.14, 0.18, 0.20};
        double customerDiscount;
        String strNumOrdered;
        int numOrdered;
        int sub = (NUM_RANGES - 1);
        
        strNumOrdered = JOptionPane.showInputDialog (null,
                "How many items are ordered?");
        numOrdered = Integer.parseInt(strNumOrdered);
        
        while (sub >= 0 && numOrdered < discountRangeLimit [sub])
        {    --sub;
        
        }
        
        customerDiscount = discountRate[sub];
        
    JOptionPane.showMessageDialog (null, "Discount rate for " +
            numOrdered + " items is " + customerDiscount);
        
        System.exit(0);
    }
    
}
