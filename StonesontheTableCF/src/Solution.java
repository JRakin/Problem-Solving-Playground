import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 30, 2019
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int n = scan.nextInt();
		String text = scan.next();
		System.out.println(count(text,n));

	}
	static int count(String text,int n) {
		int ans = 0;
		
		for(int i = 0; i < n-1; i++) {
			if(text.charAt(i) == text.charAt(i+1)) {
				ans++;
			}
		}
		
		return ans;
	}

}
