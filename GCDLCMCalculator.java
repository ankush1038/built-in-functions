import java.util.Scanner;

public class GCDLCMCalculator {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Get user input
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        
        // Calculate GCD and LCM
        int gcd = findGCD(num1, num2);
        int lcm = findLCM(num1, num2, gcd);
        
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
        
        sc.close();
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int findLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }
}

/*
Input : 
Enter first number: 3
Enter second number: 4

Output : 
GCD of 3 and 4 is: 1
LCM of 3 and 4 is: 12
*/
