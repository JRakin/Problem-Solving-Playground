import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int n = scan.nextInt();
		
		int [] ar = new int[n];
		for(int I = 0; I < n; I++) {
			ar[I] = scan.nextInt();
		}
		
		scan.close();
		
		insertionSort(ar,n);
		
		for(int i : ar) {
			System.out.print(i+" ");
		}
		
	}
	static void insertionSort(int [] arr,int n) {
		
		for(int i = 1; i < n; i++) {
			
			int key = arr[i];
			int j = i - 1;
			
			while(j >=0 && arr[j] > key) {
				
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
					
	}

}
