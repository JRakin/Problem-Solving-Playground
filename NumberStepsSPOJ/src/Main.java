import java.util.Scanner;


/**
 * @author Rakin
 *
 * Jul 28, 2019
 */
public class Main {

	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int t = scan.nextInt();
		
		while(t--> 0) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			
			if(n == m || n-2 == m) {
				if(n % 2 == 0 && m % 2 == 0 ) {
					System.out.println(n+m);
				}
				else if(n % 2 != 0 && m % 2 != 0) {
					System.out.println(n+m-1);
				}
			}
			else {
				System.out.println("No Number");
			}
		}

	}

}
