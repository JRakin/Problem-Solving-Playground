import java.util.BitSet;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		//int M=scan.nextInt();
		
		BitSet b1= new BitSet(n);
		BitSet b2= new BitSet(n);
		
		
		
		
		for(int i=0; i<n; i++) {
			int x=scan.nextInt();
			//int y=scan.nextInt();
			b1.set(x);
			//b2.set(y);
			//b1.and(b2);
			
			
			//System.out.println(Integer.toBinaryString(b2.cardinality()));
			
			//System.out.println(b1.cardinality()+" "+b2.cardinality());
		}
		System.out.println(b1.cardinality());
		scan.close();

	}

}
