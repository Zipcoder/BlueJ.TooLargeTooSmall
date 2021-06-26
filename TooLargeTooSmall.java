
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
        //if guess is greater than chosenNum, then chosenNum = 1
        //if less than, then -1
        //if equal then 0
        
        int output; 
        if (g > chosenNum){
            output = 1;
        } else if (g < chosenNum) {
            output = -1;
        } else {
            output = 0; }
        return output;

    }
}