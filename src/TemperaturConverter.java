import java.util.Scanner;
public class TemperaturConverter {
	

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter temperature in Celsius: ");
	        double celsius = scanner.nextDouble();

	        double fahrenheit = celsiusToFahrenheit(celsius);
	        double kelvin = celsiusToKelvin(celsius);

	        System.out.println("Temperature in Fahrenheit: " + fahrenheit + " °F");
	        System.out.println("Temperature in Kelvin: " + kelvin + " K");
	    }

	    public static double celsiusToFahrenheit(double celsius) {
	        return 1.8 * celsius + 32;
	    }

	    public static double celsiusToKelvin(double celsius) {
	        return celsius + 273;
	    }
	}


