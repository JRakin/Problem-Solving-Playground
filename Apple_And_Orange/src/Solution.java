import java.util.Scanner;

/**
 * @author Rakin
 *11:04:13 AM
 * Apr 8, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int s = scan.nextInt();
		int t = scan.nextInt();
		
		int l = scan.nextInt();
		int r = scan.nextInt();
		
		int apple = scan.nextInt();
		int orange = scan.nextInt();
		
		int[] appleItem = new int[apple];
		int[] orangeItem = new int[orange];
		
		countAppleAndOrange(s,t,l,r,appleItem,orangeItem);
		

	}
	static void countAppleAndOrange(int s, int t, int l, int r, int[] apple, int[] orange) {
		
		int larry = 0;
		int rob = 0;
		
		for(int i=0; i<apple.length; i++) {
			apple[i] = scan.nextInt();
			
			if(l + apple[i] >= s && l + apple[i] <= t) {
				larry++;
			}
		}
		for(int i=0; i<orange.length; i++) {
			orange[i] = scan.nextInt();
			
			if(r+orange[i] <= t && r+orange[i] >= s) {
				rob++;
			}
		}
		
		System.out.println(larry+"\n"+rob);
	}

}
