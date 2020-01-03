import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Rakin
 *
 * Jul 31, 2019
 * 
 * not completed
 */
public class Main {

	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		String in1 = br.readLine();
		int t = Integer.parseInt(in1);
		
		while(t-- > 0) {
			String in2 = br.readLine();
			int n = Integer.parseInt(in2);
			
			System.out.println(lcmSum(n));
		}

	}
	static long lcmSum(int n) {
		
		long sum = 0;
		
		for(int i = 1; i <= n; i++) {
			sum += totient(i);
		}
		
		return ((sum+2)*n)/2;
	}
	static int totient(int n) {
		
		int result = n;
		
		for(int i = 2; i*i<=n; i++) {
			if(n%i == 0) {
				while(n%i == 0) {
					n /= i;
				}
				result -= result/i;
			}
		}
		if(n > 1) {
			result -= result/n;
		}
		
		return result;
	}
	

}
