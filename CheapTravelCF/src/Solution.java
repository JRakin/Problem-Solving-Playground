import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 19, 2019
 */
public class Solution {
	
	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println(countCost(n,m,a,b));
		
		
	}
	static int countCost(int n, int m, int a, int b) {
		
		int cost = 0;
		int remain;
		int temp;
		
		/*if(m * a <= b || n*a < b) {
			cost = n * a;
		}
		else {
			if(n < m) {
				cost = cost + b;
			}
			else {
				int price = (n/m);
				System.out.println(price);
				cost = price*b;
				System.out.println(cost);
				n = n%m;
				
				
				
			}
		}*/
		if(((double) b/m > a) || (m == 1)) {
			cost = Math.min(a, b) * n;
		}
		else {
			remain = n%m;
			temp = n/m;
			cost = remain*a + (temp*b);
			cost =  Math.min(cost, (temp*b)+b);
		}
		
		return cost;
	}

}
