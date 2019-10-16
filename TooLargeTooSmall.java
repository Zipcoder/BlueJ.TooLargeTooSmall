
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
        
        if (g == this.chosenNum) { // correct guess: 0
            return 0;
        } else if (g > this.chosenNum) { // too big: 1
            return 1;
        } else { // too small: -1
            return -1;
        }
    }
}