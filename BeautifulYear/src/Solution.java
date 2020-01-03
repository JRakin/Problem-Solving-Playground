import java.util.HashMap;
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
		
		distinctNumber(n);

	}
	static void distinctNumber(int n) {
		
		boolean isDistinct = true;
		
		while(isDistinct) {
			n++;
			String str = ""+(n);
			//System.out.println(str);
			
			char[] ch = str.toCharArray();
			
			HashMap<Character,Integer> map = new HashMap<Character, Integer>();
			
			for(int i = 0; i < ch.length; i++) {
				if(map.containsKey(ch[i])) {
					map.put(ch[i], map.get(ch[i])+1);
				}
				else {
					map.put(ch[i], 1);
				}
			}
			if(map.size() == ch.length) {
				System.out.println(str);
				isDistinct = false;
			}
		}
	}

}
