import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 10, 2019
 */
public class Solution {
	
	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		
		ArrayList<Integer> list = closerNumber(arr);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
	}
	static ArrayList<Integer> closerNumber(int[] arr){
		
		Arrays.sort(arr);
		/*for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}*/
		ArrayList<Integer> list = new ArrayList<>();
		
		int d = arr[1] - arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			
			if(Math.abs(arr[i] - arr[i-1]) == d) {
				list.add(arr[i-1]);
				list.add(arr[i]);
			}
			else if(Math.abs(arr[i] - arr[i-1]) < d) {
				d = Math.abs(arr[i] - arr[i-1]);
				
				list.clear();
				/*for(int j = 0; j < list.size(); j++) {
					list.remove(j);
				}*/
				
				list.add(arr[i-1]);
				list.add(arr[i]);
			}
		}
		
		return list;
	}

}
