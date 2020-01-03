import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 17, 2019
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int n = scan.nextInt();
		int result = 0;
		while(n-- > 0) {
			String str = scan.next();
			
			if(str.equals("Tetrahedron")) {
				result += 4;
			}
			else if(str.equals("Cube")) {
				result += 6;
			}
			else if(str.equals("Octahedron")) {
				result += 8;
			}
			else if(str.equals("Dodecahedron")) {
				result += 12;
			}
			else if(str.equals("Icosahedron")) {
				result += 20;
			}
		}
		
		System.out.println(result);

	}

}
