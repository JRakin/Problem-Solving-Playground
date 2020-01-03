import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 25, 2019
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		int t = scan.nextInt();
		
		while(t-- > 0) {
			String str = scan.next();
			separateNumbers(str);
		}

	}
	static void separateNumbers(String str) {
		long temp = 0;
		boolean isBeautiful = false;
		
		for(int i = 1; i <= str.length()/2; i++) {
			
			long n = Long.parseLong(str.substring(0,i));
			temp = n;
			
			String str1 = Long.toString(temp);
			
			while(str1.length() < str.length()) {
				n++;
				str1 += Long.toString(n);
			}
			if(str1.equals(str)) {
				isBeautiful = true;
				break;
			}
		}
		if(isBeautiful) {
			System.out.println("YES"+" "+temp);
		}
		else {
			System.out.println("NO");
		}
	}

}
