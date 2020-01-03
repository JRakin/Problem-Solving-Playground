import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 17, 2019
 */
public class Main {

	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		int n;
		
		while((n = scan.nextInt()) != 0) {
			System.out.println(countSquares(n));
		}

	}
	static long countSquares(int n) {
		return (n*(n+1)*(2*n+1))/6;
	}

}
