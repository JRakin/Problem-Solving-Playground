import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author Rakin
 *
 * Dec 22, 2019
 */
class Main {

	
	public static void main(String[] args) throws java.lang.Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = new Scanner(System.in).nextInt();
		
		while(t-- > 0) {
			String number = br.readLine();
			System.out.println(makePalindrome(number));
		}
		
		
	}
	static long makePalindrome(String number) {
		
		long num = Long.parseLong(number.toString());
		num++;
		for(long i = num;  ;i++) {
			if(isPalindrome(i)) {
				return i;
			}
		}
		
	}
	static boolean isPalindrome(long num) {
		String str = String.valueOf(num);
		StringBuilder sb = new StringBuilder(str);
		
		if(str.equals(sb.reverse().toString())) {
			return true;
		}
		
		return false;
	}

}
