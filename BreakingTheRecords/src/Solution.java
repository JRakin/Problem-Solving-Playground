import java.util.Scanner;

/**
 * @author Rakin
 *11:18:11 PM
 * Apr 9, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = Integer.parseInt(scan.nextLine().trim());
		int [] score = new int[n];

		String [] items = scan.nextLine().split(" ");
		
		for(int i=0; i<n; i++) {
			score[i] = Integer.parseInt(items[i].trim());
		}
		
		System.out.println(breakingRecord(score));
	}
	static String breakingRecord(int [] arr) {
		
		int min = 0;
		int max = 0;
		
		int minimum = arr[0];
		int maximum = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			
			if(arr[i] < minimum) {
				
				minimum = arr[i];
				min++;
			}
			else if(arr[i] > maximum) {
				
				maximum = arr[i];
				max++;
			}
		}
		
		return max+" "+min;
	}

}
