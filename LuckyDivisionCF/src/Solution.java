import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 20, 2019
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		int n = scan.nextInt();
		
		if(n%47==0||n%74==0||n%744==0||n%474==0||n%4==0||n%7==0||n%77==0||n%44==0||n%444==0||n%777==0||n%447==0||n%477==0||n%747==0||n%774==0){
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}

	}

}
