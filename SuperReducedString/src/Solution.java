import java.util.Scanner;

/**
 * @author Rakin
 *
 * May 4, 2018
 */
public class Solution {
	
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder(scan.next());
		
		StringBuilder s = reducedString(str);
		
		if(s.length()==0) {
			System.out.println("Empty String");
		}
		else {
			System.out.println(s);
		}

	}
	static StringBuilder reducedString(StringBuilder str) {
		
		for(int i = 1; i < str.length(); i++) {
			if(str.charAt(i) == str.charAt(i-1)) {
				str.delete(i-1, i+1);
				i=0;
			}
		}
		
		return str;
	}

}
