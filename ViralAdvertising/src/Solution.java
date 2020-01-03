import java.util.Scanner;

/**
 * @author Rakin
 *
 * May 19, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = scan.nextInt();
		System.out.println(viralAdvertising(n));

	}
	
	static int viralAdvertising(int n) {
		
		int liked = 0;
		
		int i = 5;
		int j = 0;
		
		while(j < n) {
			
			int f = (int) Math.floor(i/2);

			liked = liked + f;
			
			i = f * 3;
			j++;
		}
		
		return liked;
	}

}
