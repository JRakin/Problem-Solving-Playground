import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Achilles
 *
 * Dec 23, 2019
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		int n = scan.nextInt();
		int q = scan.nextInt();
		int lastAns = 0;
		
		List< List<Integer> > seqList = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			seqList.add(new ArrayList<Integer>());
		}
		
		for(int i = 0; i < q; i++) {
			int t = scan.nextInt();
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			ArrayList<Integer> seq = (ArrayList<Integer>) seqList.get((x^lastAns)%n);
			if(t == 1) {
				seq.add(y);
			}
			else {
				lastAns = seq.get(y % seq.size());
				System.out.println(lastAns);
			}
		}

	}

}
