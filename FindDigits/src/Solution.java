import java.util.ArrayList;
import java.util.Scanner;


/**
 * @author Rakin
 *
 * May 25, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = scan.nextInt();
		scan.nextLine();
		
		for(int i = 0; i < n; i++) {
			int d = scan.nextInt();
			System.out.println(divisorFinding(d));
			
		}

	}
	static int divisorFinding(int d) {
		
		int a = d;
		int count = 0;
		ArrayList<Integer> digit = new ArrayList<Integer>();
		
		while(d > 0) {
			digit.add(d % 10);
			d = d / 10;
		}
		for(int i = digit.size()-1; i >= 0; i--) {
			
			if(digit.get(i) != 0) {
				if(a % (digit.get(i)) == 0) {
					count++;
				}
			}
			
		}
		
		return count;
		
	}

}
