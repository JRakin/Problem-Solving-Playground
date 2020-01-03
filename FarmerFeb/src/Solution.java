import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 13, 2018
 */
class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int t = scan.nextInt();
		
		for(int i = 0; i < t; i++) {
			
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			System.out.println(farmerFeb(x,y));
		}

	}
	static int farmerFeb(int x, int y) {
		
		int i = 1;
		
		int result = 0;
		
		while(true) {
			
			int z = x + y + i;
			
			if(isPrime(z)) {
				result = i;
				break;
			}
			
			i++;
			
		}
		
		return result;
	}
	
	static boolean isPrime(int z) {
		
		for(int i = 2; i*i<= z; i++) {
			if(z % i == 0) {
				return false;
			}
		}
		
		return true;
	}

}
