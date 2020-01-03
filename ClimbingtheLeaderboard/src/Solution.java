import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 20, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		
		int m = scan.nextInt();
		int[] brr = new int[m];
		
		for(int i = 0; i < m; i++) {
			brr[i] = scan.nextInt();
		}
		
		ArrayList<Integer> rankShow = leaderboard(arr,brr);
		
		for(int r : rankShow) {
			System.out.println(r);
		}

	}
	static ArrayList<Integer> leaderboard(int[] scores,int[] alice) {
		return aliceRank;
	}

}
