package string_training;

public class Compare {

	public static void main(String[] args) {

        String str = "ABC";
        System.out.println(str.compareTo("ABCd"));
        System.out.println(str.compareToIgnoreCase("abc"));
        System.out.println(str.equals("ABC"));


	}

}
