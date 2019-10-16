
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
        //g is guess value ,chosenNum is the chosen value
        
        int retVal = 0;
        if (g == chosenNum) 
        {
            retVal = 0;
        }
        else if (g > chosenNum)
        { 
            retVal = 1;
        }
       else if ( g < chosenNum)
        {
            retVal = -1;
        }
      
     return retVal;

    }
}