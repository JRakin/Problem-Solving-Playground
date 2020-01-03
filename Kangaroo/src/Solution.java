import java.util.Scanner;

/**
 * @author Rakin
 *1:01:54 PM
 * Apr 8, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int x1 = scan.nextInt();
		int v1 = scan.nextInt();
		int x2 = scan.nextInt();
		int v2 = scan.nextInt();
		
		System.out.println(kangaroo(x1,v1,x2,v2));

	}
	static String kangaroo(int x1, int v1, int x2, int v2) {
		
		boolean isKangaroo = false;
		
		for(int i=0; i<1000; i++) {
			x1 +=v1; 
			x2 +=v2;
			
			if(x1 == x2) {
				isKangaroo = true;
			}
		}
		if(isKangaroo) {
			return "YES";
		}
		else {
			return "NO";
		}
	}

}
