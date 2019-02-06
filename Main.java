import java.util.Scanner;
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args){
        int number = (int)(Math.random() * 100 + 1);
        
        int count = 0;
        
        Scanner userInput = new Scanner(System.in);
        int previousGuess = -1;    
        while(true) {
            System.out.println("Guess a Number from 1 to 100");

            int userGuess = userInput.nextInt();
            System.out.println("You guess " + userGuess);
        
            if (number > userGuess){
                System.out.println("too small");
            } else if (number < userGuess){
                System.out.println("too big");
            } else if(number == userGuess){
                System.out.println("correct guess");
                System.out.println("Number of Guesses " + count);
                break;
            }
            
            if(previousGuess != userGuess){
                count++;
                previousGuess = userGuess;
            }
        }
        
        
        
        System.out.println("The magic number is " + number);
    }
}
