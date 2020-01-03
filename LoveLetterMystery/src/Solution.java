import java.util.Scanner;

/**
 * @author Rakin
 *5:41:16 PM
 * Apr 5, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int t = scan.nextInt();
		
		for(int i=0; i<t; i++) {
			String str = scan.next();
			String str1 = str.toLowerCase();
			
			System.out.println(mystery(str1));
		}

	}
	static int mystery(String front) {
		
		String back = new StringBuffer(front).reverse().toString();
		int count = 0;
		char[] ch1 = front.toCharArray();
		char[] ch2 = back.toCharArray();
		
		if(!palindrome(ch1,ch2)) {
			
			for(int i=0; i<ch1.length; i++) {
				
				while(ch1[i] < ch2[i]) {
					
					count++;
					ch2[i]--;
				}
			}
		}
		for(int i=0; i<ch2.length; i++) {
			System.out.print(ch2[i]);
		}
		System.out.println(" ");
		return count;
	}
	static boolean palindrome(char[] ch1, char[] ch2) {
		
		boolean isPalindrome = true;
		
		for(int i=0; i<ch1.length; i++) {
			if(ch1[i] != ch2[i]) {

				isPalindrome = false;
				break;
			}
		}
		if(isPalindrome) {
			return true;
		}
		else {
			return false;
		}
	}

}
