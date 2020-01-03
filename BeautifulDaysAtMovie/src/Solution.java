import java.util.Scanner;

/**
 * @author Rakin
 *
 * May 18, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		int k = scan.nextInt();
		int count = 0;
		
		for(int i = n; i <=m; i++) {
			
			if((i - reverseNum(i)) % k == 0) {
				count++;
			}
		}
		
		System.out.println(count);

	}
	static int reverseNum(int n) {
		
		int reversed = 0;
		
		while(n != 0) {
			
			reversed = reversed * 10;
			reversed = reversed + n%10;
			n = n/10;
		}
		
		return reversed;
	}

}
