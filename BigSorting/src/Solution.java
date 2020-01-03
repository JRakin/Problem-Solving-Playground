import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Solution {
	
	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = scan.nextInt();
		
		String [] str = new String[n];
		
		for(int i=0; i<n; i++) {
			
			str[i] = scan.next();
		}
		
		String [] result = bigSorting(str);
		
		for(int k=0; k<result.length; k++) {
			
			System.out.print(result[k]+ (k != result.length-1 ? "\n":"" ));
		}
		System.out.println("");
		
	}
	
	static String[] bigSorting(String [] arr) {
		
		Arrays.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				if(s1.length() == s2.length()) {
					return s1.compareTo(s2);
				}
				
				 return s1.length() - s2.length();
			}
		});
		
		return arr;
	}

}
