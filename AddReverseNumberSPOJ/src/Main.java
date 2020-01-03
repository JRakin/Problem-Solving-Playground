import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 23, 2019
 */
public class Main {

	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		
		int t = scan.nextInt();
		int n = 0, m = 0;
		while(t-- > 0) {
			n = scan.nextInt();
			m = scan.nextInt();
			
			System.out.println(reverse(reverse(n)+reverse(m)));
		}

	}
	static int reverse(int n) {
		
		int result = 0;
		
		while(n != 0) {
			result = result*10+n%10;
			n /= 10;
		}
		
		return result;
		
	}

}
