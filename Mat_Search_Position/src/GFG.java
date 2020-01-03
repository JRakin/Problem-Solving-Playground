import java.util.Scanner;

public class GFG {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int mat[][]= {{10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}};
		int num=scan.nextInt();
		scan.close();
		
		search(mat,mat.length,num);

	}
	private static void search(int[][] mat,int n,int num) {
		boolean isFound = false;
		int r = 0,c = 0;
		int I;
		int M;
	
		for(I=0;I<n;I++) {
			for(M=0;M<n;M++) {
				if(mat[I][M]==num) {
					isFound=true;
					r=I;
					c=M;
					break;
				}
			}
		}
		if(isFound) {
			System.out.println(num+"Found in position"+r+","+c);
		}
		else {
			System.out.println("Not Found");
		}
	}

}
