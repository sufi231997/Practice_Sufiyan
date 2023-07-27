import java.util.Scanner;
public class Basics_java {
	

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Input the number of seconds: ");
	        int totalSeconds = scanner.nextInt();

	        int hours = totalSeconds / 3600;
	        int remainingSecondsAfterHours = totalSeconds % 3600;
	        int minutes = remainingSecondsAfterHours / 60;
	        int seconds = remainingSecondsAfterHours % 60;

	        System.out.println("Output:");
	        System.out.println(hours + " hours " + minutes + " minutes " + seconds + " seconds");
	    }
	}

