package string_training;

public class RemoveChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str = "�brahim Ate�";
     
     char c = ' ';
     String newStr = removeChar(str, c);
     String newStr2 = str.toUpperCase();
     System.out.println("newstr :"+newStr2);
	}
	
	private static String removeChar(String str, char c) {
        if (str == null)
            return null;
        return str.replaceAll(Character.toString(c), "");
    }

}
