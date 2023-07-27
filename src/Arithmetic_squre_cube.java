import java.util.Scanner;
public class Arithmetic_squre_cube {
	

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Input: ");
	        int number = scanner.nextInt();

	        int square = number * number;
	        int cube = number * number * number;
	        int fourthPower = number * number * number * number;

	        System.out.println("square: " + square);
	        System.out.println("cube: " + cube);
	        System.out.println("fourth power: " + fourthPower);
	    }
	}


