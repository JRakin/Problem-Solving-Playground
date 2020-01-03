import java.util.Scanner;


/**
 * @author Rakin
 *
 * May 20, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		int n = scan.nextInt();
		
		
		if(isPrime(n) == true) {
			System.out.println("prime number");
		}
		else {
			System.out.println("not prime");
		}

	}
	
	static boolean isPrime(int n) {
		
		if(n <=1) {
			return false;
		}
		
		for(int i = 2; i < n; i++) {
			if((n % i)==0) {
				return false;
			}
		}
		/*
		 * for(int i = 2; i*i <= n; i++){
		 *     
		 *     if((n % i) == 0){
		 *        return false;
		 *     }
		 * }
		 */
		
		return true;
	}

}
