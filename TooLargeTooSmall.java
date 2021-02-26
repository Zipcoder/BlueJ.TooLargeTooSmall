
/**
 * Write a description of class TooLargeTooSmall here.
 *
 * @author Gregory Donnelly
 * @version 2.24.2021
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
        } else if (g == chosenNum) {
            return 0;
        } else {
            return -1;
        }
}
}