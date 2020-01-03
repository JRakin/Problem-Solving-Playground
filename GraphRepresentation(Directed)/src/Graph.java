import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 20, 2019
 */
public class Graph {

	private static final Scanner scan = new Scanner(System.in);
	
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
	static void addEdge(Graph graph, int u, int v) {
		graph.adj[u].add(v);
	}
	static void printGraph(Graph graph) {
		
		for(int i = 0; i < graph.n; i++) {
			System.out.println("Adjacency list for vertex "+i);
			System.out.print("head ");
			
			for(Integer in: graph.adj[i]) {
				System.out.print("-> "+in);
			}
			System.out.println();
		}
	}
	static void dfsUtil(int v, boolean[] vis, Graph graph) {
		
		vis[v] = true;
		
		System.out.print(v+" ");
		
		Iterator<Integer> it = graph.adj[v].listIterator();
		
		while(it.hasNext()) {
			int temp = it.next();
			
			if(!vis[temp]) {
				dfsUtil(temp, vis, graph);
			}
		}
	}
	static void dfs(Graph graph) {
		
		boolean[] vis = new boolean[graph.n];
		
		for(int i = 0; i < graph.n; i++) {
			if(vis[i] == false) {
				dfsUtil(i,vis,graph);
			}
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
		//printGraph(graph);
		dfs(graph);

	}

}
