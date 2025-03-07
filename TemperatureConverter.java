import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Get user input
        System.out.print("Enter temperature: ");
        double temperature = sc.nextDouble();
        
        System.out.print("Convert to (C/F): ");
        char choice = sc.next().charAt(0);
        
        if (choice == 'C' || choice == 'c') {
            System.out.println("Temperature in Celsius: " + fahrenheitToCelsius(temperature));
        } else if (choice == 'F' || choice == 'f') {
            System.out.println("Temperature in Fahrenheit: " + celsiusToFahrenheit(temperature));
        } else {
            System.out.println("Invalid choice!");
        }
        
        sc.close();
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
