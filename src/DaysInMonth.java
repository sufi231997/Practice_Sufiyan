import java.util.Scanner;
public class DaysInMonth {
	

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the month number (1-12): ");
	        int month = scanner.nextInt();

	        int days;

	        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
	            days = 31;
	        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
	            days = 30;
	        } else if (month == 2) {
	            days = 28;
	        } else {
	            System.out.println("Invalid month number.");
	            return; // Exit the program if an invalid month number is provided
	        }

	        System.out.println("Number of days in the month: " + days);
	    }
	}


