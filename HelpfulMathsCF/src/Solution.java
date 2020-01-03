import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 28, 2018
 */
public class Solution {
	
	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String word = scan.next();
		
		char[] ch = maths(word);
		
		for(int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
		
	}
	static char[] maths(String word) {
		
		char[] ch = word.toCharArray();
		
		for(int i = 0; i < ch.length; i+=2) {
			
			for(int k = 0; k < ch.length-i-2; k+=2) {
				
				if(ch[k] > ch[k+2] ) {
					char temp = ch[k];
					ch[k] = ch[k+2];
					ch[k+2] = temp;
				}
			}
		}
		
		return ch;
	}

}
