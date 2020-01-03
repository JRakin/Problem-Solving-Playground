import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int N=scan.nextInt();
		
		int[] A=new int[N];
		int[] B=new int[N];
		int[] C=new int[N];
		
		for(int I=0;I<N;I++) {
			A[I]=scan.nextInt();
		}
		for(int K=0;K<N;K++) {
			B[K]=scan.nextInt();
		}
		scan.close();
		for(int M=0;M<N;M++) {
			C[M]=A[M]+B[M];
			System.out.print(C[M]+" ");
		}

	}

}
