import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 13, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int[] arr = new int[123];
		
		for(int i = 97; i < 123; i++) {
			arr[i] = scan.nextInt();
		}
		scan.nextLine();
		String word = scan.next();
		
		System.out.println(heightCount(arr,word));

	}
	static int heightCount(int[] arr, String word) {
		
		int result = 0;
		
		for(int i = 0; i < word.length(); i++) {
			
			for(int k = 97; k <= 122; k++) {
				
				if(word.charAt(i) == k) {
					if(arr[k] > result) {
						result = arr[k];
					}
				}
			}

		}
		
		return result*word.length()*1;
	}

}
