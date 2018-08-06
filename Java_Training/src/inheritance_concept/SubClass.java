package inheritance_concept;

public class SubClass  extends SuperClass {

 public void multiplication(int y, int z) {
	 sum =y * z;
	 System.out.println("multiplication :"+sum);
 }
 public static void main(String args[]) {
     int a = 20, b = 10;
     SubClass demo = new SubClass();
     demo.SumInt(a, b);
     demo.multiplication(a, b);
  }
}
