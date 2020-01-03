import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/**
 * @author Rakin
 *
 * Dec 25, 2019
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i =0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println(minimumSwaps(arr));
	}
	static int minimumSwaps(int[] arr) {
		
		int swap = 0;
		
		int[] sorted = Arrays.copyOf(arr, arr.length);
		Arrays.sort(sorted);
		
		Map<Integer, Integer> map = new HashMap<>();
		int k = 0;
		
		for(int n : arr) {
			map.put(n, k++);
		}
		System.out.println(map);
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] != sorted[i]) {
				
				swap++;
				int temp = map.get(sorted[i]);
				map.put(arr[i], temp);
				//just checking map for debugging
				System.out.println(map);
				int temp1 = arr[i];
				arr[i] = arr[temp];
				arr[temp] = temp1;
				
			}
		}
		
		return swap;
		
	}

}

