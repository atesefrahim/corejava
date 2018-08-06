package string_training;

import java.util.GregorianCalendar;

public class StringBuffervsBuilder {

	public static void main(String[] args) {
		// Compare String Builder and String Buffer
		// String Buffer is thread safe and has more methods
		// String Builder is faster than Buffer
		StringBuffer sbuffer = new StringBuffer("ibrahim");
		StringBuilder sbuilder = new StringBuilder("ibrahim");
		
		
		sbuffer.append(" ates");
		
		System.out.println("sbuffer :"+sbuffer);
		
		
		sbuilder.append(" halil");
		
		System.out.println("sbuilder :"+sbuilder.toString());
		
		System.gc();
		
		long start = new GregorianCalendar().getTimeInMillis();
		long startMermory = Runtime .getRuntime().freeMemory();
		StringBuffer sbf = new StringBuffer();
		
		for (int i=0;i<10000;i++) {
			sbf.append(":"+i);
			sbf.insert(i,"hi");
		}
			
		
		long end = new GregorianCalendar().getTimeInMillis();
		long endMermory = Runtime .getRuntime().freeMemory();
		System.out.println("time :"+(end-start));
		System.out.println("memory :"+(startMermory-endMermory));
		
		System.gc();
		
		long startb = new GregorianCalendar().getTimeInMillis();
		long startMermoryb = Runtime .getRuntime().freeMemory();
		StringBuffer sbd = new StringBuffer();
		
		for (int i=0;i<10000;i++) 
		{
			sbd.append(":"+i);
			sbd.insert(i,"hi");
		}
			
		long endb = new GregorianCalendar().getTimeInMillis();
		long endMermoryb = Runtime .getRuntime().freeMemory();
		System.out.println("time :"+(endb-startb));
		System.out.println("memory :"+(startMermoryb-endMermoryb));

	}

}
