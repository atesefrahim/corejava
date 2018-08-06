package string_training;

import java.util.HashSet;
import java.util.Set;

public class PermutationFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = "AAC";
        String s1 = "ABC";
        String s2 = "ABCD";
        System.out.println("\nPermutations for " + s + " are: \n" + permutationFinder(s));
        //System.out.println("\nPermutations for " + s1 + " are: \n" + permutationFinder(s1));
        //System.out.println("\nPermutations for " + s2 + " are: \n" + permutationFinder(s2));
		

	}
	public static Set<String> permutationFinder(String str) {
        Set<String> perm = new HashSet<String>();
        //Handling error scenarios
        if (str == null) {
            return null;
        } else if (str.length() == 0) {
            perm.add("");
            return perm;
        }
        char initial = str.charAt(0); // first character
        System.out.println("initial :"+initial);
        String rem = str.substring(1); // Full string without first character
        System.out.println("rem :"+rem);
        Set<String> words = permutationFinder(rem);
        System.out.println("words :"+words);
        for (String strNew : words) {
            for (int i = 0;i<=strNew.length();i++){
            	System.out.println("strNew :"+strNew);
                perm.add(charInsert(strNew, initial, i));
            }
        }
        return perm;
    }


    public static String charInsert(String str, char c, int j) {
        String begin = str.substring(0, j);
        String end = str.substring(j);
        return begin + c + end;
    }

}