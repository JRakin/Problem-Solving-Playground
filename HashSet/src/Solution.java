import java.util.HashSet;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		String [] pair_left=new String[n];
		String [] pair_right=new String[n];
		
		for(int i=0;i<n;i++) {
			pair_left[i]=scan.next();
			pair_right[i]=scan.next();
		}
		HashSet<String> hash=new HashSet<>();
		for(int i=0;i<n;i++) {
			String str=pair_left[i]+"+"+pair_right[i];
			hash.add(str);
			System.out.println(hash.size());
		}
		scan.close();
	}
}
