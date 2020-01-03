import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 26, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String word = scan.nextLine();
		
		String s1 = word.substring(0, 1).toUpperCase() + word.substring(1);
		
		System.out.println(s1);

	}

}
