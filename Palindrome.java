package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		 String orginalString = "MALAYALA";
		 String Reverse = "";
		 
		 // Convert String in to CharArray
		 char[] charArray = orginalString.toCharArray();
		 
		 //Traverse through each char and store the result in Reverse
		 for(int i=charArray.length-1;i>=0;i--) 
			 Reverse = Reverse + orginalString.charAt(i);
			 
			//System.out.println(charArray[i]); 
			 //char character = str.charAt(i);
			 //System.out.println(character);
			 System.out.println(Reverse);
			 if(orginalString.equals(Reverse)) 
				 System.out.println("Entered String is a Palindrome");
			 else
					 System.out.println("Entered String is not a Palindrome");
				 
				 
	}
			 			
}
	

