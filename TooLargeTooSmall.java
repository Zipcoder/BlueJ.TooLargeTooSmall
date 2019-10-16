/**
 * Write a description of class TooLargeTooSmall here.
 *
 * @author Wesley Jones
 * @version 16 Oct 2019
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
            return 1;       // guess is greater than chosen num
        } 
        else if (g == chosenNum) {
            return 0;       // guess is same as chosen num
        } 
        else {
            return -1;      // guess is less than chosen num
        }
        

    }
}