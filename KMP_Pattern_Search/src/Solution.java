import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 16, 2019
 * 
 * implemented using knuth morris pratt algorithm
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		String pat = scan.next();
		String txt = scan.next();
		
		KMPSearch(pat, txt);

	}
	static void KMPSearch(String pat, String txt) {
		
		int m = pat.length();
		int n = txt.length();
		
		int[] lps = new int[m];
		
		computeLPS(pat, m, lps);
		
		int j = 0; //index for pattern
		int i = 0; //index for txt
		
		while(i < n) {
			if(pat.charAt(j) == txt.charAt(i)) {
				i++;
				j++;
			}
			if(j == m) {
				System.out.println("Index: "+(i-j));
				j = lps[j-1];
			}
			else if(i < n && pat.charAt(j) != txt.charAt(i)){
				if(j != 0) {
					j = lps[j-1];
				}
				else {
					i = i + 1;
				}
			}
		}
		
	}
	static void computeLPS(String pat, int m, int[] lps) {
		
		int len = 0; //length of the previous longest prefix suffix
		int i = 1;
		lps[0] = 0;
		
		while(i < m) {
			if(pat.charAt(i) == pat.charAt(len)) {
				len++;
				lps[i] = len;
				i++;
			}
			else {
				if(len != 0) {
					len = lps[len - 1];
				}
				else {
					lps[i] = len;
					i++;
				}
			}
		}
	}

}
