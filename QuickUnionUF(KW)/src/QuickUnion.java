import java.util.Scanner;

public class QuickUnion {
    private int[] parent;
    private int count;
    private static final Scanner scan = new Scanner(System.in);

    public QuickUnion(int n){
        parent = new int[n];
        count = n;

        for (int i = 0; i < n; i++){
            parent[i] = i;
        }
    }
    public int getCount() {
        return count;
    }
    public int find(int p){
        validate(p);

        while(p != parent[p]){
            p = parent[p];
        }
        return p;
    }
    public void validate(int p){

        if (p < 0 || p >= parent.length){
            throw new IllegalArgumentException("Index out of bound");
        }
    }
    public boolean connected(int p, int q){
        return find(p) == find(q);
    }
    public void union(int p, int q){
        int rootP = find(p);
        int rootQ = find(q);

        if (rootP == rootQ){
            return;
        }
        parent[rootP] = rootQ;
        count--;
    }

    public static void main(String[] args) {
        int n = scan.nextInt();
        QuickUnion quickUnion = new QuickUnion(n);
        while (scan.hasNext()){
            int p = scan.nextInt();
            int q = scan.nextInt();

            if (quickUnion.connected(p,q)){
                continue;
            }
            quickUnion.union(p,q);
            System.out.println(p+" "+q);
        }
        System.out.println(quickUnion.getCount());
    }
}
