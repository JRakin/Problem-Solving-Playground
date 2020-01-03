import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Graph {
	
	private static final Scanner scan = new Scanner(System.in);
	
	private int V;
	private static LinkedList<Integer> adj[];
	
	@SuppressWarnings("unchecked")
	Graph(int v){
		V = v;
		adj = new LinkedList[v];
		
		for(int i = 0; i < v; i++) {
			adj[i] = new LinkedList<Integer>();
		}
	}
	void addEdge(int v, int w) {
		adj[v].add(w);
	}
	static void DFSUtil(int v, boolean visited[]) {
		visited[v] = true;
		System.out.print(v+" ");
		
		Iterator<Integer> itr = adj[v].listIterator();
		
		while(itr.hasNext()) {
			int n = itr.next();
			if(!visited[n]) {
				DFSUtil(n,visited);
			}
		}
	}
	void DFS(int v) {
		
		boolean[] visited = new boolean[V];
		DFSUtil(v,visited);
	}
	public static void main(String[] args) {
		
		Graph g = new Graph(4);
		
		int n = scan.nextInt();
		for(int i = 0; i < n; i++) {
			
			int x = scan.nextInt();
			int y = scan.nextInt();
			g.addEdge(x,y);
		}
		
		g.DFS(1);

	}

}
