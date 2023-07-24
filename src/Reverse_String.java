
public class Reverse_String {

	    public static void main(String[] args) {
	        String input = "test";
	        String reversedString = reverse(input);
	        System.out.println("Reversed String: " + reversedString);
	    }

	    public static String reverse(String str) {
	        char[] chars = str.toCharArray();
	        int left = 0;
	        int right = chars.length - 1;

	        while (left < right) {
	            // Swap characters at left and right indices
	            char temp = chars[left];
	            chars[left] = chars[right];
	            chars[right] = temp;

	            // Move the pointers inward
	            left++;
	            right--;
	        }

	        return new String(chars);
	    }
	}

