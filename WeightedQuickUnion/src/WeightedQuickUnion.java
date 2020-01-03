import java.util.Scanner;

public class WeightedQuickUnion {
    private int[] parent;
    private int[] size;
    private int count;
    private static final Scanner scan = new Scanner(System.in);

    public WeightedQuickUnion(int count){
        this.count = count;
        parent = new int[count];
        size = new int[count];

        for (int i = 0; i < count; i++){
            parent[i] = i;
            size[i] = 1;
        }
    }
    public int getCount(){
        return count;
    }
    public int find(int p){
        validate(p);
        while (p != parent[p]){
            p = parent[p];
        }
        return p;
    }

    private void validate(int p) {
        if (p < 0 || p >= parent.length){
            throw new IllegalArgumentException("Index out of range");
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
        if (size[rootP] < size[rootQ]){
            parent[rootP] = rootQ;
            size[rootQ] += size[rootP];
        }
        else {
            parent[rootQ] = rootP;
            size[rootP] += rootQ;
        }
        count--;
    }

    public static void main(String[] args) {
        int n = scan.nextInt();

        WeightedQuickUnion weightedQuickUnion  = new WeightedQuickUnion(n);

        while(scan.hasNext()){
            int p = scan.nextInt();
            int q = scan.nextInt();

            if (weightedQuickUnion.connected(p,q)){
                continue;
            }
            weightedQuickUnion.union(p,q);
            System.out.println(p+" "+q);
        }
        System.out.println(weightedQuickUnion.getCount());
    }
}
