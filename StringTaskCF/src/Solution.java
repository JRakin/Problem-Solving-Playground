import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 25, 2018
 */
public class Solution {

	public static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String word = scan.nextLine();
		System.out.println(convert(word));
		

	}
	static String convert(String word) {
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < word.length(); i++) {
			
			char ch = word.charAt(i);
			
			if(!isVowel(ch)) {
				
				if(Character.isUpperCase(ch)) {
					ch += 32;
				}
				sb.append('.');
				sb.append(ch);
			}
		}
		
		return sb.toString();
	}
	
	static boolean isVowel(char ch) {
		
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='y' || ch=='Y') {
			return true;
		}
		
		return false;
	}

}
