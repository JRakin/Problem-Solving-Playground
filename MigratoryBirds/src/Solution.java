import java.util.Scanner;


/**
 * @author Rakin
 *6:04:20 PM
 * Apr 10, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = (int) scan.nextLong();
		
		int [] birds = new int[n];
		
		for(int i=0; i<n; i++) {
			birds[i] = scan.nextInt();
		}
		System.out.println(findBirds(birds));

	}
	static int findBirds(int [] birds) {
		
		int max = 0; 
		int value = 0;
		int [] count = new int[6];
		

		for(int k=0; k<birds.length; k++) {
			count[birds[k]]++;
		}
		for(int i=1; i<6; i++) {
			
			if(count[i] > max) {
				max = count[i];
				value = i;
			}
		}
		 return value;
	}

}
