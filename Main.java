/**
 * Created by Francisco Castro on 05Feb2019.
 */
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(  ){
        System.out.print('\u000C');
        int guessNumber;
        Random rand = new Random();
        int firstNumber = rand.nextInt( 20 + 1 );
        int secondNumber = rand.nextInt( 20 + 1 );
        int maxNumber, minNumber;
        if(firstNumber > secondNumber){
            maxNumber = firstNumber;
            minNumber = secondNumber;
        }
        else{
            maxNumber = secondNumber;
            minNumber = firstNumber;
        }
        if( (maxNumber - minNumber) < 10 ){
            maxNumber += 10;
            minNumber -= 10;
        }
        
        // UNCOMMENT THE NEXT LINE TO KNOW THE VALID RANGE
        // System.out.println( "The range is between " + maxNumber + " " + minNumber );
        Scanner input = new Scanner(System.in);
        int countMax = 0;
        int countMin = 0;
        int nextNumber;
        int dummy = 9999;
        do{
            System.out.print("Make a guess: ");
            guessNumber = input.nextInt();
            if(guessNumber > maxNumber){
                System.out.println( "Too big" );
                nextNumber = guessNumber;
                if(countMax > 0){
                    if( dummy == guessNumber ){
                        countMax--;
                    }
                }
                countMax++;
            }
            else if(guessNumber < minNumber){
                System.out.println( "Too small" );
                nextNumber = guessNumber;
                if(countMin > 0){
                    if( dummy == guessNumber ){
                        countMin--;
                    }
                }
                countMin++;
            }
            else{
                System.out.println( "You got it!" );
                break;
            }
            dummy = nextNumber;
            //System.out.println( "--" + dummy );
        }while( true );
        System.out.println( "\nLarge_counter: " + countMax );
        System.out.println( "Small_counter: " + countMin );
        System.out.println( "Total_counter: " + (countMax + countMin + 1) );
        System.out.println( "\nThe \"You got it\" range was between " + maxNumber + " " + minNumber );
    }
    
}