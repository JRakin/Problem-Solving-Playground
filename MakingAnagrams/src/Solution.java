import java.util.Scanner;


/**
 * @author Rakin
 *
 * Jul 22, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String s1 = scan.next();
		String s2 = scan.next();
		
		System.out.println(isAnagram(s1,s2));

	}
	static int isAnagram(String s1, String s2) {
		
		int res = 0;
		
		int[] count1 = new int[26];
		int[] count2 = new int[26];
		
		for(int i = 0; i < 26; i++) {
			count1[i] = 0;
		}
		
		for(int i = 0; i < s1.length(); i++) {
			count2[s1.charAt(i)-97]++;
		}
		for(int i = 0; i < s2.length(); i++) {
			count1[s2.charAt(i)-97]++;
		}
		
		for(int  i = 0; i < 26; i++) {
			res += Math.abs(count1[i] - count2[i]);
		}
		
		return res;
	}

}
