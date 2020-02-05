
/**
 * 
 * Checks to see if guess is equal to chosen number.
 * @David Comer
 * @2/5/21
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
        if (chosenNum == g){
            return 0;}
        else if (chosenNum > g){
             return -1;}
        else if (chosenNum < g){
            return 1;}

        return chosenNum;

    }
}