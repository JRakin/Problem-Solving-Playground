import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 17, 2019
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		countTowers(arr);

	}
	static void countTowers(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int max = 0;
		for(int i = 0; i < arr.length; i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			}
			else {
				map.put(arr[i], 1);
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(map.get(arr[i]) > max) {
				max = map.get(arr[i]);
			}
		}
		
		System.out.println(max+" "+map.size());
	}

}
