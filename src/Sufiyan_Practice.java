
public class Sufiyan_Practice {
	  public static void main(String[] args) {
	        int num1 = 10;
	        int num2 = 34;
	        int num3 = 12;

	        int maxNumber = findMax(num1, num2, num3);
System.out.println("The maximum number among " + num1 + ", " + num2 + ", and " + num3 + " is: " + maxNumber);
	    }

	    public static int findMax(int a, int b, int c) {
	        // Compare a and b to find the maximum of the first two numbers
	        int maxOfFirstTwo = Math.max(a, b);

	        // Compare the maximum of the first two with the third number to get the final maximum
	        int maxNumber = Math.max(maxOfFirstTwo, c);

	        return maxNumber;
	    }
	}

