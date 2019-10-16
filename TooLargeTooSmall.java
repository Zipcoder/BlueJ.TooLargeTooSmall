
/**
 * Write a description of class TooLargeTooSmall here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TooLargeTooSmall {
    private Integer chosenNum;

    /**
     * Constructor for objects of class TooLargeTooSmall
     */
    public TooLargeTooSmall(Integer seed) {
        // initialise instance variables
        this.chosenNum = seed;
    }
    
    public Integer guess(Integer g) {
        int diff = g - this.chosenNum;
        
        if (diff == 0) {
            return 0;
        } else { // too small: -1
            return diff/Math.abs(diff);
        }
    }
}