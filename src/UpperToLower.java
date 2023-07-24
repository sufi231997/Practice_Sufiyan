
public class UpperToLower {

	 public static void main(String[] args) {
	        String inputString = "AbC#$dEf";
	        String convertedString = swapCase(inputString);
	        System.out.println("Converted String: " + convertedString);
	    }

	    public static String swapCase(String input) {
	        char[] chars = input.toCharArray();

	        for (int i = 0; i < chars.length; i++) {
	            char c = chars[i];
	            if (Character.isUpperCase(c)) {
	                chars[i] = Character.toLowerCase(c);
	            } else if (Character.isLowerCase(c)) {
	                chars[i] = Character.toUpperCase(c);
	            }
	            // No action needed for special characters
	        }

	        return new String(chars);
	    }
	




}
