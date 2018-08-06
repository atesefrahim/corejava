package string_training;

import java.util.Arrays;

public class ByteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ibrahimates";
		charToByteArray(s);
		byteArrayToString(s);

	}
	private static void charToByteArray(String str) {
				//string to char array
				char[] chars = str.toCharArray();
				System.out.println(chars.length);
				
				//char at specific index
				char c = str.charAt(2);
				System.out.println(c);
				
				//Copy string characters to char array
				char[] chars1 = new char[7];
				str.getChars(0, 7, chars1, 0);
				System.out.println(chars1);
	}

	private static void byteArrayToString(String str) {
		//string to char array
		byte[] byteArr = str.getBytes();
		// print the byte[] elements
		System.out.println("String to byte array: " + Arrays.toString(byteArr));
	}

}
