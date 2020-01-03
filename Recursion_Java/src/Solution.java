import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int i=scan.nextInt();
		calc(i);
		
		scan.close();

	}
	static void calc(int i) {
		
		i++;
		
		if(i<=10) {
			if(i%2==0)
			System.out.println(i);
			calc(i++);
		}	
		
	}

}
