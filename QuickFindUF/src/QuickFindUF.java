import java.util.Scanner;

public class QuickFindUF {

    private int[] id;
    private int count;
    private static final Scanner scan = new Scanner(System.in);

    public QuickFindUF(int n){
        count = n;
        id = new int[n];

        for (int i = 0; i < n; i++){
            id[i] = i;
        }
    }
    private int getCount(){
        return count;
    }
    public int find(int p){
        validate(p);
        return id[p];
    }
    private void validate(int p){
        int n = id.length;
        if (p < 0 || p >= n){
            throw new IllegalArgumentException("index "+p+" not between 0 and "+(n-1));
        }
    }
     private boolean connected(int p, int q){
        validate(p);
        validate(q);

        return id[p] == id[q];
    }
    private void union(int p, int q){
        validate(p);
        validate(q);

        int pId = id[p];
        int qId = id[q];

        if (pId == qId) {
            return;
        }
        for (int i = 0; i < id.length; i++){
            if (id[i] == pId){
                id[i] = qId;
            }
        }
        count--;
    }

    public static void main(String[] args) {

        int n = scan.nextInt();
        QuickFindUF uf = new QuickFindUF(n);

        while(scan.hasNext()){
            int p = scan.nextInt();
            int q = scan.nextInt();

            if (!uf.connected(p,q)){
                uf.union(p,q);
                System.out.println(p+" "+q);
            }
        }
        System.out.println(uf.getCount());
    }
}
