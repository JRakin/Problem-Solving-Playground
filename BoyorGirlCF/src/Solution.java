import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 17, 2019
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		String str = scan.next();
		
		if(findBoyOrGirl(str)) {
			System.out.println("CHAT WITH HER!");
		}
		else {
			System.out.println("IGNORE HIM!");
		}

	}
	static boolean findBoyOrGirl(String str) {
		
		char[] ch = str.toCharArray();
		
		Arrays.sort(ch);
		
		int total = 0;
		
		for(int i = 1; i < ch.length; i++) {
			if(ch[i] != ch[i-1]) {
				total ++;
			}
		}
		if((total+1) % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
		
		
	}

}
