import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 22, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int t = scan.nextInt();
		
		String[] arr = new String[t];
		
		for(int i = 0; i < t; i++) {
			arr[i] = scan.next();
		}
		scan.nextLine();
		Arrays.sort(arr);
		int n = scan.nextInt();
		
		for(int i = 0; i < n; i++) {
			
			String word = scan.next();
			
			int index = 0;
			
			for(int k = 0; k < arr.length; k++) {
				if(arr[k].equals(word)) {
					index = k+1;
				}
			}
			
			System.out.println(findValue(word,index));
		}

	}
	static int findValue(String word, int index) {
		
		int res = 0;
		String name = word.toLowerCase();
		
		for(int i = 0; i < name.length(); i++) {
			
			res += name.charAt(i) - 96;
		}
		
		return res*index;
	}

}
