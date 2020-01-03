import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 25, 2019
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		kaprekarNumbers(n,m);

	}
	static void kaprekarNumbers(int n, int m) {
		
		int count = 0;
		
		for(int i = n; i <= m; i++) {
			if(i == 1) {
				count++;
				System.out.print(i+" ");
			}
			else if(isEqual(i)) {
				count++;
				System.out.print(i+" ");
			}
		}
		if(count == 0) {
			System.out.println("INVALID RANGE");
		}
	}
	static boolean isEqual(int n) {
		
		Long temp = (long)n*n;
		
		String sb = String.valueOf(temp);
		
		String sb1 = sb.substring(0,sb.length()/2);
		String sb2 =sb.substring(sb.length()/2);
		
		int p = (sb1.isEmpty()) ? 0 : Integer.parseInt(sb1.toString());
		int q = (sb2.isEmpty()) ? 0 : Integer.parseInt(sb2.toString());
		
		if(p+q == n) {
			return true;
		}
		else {
			return false;
		}
	}

}
