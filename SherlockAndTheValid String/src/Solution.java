import java.util.Scanner;

/**
 * @author Rakin
 *
 * May 9, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		String str = scan.next();
		System.out.println(validString(str));

	}
	static String validString(String s) {
		
		char[] ch = s.toCharArray();
		
		boolean isValid = true;
		
		int [] arr = new int[256];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = 0;
		}
		
		for(int i = 0; i < ch.length; i++) {
			arr[ch[i]]++;
		}
		for(int  i = 1; i < arr.length; i++) {
			
			if(arr[i-1] != 0 && arr[i] != 0) {
				if(arr[i] != arr[i-1]) {
					isValid = false;
				}
			}
		}
		
		if(isValid) {
			return "YES";
		}
		else {
			
			return "NO";
		}
		
	}

}
