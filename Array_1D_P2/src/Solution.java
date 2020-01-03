import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int q=scan.nextInt();
		
		while(q-->0) {
			int n=scan.nextInt();
			int leap=scan.nextInt();
			
			int [] game=new int[n];
			for(int k=0;k<n;k++) {
				game[k]=scan.nextInt();
			}
			System.out.println((canWin(game,leap)) ? "YES":"NO");
		}
		scan.close();
	}
	public static boolean canWin(int[] game,int leap) {
		return false;
		
		
	}

}
