package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Array1[] = {3,2,11,4,6,7};
		int Array2[] = {1,2,8,4,9,7};
		
		int Len = Array1.length;
		System.out.println(Len);

		for(int i=0;i<Array1.length;i++) {
			for(int j=0;j<Array2.length;j++) 
				if(Array1[i]==Array2[j]) {
					
					System.out.print(Array1[i]);
				}
				
			}
		}
		
	}


