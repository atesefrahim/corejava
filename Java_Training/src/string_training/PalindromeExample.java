package string_training;

public class PalindromeExample {
	public static void main(String[] args) {
		
        boolean b = isPalindromeusefunction("ababa");
        System.out.println("isPalindrome :"+b);
        
        boolean b2 = isPalindromeusefunction2("ibrahim");
        System.out.println("isPalindrome :"+b2);
        
        boolean b3 = isPalindromeusenonfunction("ababa");
        System.out.println("isPalindrome :"+b3);
        

	}
	private static boolean isPalindromeusefunction(String str) {
        if (str == null)
            return false;
        
        StringBuffer strBuffer = new StringBuffer().append(str);
        strBuffer.reverse();
        return strBuffer.toString().equals(str);
    }
	private static boolean isPalindromeusefunction2(String str) {
        if (str == null)
            return false;

    	StringBuilder strBuilder = new StringBuilder(str);
        strBuilder.reverse();
        return strBuilder.toString().equals(str);
    }
	private static boolean isPalindromeusenonfunction(String str) {
		if (str == null) {
			return false;
		}
		int lenght = str.length();
		System.out.println(lenght/2);
		for (int i = 0; i< lenght / 2; i++) {
			if (str.charAt(i)!=str.charAt(lenght-i-1)) {
				return false;
			}
		}
		return true;
		
	}

}
