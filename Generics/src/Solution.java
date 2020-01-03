import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		Integer[] numAr=new Integer[n];
		String [] strAr=new String[n];
		
		System.out.println("One integer then One String:");
		for(int i=0;i<n;i++) {
			numAr[i]=scan.nextInt();
			strAr[i]=scan.next();
		}
		scan.close();
		
		Display<Integer> display=new Display<Integer>();
		Display<String> displays=new Display<String>();
		
		display.printArray(numAr);
		displays.printArray(strAr);
	}

}
