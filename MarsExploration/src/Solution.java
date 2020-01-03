import java.util.Scanner;

/**
 * @author Rakin
 *4:21:31 PM
 * Apr 5, 2018
 */
public class Solution {
	
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		String s = scan.next();
		String sos = s.toUpperCase();
		String str = "SOS";
		
		System.out.println(exploration(sos,str));
	}
	static int exploration(String s, String str) {
		
		int count = 0;
		
		for(int i=0; i<s.length(); i++) {
			if(str.charAt(i%3) != s.charAt(i)) {
				count++;
			}
		}
		
		return count;
	}

}
