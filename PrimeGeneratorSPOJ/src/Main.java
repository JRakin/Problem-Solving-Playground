import java.io.IOException;
import java.util.Scanner;

/**
 * @author Rakin
 *
 * Aug 3, 2018
 */
public class Main{
	
	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		
		int t = scan.nextInt();
		
		for(int i = 0; i < t; i++) {
			
			int m = scan.nextInt();
			int n = scan.nextInt();
			
			for(int p = m; p <= n; p++) {
				
				if(p == 1) {
					continue;
				}
				else {
					if(isPrime(p) == true) {
						System.out.println(p);
					}
					
				}
			}
			
		}

	}
    static boolean isPrime(int n) {
		
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
	
}
