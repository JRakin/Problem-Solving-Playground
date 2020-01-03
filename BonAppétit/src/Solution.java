import java.util.Scanner;

/**
 * @author Rakin
 *10:51:55 PM
 * Apr 11, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = scan.nextInt();
		int k = scan.nextInt();
		
		int [] bill = new int[n];
		
		int totalBill = 0;
		int actualBill = 0;
		
		for(int i = 0; i < n; i++) {
			bill[i] = scan.nextInt();
			totalBill = totalBill + bill[i];
			
			if(i != k) {
				actualBill = actualBill + bill[i];
			}
		}
		int chargedBill = scan.nextInt();
		
		if(chargedBill == actualBill/2) {
			System.out.println("Bon Appetit");
		}
		else {
			System.out.println(totalBill/2 - actualBill/2);
		}

	}

}
