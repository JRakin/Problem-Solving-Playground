import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 30, 2019
 */
public class Main {

	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		long n = scan.nextLong();
		isHappy(n);
	}
	static void isHappy(long n) {
		
		long count = 0;
		boolean run = true;
		
		Map<Long,Integer> map = new HashMap<>();
		
		while(run) {
			long result = 0;
			while(n != 0) {
				long temp = n % 10;
				n /= 10;
				result += (temp*temp);
			}
			
			count++;
			if(map.containsKey(result)) {
				System.out.println(-1);
				run = false;
			}
			else {
				map.put(result, 1);
				
				if(result == 1) {
					System.out.println(count);
					run  = false;
				}
				else {
					n = result;
				}
			}
			
		}
		
	}

}
