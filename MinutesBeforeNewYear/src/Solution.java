import java.util.Scanner;

/**
 * 
 */

/**
 * @author Rakin
 *
 * Dec 28, 2019
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		int t = scan.nextInt();
		
		while(t-- > 0) {
			int h = scan.nextInt();
			int m = scan.nextInt();
			
			if(h !=0) {
				System.out.println((24-h)*60-m);
			}
			else if(h ==0) {
				System.out.println((24*60)-m);
			}
			else if(h == 0 && m == 0) {
				System.out.println(0);
			}
			
		}

	}

}
