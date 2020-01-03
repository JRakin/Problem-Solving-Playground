import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * @author Rakin
 *
 * Aug 2, 2019
 */
public class Solution {

	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		
		String str = br.readLine();
		int n = Integer.parseInt(str);
		
		String[] numbers = new String[n];
		
		for(int i = 0; i < n; i++) {
			numbers[i] = br.readLine();
		}
		
		findCavity(numbers);
		
	}
	static void findCavity(String[] numbers) {
		
		ArrayList<String> list = new ArrayList<>();
		
		for(int j = 0; j < numbers.length; j++) {
			
			for(int i = 1; i < numbers[j].length()-1; i++) {
				
				int a = Integer.parseInt(String.valueOf(numbers[j].charAt(i-1)));
				int b = Integer.parseInt(String.valueOf(numbers[j].charAt(i)));
				int c = Integer.parseInt(String.valueOf(numbers[j].charAt(i+1)));
				
				if(a < b && b > c) {
					StringBuilder sb = new StringBuilder(numbers[i]);
					sb.setCharAt(i, 'X');
					list.add(sb.toString());
					i++;
				}
				else {
					
				}
			}
		}
		
		for(int i = 0; i < list.size(); )
	}

}
