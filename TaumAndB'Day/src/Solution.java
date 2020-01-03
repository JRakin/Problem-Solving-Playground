import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 20, 2018
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int t = scan.nextInt();
		
		for(int i = 0; i < t; i++) {
			
			long b = scan.nextLong();
			long w = scan.nextLong();
			long bc = scan.nextLong();
			long wc = scan.nextLong();
			long z = scan.nextLong();
			
			System.out.println(cost(b,w,bc,wc,z));
		}

	}
	static long cost(long b, long w, long bc, long wc, long z) {
		
	    if((wc+z < bc) && (bc > wc)) {
            return w*wc + b*(wc + z);
        }
        else if((bc+z < wc) && (wc > bc)){
            return b*bc + w*(bc + z);
        }
		return b*bc + w*wc;
	}

}
