import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		String [] str=new String[t];
		for(int I=0;I<t;I++) {
			str[I]=scan.next();
			
			char[] ch=str[I].toCharArray();
			
			for(int K=0;K<str[I].length();K+=2) {
				System.out.print(ch[K]);
			}
			System.out.print(" ");
			for(int M=1;M<str[I].length();M+=2) {
				System.out.print(ch[M]);
			}
			System.out.println();
		}
		scan.close();
		

	}

}
