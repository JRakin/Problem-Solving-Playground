import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Rakin
 *
 * May 8, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println(socksPair(arr));

	}
	
	static int socksPair(int[] arr) {
		Set<Integer> socks = new HashSet<Integer>();
		
		int pairs = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(!socks.contains(arr[i])) {
				
				socks.add(arr[i]);
			}
			else {
				
				pairs++;
				socks.remove(arr[i]);
			}
		}
		
		return pairs;
		
	}

}
