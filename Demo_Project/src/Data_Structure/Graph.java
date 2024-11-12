package Data_Structure;

import java.util.*;

public class Graph {
	public static void addEdge(List<List<Integer>> adj, int i, int j) {
		adj.get(i).add(j);
		adj.get(j).add(i);
	}
	
	public static void showMat(List<List<Integer>> adj) {
		for (int i = 0; i < adj.size(); i++) {
			System.out.print(i + ": ");
			for (int j : adj.get(i)) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String args[]) {
		
		int v = 5;
		List<List<Integer>> adj = new ArrayList<>(v);
		
		for (int i = 0; i < v; i++) {
			adj.add(new ArrayList<>());
		}
		
		addEdge(adj, 1, 0);
		addEdge(adj, 2, 1);
		addEdge(adj, 3, 2);
		addEdge(adj, 0, 2);
		addEdge(adj, 1, 3);

		System.out.println("Mat : ");
		showMat(adj);
	}
}
