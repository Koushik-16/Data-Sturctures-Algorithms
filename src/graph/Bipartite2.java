package graph;

import java.util.ArrayList;

public class Bipartite2 {
	
	public static boolean checkBipartite(ArrayList<ArrayList<Integer>> adj , int n) {
		int color [] = new int[n];
		for(int i = 0 ; i <  n ; i++) {
			color[i] = -1;
		}
		for(int i = 0 ; i < n  ; i++) {
			if(color[i] == -1) if(!checkhdfs(adj,i,color)) return false;
		}
		return true;
	}

	public static boolean checkhdfs(ArrayList<ArrayList<Integer>> adj, int node, int[] color) {
		if(color[node] == -1) color[node] = 1;
		for(Integer it : adj.get(node)) {
			if(color[it] == -1) {
				color[it] = 1 - color[node];
				if(!checkhdfs(adj,it,color)) return false;
			}else if(color[it] == color[node]) return false;
		}
			
		return false;
	}

	public static void main(String[] args) {
		

	}

}
