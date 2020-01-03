import java.util.Scanner;

/**
 * @author Rakin
 *11:23:30 AM
 * Apr 7, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int [] a = new int[3];
		int [] b = new int[3];
		
		String [] aitem = scan.nextLine().split(" ");
		
		for(int i=0; i<3; i++) {
			int temp = Integer.parseInt(aitem[i].trim());
			a[i] = temp;
		}
		
		String [] bitem = scan.nextLine().split(" ");
		
		for(int i=0; i<3; i++) {
			int temp = Integer.parseInt(bitem[i].trim());
			b[i] = temp;
		}
		compareTriplets(a,b);

	}
	static void compareTriplets(int [] a, int [] b) {
		
		int alice = 0;
		int bob = 0;
		
		for(int i=0; i<a.length; i++) {
			if(a[i] > b[i]) {
				alice++;
			}
			else if(a[i] < b[i]) {
				bob++;
			}
		}
		System.out.println(alice+" "+bob);
	}

}
