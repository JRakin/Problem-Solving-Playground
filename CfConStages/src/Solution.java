import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 26, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		StringBuilder str = new StringBuilder("");
		
		int n = scan.nextInt();
		int k = scan.nextInt();
		
		while(n-->0) {
			str.append(scan.next().charAt(0));
		}
		String word = str.toString();
		
		System.out.println(buildRocket(word,k));

	}
	static int buildRocket(String word, int k) {
		
		
		if(word.length() == k) {
			return -1;
		}
		char[] ch = word.toCharArray();
		//Arrays.sort(ch);
		
		int odd = 0;
		int even = 0;
		int min = 0;
		
		int[] count = new int[126];
		
		for(int j = 0; j < ch.length; j++) {
			count[ch[j]]++;
		}
		
		for(int i = 0; i < ch.length; i++) {
			
			for(int j = 1; j < k; j++) {
				if(ch[j-1] != 0 && ch[j] !=0 && (ch[j-1] != ch[j]) ) {
					even += ch[j]-97;
				}
				else if(ch[j] != 0 && ch[j] % 2 != 0) {
					odd += ch[j]-97;
				}
			}
			
			min = Math.min(even, odd);
		}
		
		return min;
	}

}
