import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 21, 2019
 */
public class Main {

	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int n = scan.nextInt();
		
		System.out.println(countRectangle(n));
		

	}
	static int countRectangle(int n) {
		
		int ans = 0;
		
		for(int l = 1; l <=Math.sqrt(n); l++) {
			
			for(int h = l; h*l <=n; h++) {
				ans++;
			}
		}
		
		return ans;
	}

}
