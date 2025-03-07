import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Get user input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        // Check if the number is prime
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
        
        sc.close();
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}

/*
Input :
Enter a number: 55

Output :
55 is not a prime number.
*/