import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		int[] arr1=new int[n];
		int[] arr2=new int[n];
		
        for(int i=0;i<n;i++) {
			arr1[i]=scan.nextInt();
		}
        for(int i=0;i<n;i++) {
        	arr2[i]=scan.nextInt();
        }
        scan.close();
		
		int [] sortedArr1=sort(arr1);
		int [] sortedArr2=sort(arr2);
		
		
		
		int count=0;
		
		for(int k=0;k<n;k++) {
			if(sortedArr1[k]>sortedArr2[k]) {
				count++;
			}
		}
		if(count==n) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

	}
	static int[] sort(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			for(int k=0;k<arr.length-i-1;k++) {
				if(arr[k]>arr[k+1]) {
					int temp=arr[k];
					arr[k]=arr[k+1];
					arr[k+1]=temp;
				}
			}
		}
		return arr;
	}
}
