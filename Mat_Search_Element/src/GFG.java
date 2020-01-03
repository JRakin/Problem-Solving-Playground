import java.util.Scanner;

public class GFG {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int T=scan.nextInt();
		int row = 0;
		int column = 0;
		
		
		for(int I=0;I<T;I++) {
			
			row=scan.nextInt();
			column=scan.nextInt();
			boolean isFound=false;
			
			int[][] mat=new int[row][column];
			
			for(int K=0;K<row;K++) {
				for(int M=0;M<column;M++) {
					mat[K][M]=scan.nextInt();
				}
			}
			System.out.println("Number to be searched:");
			int x=scan.nextInt();
			
			for(int K=0;K<row;K++) {
				for(int M=0;M<column;M++) {
					if(mat[K][M]==x) {
						isFound=true;
						break;
					}
				}
			}
			System.out.println(isFound ? 1:0);
		}
		scan.close();
	}

}
