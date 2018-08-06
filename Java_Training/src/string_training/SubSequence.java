package string_training;

public class SubSequence {

	public static void main(String[] args) {
		
		//
		String str = "ibrahim halil ates";
		
		System.out.println("Last 2 char String: " + str.subSequence(str.length() - 2, str.length()));
		
		System.out.println("First 3 char String: " + str.subSequence(str.length()-str.length(), 3));
		
		System.out.println("First 3 char String: " + str.substring(0, 3));
		
		// substring vs subSequence		
		System.out.println("substring == subSequence ? " + (str.substring(4, 5) == str.subSequence(4, 5)));
		
		// subsequence not equal to substr if == is using
		// but if equals method is used then equal
		System.out.println("substring equals subSequence ? " + (str.substring(4, 5).equals(str.subSequence(4, 5))));
	}
}

