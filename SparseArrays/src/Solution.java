import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 29, 2019
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		int n = scan.nextInt();
		String[] arr = new String[n];
		for(int i = 0; i < n; i++) {
			arr[i] = scan.next();
		}
		
		int m = scan.nextInt();
		String[] queries = new String[m];
		
		for(int i = 0; i < m; i++) {
			queries[i] = scan.next();
		}
		sparse(arr,queries);

	}
	static void sparse(String[] arr, String[] queries) {
		
		Map<String, Integer> map = new HashMap<>();
		
		for(int i = 0; i < arr.length; i++) {
			
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			}
			else {
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		
		for(int i = 0; i < queries.length; i++) {
			if(map.containsKey(queries[i])) {
				System.out.println(map.get(queries[i]));
			}
			else {
				System.out.println(0);
			}
		}
	}

}
