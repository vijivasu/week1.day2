package week1.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


		String text = "We Learn Java Basics As Part Of Java Sessions In Java Week1";
		
		int count =0;
		
		//Split the String based on WhiteSpaces
		String[] split = text.split(" ");
		//Print the 4th Index
		System.out.println(split[4]);
		
		for(int i=0;i<split.length;i++) {
			for(int j=0;j<split.length;j++) {
				if(split[i].equals(split[j])) {
					count++;
				}
			}
			if(count>1) {
				text = text.replace(split[i], "");
				
			}
			count=0;
		}
System.out.println(text);
		
		
		
		
		
}
			
}
				
					
					
			
		
					
				
	
		
		
	

		
					
						
						
				
				
				
					
				
				
					
		
			
				
			
		
				
     
			


		
		
		
			
			
			
		
		
		



