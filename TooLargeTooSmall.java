
/**
 * Write a description of class TooLargeTooSmall here.
 *
 * @author (Manny)
 * @version (06-24-2021)
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
        // compare g to chosen number
        // if g > chosen number return 1
        // if g < chosen number return -1
        // else return 0
        if (g > chosenNum) {
            int greaterNum = 1;
            return greaterNum;
        } else if (g < chosenNum) {
            int lessNum = -1;
            return lessNum;
        } else {
            return 0;
        }
        

    }
}