import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;


/**
 * @author Rakin
 *
 * Jul 20, 2019
 */
public class Graph {

	private static Scanner scan = new Scanner(System.in);
	
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
		graph.adj[u-1].add(v-1);
		//graph.adj[v].add(u);
	}
	/*static void printGraph(Graph graph) {
		for(int i = 0; i < graph.n; i++) {
			System.out.println("Adjacency list of vertex "+i);
			System.out.print("head ");
			
			for(Integer in: graph.adj[i]) {
				System.out.print("-> "+in);
			}
			System.out.println();
		}
	}*/
	static boolean isTree(Graph graph, int n) {
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(0);
		
		boolean[] vis = new boolean[n];
		int nodeVisited = 0;
		
		while(!stack.isEmpty()) {
			int temp = stack.pop();
			
			/*for(Integer i: graph.adj[temp]) {
				stack.push(i);
			}*/
			stack.addAll(graph.adj[temp]);
			/*for(Integer in: stack) {
				System.out.print(in+" ");
			}*/
			if(vis[temp]) {
				break;
			}
			else {
				vis[temp] = true;
				nodeVisited++;
			}
		}
		//System.out.println(nodeVisited);
		if(!stack.isEmpty() || nodeVisited != n-1) {
			return false;
		}
		else {
			return true;
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
		if(isTree(graph, n+1)) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}

	}

}
