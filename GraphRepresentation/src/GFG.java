import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 19, 2019
 * Undirected Graph using adjacency list
 */
public class GFG {

	private static final Scanner scan = new Scanner(System.in);
	
	static class Graph {
		
		int n;
		LinkedList<Integer>[] adj;
		
		@SuppressWarnings("unchecked")
		Graph(int n){
			this.n = n;
			
			adj = new LinkedList[n];
			
			for(int i = 0; i < n; i++) {
				adj[i] = new LinkedList<>();
			}
		}
	}
	static void addEdge(Graph graph, int src, int des) {
		graph.adj[src].add(des);
		graph.adj[des].add(src);
	}
	static void printGraph(Graph graph) {
		for(int i = 0; i < graph.n; i++) {
			System.out.println("Adjacency list of vertex "+i);
			System.out.print("head ");
			
			for(Integer in: graph.adj[i]) {
				System.out.print("-> "+in);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		Graph graph = new Graph(n+1);
		
		for(int i = 0; i < m; i++) {
			int u = scan.nextInt();
			int v = scan.nextInt();
			
			addEdge(graph, u, v);
		}
        
        printGraph(graph);

	}

}
