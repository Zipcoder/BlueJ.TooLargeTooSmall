
/**
 * Write a description of class TooLargeTooSmall here.
 *
 * @author John Song
 * @version 1.0
 */
public class TooLargeTooSmall {
    private Integer chosenNum;

    /**
     * Constructor for objects of class TooLargeTooSmall
     */
    public TooLargeTooSmall(Integer seed) {
        // initialise instance variables
        chosenNum = seed;
        
    }
    
    public Integer guess(Integer g) {
        
        if (g > chosenNum) {
            return 1;
        }
         if (g < chosenNum) {
            return -1;
        }
        else {
            return 0;
        }
        

    }
}