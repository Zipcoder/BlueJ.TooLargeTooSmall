
/**
 * Write a description of class TooLargeTooSmall here.
 * 
 * @author (John Ellis)
 * @version (version1)
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
        Integer result;
    
    
    
        if (g.equals(chosenNum)) {
            return 0;
        } else if (g < chosenNum) {
            return -1;
        } else {
            return 1;
        }
        
        
    
        
        
        

    }
}