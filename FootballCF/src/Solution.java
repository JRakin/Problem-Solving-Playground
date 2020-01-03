import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 27, 2018
 */
public class Solution {

	/**
	 * String,implementation
	 */
	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String str = scan.next();
		binary(str);

	}
	static void binary(String str) {
		
		int count = 1;
		
		boolean isThere = false;
		
		for(int i = 1; i < str.length(); i++) {
			
			if(str.charAt(i) == str.charAt(i-1)) {
				count++;
				
				if(count == 7) {
					isThere = true;
					break;
				}
			}
			else {
				//i--;
				count = 1;
			}
		}
		
		if(isThere) {
			System.out.println("YES");
		}
		else {
			 System.out.println("NO");
		}
	}
	

}
