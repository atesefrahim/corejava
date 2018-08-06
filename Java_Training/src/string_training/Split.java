package string_training;

import java.util.Arrays;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line = "my name is efrahim";

		String[] words = line.split(" ");

		String[] twoWords = line.split(" ", 2);

		System.out.println("String split with delimiter: " + Arrays.toString(words));

		System.out.println("String split into two: " + Arrays.toString(twoWords));

		// split string delimited with special characters
		String wordsWithNumbers = "my|name|is|efrahim";

		String[] numbers = wordsWithNumbers.split("\\|");

		System.out.println("String split with special character: " + Arrays.toString(numbers));

	}

}
