import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 27, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		int n = scan.nextInt();
		scan.nextLine();
		
		String str = scan.nextLine();
		
		System.out.println(binaryString(str));

	}
	static int binaryString(String str) {
		return (str.length()-str.replaceAll("010", "0").length())/2;
	}

}
