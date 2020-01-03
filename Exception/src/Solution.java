import java.util.Scanner;

public class Solution {
	public static final MyCalculator my_calc=new MyCalculator();
	public static final Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {
		while(scan.hasNext()) {
			int n=scan.nextInt();
			int p=scan.nextInt();
			
			try {
				System.out.println(my_calc.power(n,p));
			}catch(Exception e) {
				System.out.println(e);
			}
		}

	}

}
