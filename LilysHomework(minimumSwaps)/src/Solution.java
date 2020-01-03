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
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		int[] reversed = Arrays.copyOf(arr, arr.length);
		
		for(int i = 0; i < arr.length / 2; i++) {
			int temp = reversed[i];
			reversed[i] = reversed[arr.length - i -1];
			reversed[arr.length - i -1] = temp;
		}
		//checking for both ascending and descending order
		int asc = minimumSwap(arr);
		int dsc = minimumSwap(reversed);
		
		System.out.println(Math.min(asc, dsc));

	}
	static int minimumSwap(int[] arr) {
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < arr.length; i++) {
			map.put(arr[i], i);
		}
		
		int[] sorted = Arrays.copyOf(arr, arr.length);
		Arrays.sort(sorted);
		
		int swaps = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != sorted[i]) {
				swaps++;
				int temp = map.get(sorted[i]);
				System.out.println(temp);
				map.put(arr[i],temp);
				int temp1 = arr[i];
				arr[i] = arr[temp];
				arr[temp] = temp1;
			}
		}
		
		return swaps;
	}

}
