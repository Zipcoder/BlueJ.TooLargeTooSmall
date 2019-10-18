
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
       
        chosenNum = seed;
    }
    
    public Integer guess(Integer g) {
       if (chosenNum == g)  {
           return 0;
        }else if (g < chosenNum){
            return -1;
        }else   {
            return 1;
    }
}
}