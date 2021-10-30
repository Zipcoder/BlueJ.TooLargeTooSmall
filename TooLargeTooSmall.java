
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
        int result = 0;
        
        if (g < chosenNum) {
            result = -1;
            return result;
        } else if (g == chosenNum) {
            result = 0;
            return result;
        } else if (g > chosenNum) {
            result = 1;
            return result;
        }
        System.out.println(result + ", " + chosenNum + ", " + g);
        
        return chosenNum;
    }
}