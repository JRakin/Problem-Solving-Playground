import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 13, 2019
 */
public class Main {

	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		int t = scan.nextInt();
		
		while(t-- > 0) {
			int n = scan.nextInt();
			int c = scan.nextInt();
			
			int[] pos = new int[n];
			
			for(int i = 0; i < n; i++) {
				pos[i] = scan.nextInt();
			}
			System.out.println(distance(pos, c));
		}

	}
	static int distance(int[] pos, int c) {
		Arrays.sort(pos);
		
		int start = 0;
		int end = pos[pos.length-1] - pos[0] + 1;
//		System.out.println(end);
		int mid = 0;
		
		while(end - start > 1) {
			
			mid = (end+start)/2;
			System.out.println("Mid: "+mid);
			
			if(f(mid, pos, c)) {
				start = mid;
			}
			else {
				end = mid;
				System.out.println("End: "+end);
			}
		}
		
		return start;
	}
	static boolean f(int x, int[] pos, int c) {
		int cowplaced = 1;
		int lastpos = pos[0];
		
		for(int i = 1; i < pos.length; i++) {
			
			if(pos[i] - lastpos >= x) {
				
				if(++cowplaced == c) {
					return true;
				}
				lastpos = pos[i];
			}
		}
		return false;
	}

}
