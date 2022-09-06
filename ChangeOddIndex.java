package week1.day2;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class ChangeOddIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "changeme";
		int length = str.length();
		
		
		char[] charArray = str.toCharArray();
		
		for(int i=0;i<charArray.length;i++) {
			if(i%2 != 0) {
			 char output = charArray[i];
			 System.out.println(Character.toUpperCase(output));	 
				
			}
			else {
				System.out.println(" " +charArray[i]+ " ");
			}
			
		}
	}

}
