
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
        
        if (diff == 0) { // equal
            return 0;
        } else { // not equal
            return diff/Math.abs(diff);
        }
    }
}