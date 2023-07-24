

	import java.util.HashSet;
	import java.util.Set;

	public class Remove_duplicates {
	    public static void main(String[] args) {
	        String input = "aaabcbabcbabbc";
	        String output = removeDuplicates(input);
	        System.out.println("Output: " + output);
	    }

	    public static String removeDuplicates(String input) {
	        StringBuilder result = new StringBuilder();
	        Set<Character> seenChars = new HashSet<>();

	        for (char c : input.toCharArray()) {
	            if (!seenChars.contains(c)) {
	                result.append(c);
	                seenChars.add(c);
	            }
	        }

	        return result.toString();
	    }
	}


