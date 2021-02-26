
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
            if ( chosenNum > g ){
            return -1;}
         else if 
              (chosenNum < g){
            return 1;}
            else {
              return 0;}    
      
          
         
       

    }
}