import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 27, 2019
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		int n = scan.nextInt();
		String[] str = new String[n];
		
		for(int i = 0; i < n; i++) {
			str[i] = scan.next();
		}
		findTeam(str);

	}
	static void findTeam(String[] str) {
		
		int countA = 0;
		int countB = 0;
		
		String temp = str[0];
		String temp1 = "";
		
		for(int i = 0; i < str.length; i++) {
			if(str[i].equals(temp)) {
				countA++;
			}
			else {
				countB++;
				temp1 = str[i];
			}
		}
		if(countA > countB) {
			System.out.println(temp);
		}
		else {
			System.out.println(temp1);
		}
	}

}
