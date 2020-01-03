import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Rakin
 *
 * Sep 19, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int m = scan.nextInt();
		int n = scan.nextInt();
		
		String[] magazine = new String[m];
        String[] note = new String[n];

        for (int i = 0; i < m; i++){
            magazine[i] = scan.next();
        }
        for (int i = 0; i < n; i++){
            note[i] = scan.next();
        }
		System.out.println(checkMagazine(magazine, note));
		

	}
	static String checkMagazine(String[] mag, String[] note) {
		
		/*for(String s : mag) {
			System.out.print(s+" ");
		}
		
		for(String s: note) {
			System.out.print(s+" ");
		}*/
		Map<String, Integer> magazine = new HashMap<String, Integer>();
		Map<String, Integer> notes = new HashMap<String, Integer>();
		
		for(String s : mag) {
			if(magazine.containsKey(s)) {
				magazine.put(s, magazine.get(s)+1);
			}
			else {
				magazine.put(s, 1);
			}
		}
		
		for(String s : note) {
			if(notes.containsKey(s)) {
				notes.put(s, notes.get(s)+1);
			}
			else {
				notes.put(s, 1);
			}
		}
		
		boolean isMatching = true;
		
		for(String s : notes.keySet()) {
			if(!magazine.containsKey(s) || (magazine.get(s) < notes.get(s))) {
				isMatching = false;
				break;
			}
		}
		
		return isMatching ? "Yes" : "No";
	}

}
