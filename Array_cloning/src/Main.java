import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();
		int [] ar=new int[size];
		
		for(int I=0;I<ar.length;I++) {
			ar[I]=scan.nextInt();
		}
		scan.close();
		int[] cloneAr=ar.clone();
		
		System.out.println("Printing clone array element:");
		for(int I=0;I<cloneAr.length;I++) {
			System.out.println(cloneAr[I]);
		}

	}

}
