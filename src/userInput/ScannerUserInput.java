package userInput;
import java.util.Scanner;

public class ScannerUserInput {

	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
		
	
//	int principal = sc.nextInt();
//	float rate = sc.nextFloat();
//    int time = sc. nextInt();
//			
//	float simpleInterest = principal * rate * time / 100;		
//	
//	
//	System.out.println("the simple interest is " + simpleInterest);   
	
	   int n = sc.nextInt();
	   
	   int sum = 0;
	   
		for(int i = n; i <= 50; i = i + 2) {
			sum = sum + i;
			
		}
		
		System.out.println(sum);   
	   
	}

}