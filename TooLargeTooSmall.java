
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
        int LowHI = 0;
        
        if (g > chosenNum ){
         
            LowHI = 1;
        
       
    }
        else if ( g == chosenNum){
        
        LowHI = 0;
    }
        else
        LowHI = -1;
        
         return LowHI;
        
        }
        
    } 
        

         
    

