import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 30, 2019
 * 
 * solved by using the concept of prime factorization 
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		System.out.println(divideCheese(n,m));

	}
	static int divideCheese(int n, int m) {
		
		int a2 = 0, a3 = 0, a5 = 0;
		int b2 = 0, b3 = 0, b5 = 0;
		
		//count total number of prime factor 2,3,5
		while(n % 2 == 0) {
			n /= 2;
			a2++;
		}
		while(n % 3 == 0) {
			n /= 3;
			a3++;
		}
		while(n % 5 == 0) {
			n /= 5;
			a5++;
		}
		while(m % 2 == 0) {
			m /= 2;
			b2++;
		}
		while(m % 3 == 0) {
			m /= 3;
			b3++;
		}
		while(m % 5 == 0) {
			m/= 5;
			b5++;
		}
			
		
		if(n != m) {
			return -1;
		}
		else {
			//subtract the extra powers to equal the number
			return Math.abs(a2-b2) + Math.abs(a3-b3) + Math.abs(a5-b5);
		}
	}

}
