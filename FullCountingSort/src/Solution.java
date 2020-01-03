import java.util.Scanner;

/**
 * @author Rakin
 *
 * Dec 30, 2019
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args){
		
		int n = scan.nextInt();
		
		StringBuilder[] sb = new StringBuilder[100];
		
		for(int i = 0; i < 100; i++) {
			sb[i] = new StringBuilder();
		}
		
		for(int i = 0; i < n; i++) {
			int j = scan.nextInt();
			String str = scan.next();
			
			String temp;
			
			if(i < n/2) {
				temp = "-"+" ";
			}
			else {
				temp = str +" ";
			}
			sb[j].append(temp);
		}
		for(int i = 0; i < 100; i++) {
			System.out.print(sb[i]);
		}

	}

}
