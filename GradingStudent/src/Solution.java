import java.util.Scanner;

/**
 * @author Rakin
 *10:33:48 AM
 * Apr 8, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = Integer.parseInt(scan.nextLine().trim());
		int[] grades = new int[n];
		
		for(int i=0; i<n; i++) {
			grades[i] = scan.nextInt();
		}
		
		int[] result = gradingStudents(grades);
		
		for(int i=0; i<n; i++) {
			System.out.println(result[i]);
		}

	}
	static int[] gradingStudents(int [] arr) {
		
		for(int i=0; i<arr.length; i++) {
			if((5-arr[i]%5) < 3 && arr[i] >= 38) {
				
				arr[i] = arr[i]+(5-arr[i]%5);
			}
		}
		
		return arr;
	}

}
