import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Get user input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        // Calculate factorial
        long result = factorial(num);
        
        System.out.println("Factorial of " + num + " is: " + result);
        
        sc.close();
    }

    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}

/*
Input : 
Enter a number: 4

Output : 
Factorial of 4 is: 24
*/