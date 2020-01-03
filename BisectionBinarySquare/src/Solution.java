import java.util.Scanner;

/**
 * @author Rakin
 *
 * May 21, 2018
 */
public class Solution {
	
	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = scan.nextInt();
		
		System.out.println(mySqrt(n));
	}
	
	static double mySqrt(int n) {
		double low = 0.0;
		double high = n;
		
		double mid = 0;
		
		while(high - low > .000000000000001) {
			
			mid = (low +high) / 2;
			
			//System.out.println("low: " +low+" high: " +high+ " mid: " +mid+ " mid*mid: " +mid*mid);
			
			if(mid * mid > n) {
				
				high = mid;
			}
			else {
				
				low = mid;
			}
			
		}
		System.out.println("mid: "+mid+ " mid*mid: "+mid*mid);
		return mid;
	}

}
