package cp;

import java.util.*;


public class Codechef {
	
	static int gcd (int a , int b) {
		if(b == 0 ) return a;
		return gcd(b, a%b);
	}
	
	
	static  class Pair {
        int val ;
        int ind;
        Pair(int val, int ind){
            this.val = val;
            this.ind = ind;
        }
    }
	

	public static void main(String[] args) {
          try {
			
			Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			while(t -- > 0) {	
			    int n = sc.nextInt();
			    String s = sc.next();
			    int count = 0;
		        int i = n-1;
		        while( i >= 0 && s.charAt(i) == '1') i--;
		        while(i >= 0){
		            if(i >= 0 && s.charAt(i) == '0'){
		            i--;
		            continue;
		          }  
		           if(i >= 0 && s.charAt(i) == '1'){
		           while(i >= 0  && s.charAt(i) == '1') i--;
		             count++;
		         }   
		        }
		        System.out.println(count);
			}
		
		} catch(Exception e) {
			return ;
		}
		 
		
	}
	


	public static long pow(long x, long n, long d) {
		if(n == 0 ) return 1 % d;
		if(x < 0) return pow(x + d, n , d);
		if(n == 1) return x % d;
		long ans = 1;
		while(n > 0 ){
			if(n % 2 == 0){
				x = x * x % d;
				n = n /2;
			}else {
				ans  = (ans * x) % d;
				n = n -1;
			}
		}
		return ans % d;
	}
	
	

	public static int numSetBits(long a) {
        int counter = 0;
	 while(a != 0) {
		 a = (a&(a-1));
		 counter++;
	 }
	 return counter;
    }



	private static boolean isVowel(char ch) {
		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	}


}
