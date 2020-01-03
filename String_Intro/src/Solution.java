import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String A=scan.next();
		String B=scan.next();
		
		scan.close();
		
		System.out.println(A.length()+B.length());
		if(A.charAt(0)<=B.charAt(0)) {
			System.out.println("No");
		}
		else {
			System.out.println("Yes");
		}
		String str1=A.substring(0, 1).toUpperCase()+A.substring(1);
		String str2=B.substring(0, 1).toUpperCase()+B.substring(1);
		System.out.println(str1+" "+str2);

	}

}
