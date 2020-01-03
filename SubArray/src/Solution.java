import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] ar=new int[n];
		
		for(int i=0;i<n;i++) {
			ar[i]=scan.nextInt();
		}
		subArray(ar);
		scan.close();
		
	}
	public static void subArray(int [] ar) {
		
		int count=0;
		
		for(int i=0;i<ar.length;i++) {
			int sum=0;
			for(int k=i;k<ar.length;k++) {
				sum+=ar[k];
				if(sum<0) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}

