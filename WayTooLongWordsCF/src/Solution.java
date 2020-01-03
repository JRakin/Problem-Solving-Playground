import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 25, 2018
 */
public class Solution {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int i = 0; i < n; i++) {
			String word = scan.next();
			longWords(word);
		}

		scan.close();

	}
	static void longWords(String word) {
		
		if(word.length() <= 10) {
			System.out.println(word);
		}
		else {
			System.out.println(word.charAt(0)+""+(word.length()-2)+""+word.charAt(word.length()-1));
		}
		
	}

}
