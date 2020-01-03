import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Rakin
 *
 * Aug 1, 2019
 */
public class Main {
	
	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
        int t = scan.nextInt();
		
		while(t-- > 0){
			int n = scan.nextInt();
			
			int[] arr = new int[n];
			int[] brr = new int[n];
			
			for(int i = 0; i < n; i++){
				arr[i] = scan.nextInt();
			}
			for(int i = 0; i < n; i++) {
				brr[i] = scan.nextInt();
			}
			
			int sum = 0;
			Arrays.sort(arr);
			Arrays.sort(brr);
			for(int i = 0; i < n; i++){
				sum += arr[i]*brr[i];
			}
			System.out.println(sum);
		}
		
		
	}

}
