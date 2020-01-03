import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 16, 2019
 * Implemented using naive pattern search
 */
public class Main {

	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		while(scan.hasNext()) {
			int n = scan.nextInt();
			
			String patt = scan.next();
			scan.nextLine();
			String str = scan.next();
			
			searchPattern(patt, str);
		}

	}
	static void searchPattern(String patt, String str) {
		
		for(int i = 0; i <= str.length() - patt.length(); i++) {
			
			int j;
			
			for(j = 0; j < patt.length(); j++) {
				
				if(str.charAt(i+j) != patt.charAt(j)) {
					break;
				}
			}
			
			if(j == patt.length()) {
				System.out.println(i);
			}
		}
	}

}
