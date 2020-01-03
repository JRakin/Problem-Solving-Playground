import java.util.Scanner;

/**
 * @author Achilles
 *
 * Aug 31, 2019
 */
public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		int dayReturned = scan.nextInt();
		int monthReturned = scan.nextInt();
		int yearReturned = scan.nextInt();
		
		int dayActual = scan.nextInt();
		int monthActual = scan.nextInt();
		int yearActual = scan.nextInt();
		
		int fine = 0;
		
		if(yearActual == yearReturned) {
			if(monthActual == monthReturned) {
				if(dayReturned > dayActual) {
					fine = (dayReturned - dayActual) * 15;
				}
			}
		}
		if(yearActual == yearReturned) {
			if(monthReturned > monthActual) {
				fine = (monthReturned - monthActual) * 500;
			}
			
		}
		else{
			if(yearReturned > yearActual) {
				fine = 10000;
			}
			
		}
		
		System.out.println(fine);

	}

}
