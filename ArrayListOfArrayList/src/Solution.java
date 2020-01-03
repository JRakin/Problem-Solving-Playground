import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int line=scan.nextInt();
		
		ArrayList<ArrayList<Integer>> lists=new ArrayList<ArrayList<Integer>>();
		
		for(int i=0;i<line;i++) {
			ArrayList<Integer> list=new ArrayList<Integer>();
			int ele=scan.nextInt();
			
			for(int k=0;k<ele;k++) {
				list.add(scan.nextInt());
			}
			lists.add(list);
		}
		int query=scan.nextInt();
		
		for(int m=0;m<query;m++) {
			int x=scan.nextInt();
			int y=scan.nextInt();
			
			try {
				System.out.println(lists.get(x-1).get(y-1));
			}catch(Exception e) {
				System.out.println("ERROR!");
			}
		}
		scan.close();

	}

}
