
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
    
    public Integer guess(Integer guess) {
        Integer result;
        
        if(chosenNum == guess){
        result = 0;
        } 
        else if (chosenNum > guess){
        result = -1;
        }
        else{
        result = 1;
        }
        
        
    
        return result;

    }
}