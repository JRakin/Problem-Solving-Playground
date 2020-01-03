import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Rakin
 *
 * Aug 1, 2019
 */
public class Solution {

	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		
		String text = br.readLine();
		text = text.trim().replace(" ", "");
		
		//System.out.println(text);
		int n = text.length();
		
		encription(text,n);
	}
	static void encription(String text, int n) {
		
		int row = (int) Math.floor(Math.sqrt(n));
		int col = (int) Math.ceil(Math.sqrt(n));
		
		for(int i = 0; i < col; i++) {
			for(int j = i; j < n; j+=col) {
				System.out.print(text.charAt(j));
			}
			System.out.print(" ");
		}
	}

}
