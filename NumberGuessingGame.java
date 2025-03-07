import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        int low = 1, high = 100, guess;
        String feedback;
        
        System.out.println("Think of a number between 1 and 100, and I will try to guess it!");
        
        while (true) {
            guess = generateGuess(low, high, random);
            System.out.println("Is your number " + guess + "? (Enter 'high', 'low', or 'correct')");
            feedback = sc.next();
            
            if (feedback.equalsIgnoreCase("correct")) {
                System.out.println("Great! I guessed your number correctly!");
                break;
            } else if (feedback.equalsIgnoreCase("high")) {
                high = guess - 1;
            } else if (feedback.equalsIgnoreCase("low")) {
                low = guess + 1;
            } else {
                System.out.println("Invalid input. Please enter 'high', 'low', or 'correct'.");
            }
        }
        
        sc.close();
    }

    public static int generateGuess(int low, int high, Random random) {
        return low + random.nextInt(high - low + 1);
    }
}

/*
Output : 
Think of a number between 1 and 100, and I will try to guess it!
Is your number 26? (Enter 'high', 'low', or 'correct')
low
Is your number 54? (Enter 'high', 'low', or 'correct')
high
Is your number 49? (Enter 'high', 'low', or 'correct')
correct
Great! I guessed your number correctly!
*/
