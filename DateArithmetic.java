import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter a date (YYYY-MM-DD): ");
        String inputDate = sc.nextLine();
        
        LocalDate date = LocalDate.parse(inputDate);
        
        // Perform date arithmetic
        LocalDate modifiedDate = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
        
        // Display results
        System.out.println("Modified Date: " + modifiedDate);
        
        sc.close();
    }
}
