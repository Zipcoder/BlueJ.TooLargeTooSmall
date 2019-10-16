
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
        chosenNum = seed;
    }

    public Integer guess(Integer g) {
       
        if (g < chosenNum) {
        return -1;                      // guess is too small
        } else if (g == chosenNum) {    // guess is equal to the chosen number
        return 0;
        } else {                        // guess is too large
        return 1;
        }

    }
}