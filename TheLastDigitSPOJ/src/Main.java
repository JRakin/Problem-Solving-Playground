import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 25, 2019
 */
public class Main {

	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		int t = scan.nextInt();
		
		while(t-- > 0) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			System.out.println(exponentModulus(a,b,10));
		}

	}
	static int exponentModulus(int a, int b, int c) {
		long ans;
		if(a == 0) {
			return 0;
		}
		if(b == 0) {
			return 1;
		}
		if(b % 2 == 0) {
			
			ans = exponentModulus(a, b/2, c);
			ans = (ans *ans) % 10;
		}
		else {
			ans = a % c;
			ans = (ans * exponentModulus(a,b-1,c)%c)%c;
		}
		return (int) ((ans+c)%c);
	}
	static int exponentModulus2(int a, int b, int c) {
		
		int ans = 1;
		a = a % c;
		
		while(b > 0) {
			if((b&1) == 1) {
				ans = (ans * a) % c;
			}
			b /= 2;
			a = (a * a) % c;
		}
		return ans;
	}

}
