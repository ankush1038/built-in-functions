import java.util.Scanner;

public class FibonacciSequence {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Get user input
        System.out.print("Enter the number of terms: ");
        int terms = sc.nextInt();
        
        // Generate and print Fibonacci sequence
        generateFibonacci(terms);
        
        sc.close();
    }

    public static void generateFibonacci(int terms) {
        int first = 0, second = 1;
        
        System.out.print("Fibonacci Sequence: ");
        
        for (int i = 0; i < terms; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}

/*
Input : 
Enter the number of terms: 5

Output : 
Fibonacci Sequence: 0 1 1 2 3
*/