
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
       int highLow;
        if (g > chosenNum) 
            highLow = 1;
            
        else if (g < chosenNum)
            highLow = -1;
            
            else highLow = 0;
           
        
        
        return highLow;

    }
}