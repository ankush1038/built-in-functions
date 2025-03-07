import java.util.Scanner;

public class MaxThreeNumbers {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Get user input
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();
        
        // Find maximum
        int max = findMax(num1, num2, num3);
        
        System.out.println("The maximum number is: " + max);
        
        sc.close();
    }

    public static int findMax(int a, int b, int c) {
        int max = a;
        
        if (b > max) {
            max = b;
        }
        
        if (c > max) {
            max = c;
        }
        
        return max;
    }
}

/*
Input : 
Enter first number: 21
Enter second number: 12
Enter third number: 33

Output : 
The maximum number is: 33
*/
