import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		ArrayList<Integer> list=new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			int a=scan.nextInt();
			list.add(a);
		}
		int p=scan.nextInt();
		for(int i=0;i<p;i++) {
			String str=scan.next();
			if(str.equals("Insert")) {
				int x=scan.nextInt();
				int y=scan.nextInt();
				
				list.add(x, y);
			}
			else {
				int x=scan.nextInt();
				list.remove(x);
			}
		}
		scan.close();
		for(Integer element:list) {
			System.out.println(element);
		}

	}

}
