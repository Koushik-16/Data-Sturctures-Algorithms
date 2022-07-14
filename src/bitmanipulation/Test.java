package bitmanipulation;

public class Test {

	public static void main(String[] args) {
		int n = 2;
//		int b = (int)(Math.log10(a) /Math.log10(2));
		 int b =  (int)((Math.log10(n & -n)) / Math.log10(2)) + 1;
         System.out.println(b);
		 
		 
		  
		
	}

}
