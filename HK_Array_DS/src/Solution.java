import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int N=scan.nextInt();
        int[] A=new int[N];
        for(int i=0;i<N;i++){
            A[i]=scan.nextInt();
        }
        for(int i=N-1;i>=0;i--){
            System.out.print(" "+A[i]);
        }
        scan.close();
    }
}
