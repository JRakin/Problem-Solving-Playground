import java.util.Scanner;


/**
 * @author Rakin
 *
 * Jul 26, 2019
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		String str = scan.next();
		findSubstring(str);

	}
	static void findSubstring(String str) {
		
		boolean isAb1 = false;
		boolean isAb2 = false;
		boolean isBa1 = false;
		boolean isBa2 = false;
		
		char[] ch = str.toCharArray();
		
		int i = 0;
		
		for(i = 0; i < ch.length - 1;) {
			if(ch[i] == 'A' && ch[i+1] == 'B') {
				i += 2;
				isAb1 = true;
				break;
			}
			else {
				i++;
			}
		}
		for(int j = i; j < ch.length - 1;) {
			if(ch[j] == 'B' && ch[j+1] == 'A') {
				j += 2;
				isBa1 = true;
				break;
			}
			else {
				j++;
			}
		}
		
		i = 0;
		for(i = 0; i < ch.length - 1;) {
			if(ch[i] == 'B' && ch[i+1] == 'A') {
				i += 2;
				isBa2 = true;
				break;
			}
			else {
				i++;
			}
		}
		for(int j = i; j < ch.length - 1;) {
			if(ch[j] == 'A' && ch[j+1] == 'B') {
				j += 2;
				isAb2 = true;
				break;
			}
			else {
				j++;
			}
		}
		
		if((isAb1 && isBa1) || (isAb2 && isBa2)) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}

}
