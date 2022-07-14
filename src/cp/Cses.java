package cp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Cses {
	
	static Long dp [];
	static int n;
	static long mod = 1000000007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 n = sc.nextInt();
		int m  = sc.nextInt();
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		for(int i = 0 ;i < n+ 1 ; i++) adj.add(new ArrayList<>());
		for(int i = 1 ; i <= m  ; i++ ) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			adj.get(u).add(v);
		}
		dp  = new Long[n+1];
		long ans  =dfs(1,adj,dp);
		ans = ans % mod;
		System.out.println((int)ans);
		
		}



	private static long dfs(int node, ArrayList<ArrayList<Integer>> adj, Long[] dp) {
		if(node == n ) return 1;
		if(dp[node] != null) return dp[node];
		long ans = 0;
		for(int child : adj.get(node)) {
			ans += dfs(child,adj,dp) % mod;
		}
		return dp[node] = ans % mod;
		
	}

}
