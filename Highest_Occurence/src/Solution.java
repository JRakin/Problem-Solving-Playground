import java.util.Scanner;

/**
 * @author Rakin
 *6:53:00 PM
 * licensed to Rakin
 */
public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.nextLine();
		int max = 0;
		
		String str = s.toLowerCase();
		char[] ch = str.toCharArray();
		
		int[] count = new int[123];
		char [] output = new char[123];
		
		for(int i=0; i<123; i++) {
			count[i] = 0;
		}
		scan.close();
		
		for(int i=0; i<ch.length; i++) {
			count[ch[i]]++;
		}
		
		for(int i=0; i<123; i++) {
			if(count[i]!=0) {
				if(max < count[i]) {
					max = count[i];
					
					
				}
				System.out.println();
			}
		}
		

	}

}
