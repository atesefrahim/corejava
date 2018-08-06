package string_training;

public class StringPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Cat"; // created at string pool
        String s2 = "Cat"; // before created in string pool has same s1 reference and return same address  
        String s3 = new String("Cat").intern(); // Created at heap as new object and has different address. So is not equal to s1 or s2
        String str = new String("Cat");
        String s4 = "Cat".intern();
        
        System.out.println("s1 == s2 :"+(s1==s2));
        System.out.println("s1 == s3 :"+(s1==s3));
        System.out.println("s1 == s3 :"+(str==s3));
        System.out.println("s1 == s3 :"+(s1==s3));
        
        

	}

}
