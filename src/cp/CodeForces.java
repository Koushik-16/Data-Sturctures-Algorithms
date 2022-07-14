package cp;

import java.util.*;

public class CodeForces {
	

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		    while(t -- > 0) {
		    	
		    	int n = sc.nextInt();
		    	int grid [][] = new int[n][n];
		    	int mat  [][] = new int[n][n];
		    	for(int i = 0 ; i < n ; i++) {
		    		for(int j = 0 ; j < n ; j++) {
		    			mat[i][j] = grid[i][j] = sc.nextInt();
		    		}
		    	}
		    	
		    	int ans = Integer.MAX_VALUE;
		    	for(int i = 1 ; i <= 3 ; i++) {
		    		 rotate(mat);
		    		ans = Math.min(ans, f(grid,mat));
		    	}
		    	System.out.println(ans);
			  
			  }
		    }
	
	private static int f(int[][] grid, int[][] g) {
		int ans = 0;
		for(int i = 0 ; i < grid.length ; i++) {
			for(int j = 0 ; j < grid[0].length ; j++) {
				ans += grid[i][j] ^ g[i][j];
			}
		}
		return ans;
	}

	public static  void rotate(int[][] matrix) {
        if(matrix.length == 1) return ;
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = i ; j < matrix[0].length ; j ++){
              int temp =  matrix[i][j] ;
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
       
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[0].length / 2 ; j ++){
               int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[0].length - 1 - j];
                 matrix[i][matrix[0].length - 1 - j] = temp;
            }
        }
        return ;
    }
	


	static int gcd (int a , int b) {
		if(b == 0 ) return a;
		return gcd(b, a%b);
	}
	
	public static int lowerBound(int arr [],int low, int high, int key) {
		while(low <= high) {
			int mid = (low + high) /2;
			 if(arr[mid] >= key) high = mid - 1;
			else low = mid + 1;
		}
		return low;
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

	private static void swap(int[] ans, int i, int j) {
		int temp = ans[i];
		ans[i] = ans[j];
		ans[j] = temp;
		
	}
		

}

	
