import java.util.Scanner;

/**
 * @author Rakin
 *12:22:29 PM
 * Apr 6, 2018
 */
public class Solution {
	
	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		//int n = scan.nextInt();
		
		String caesar = scan.nextLine();
		//scan.nextLine();
		int k = scan.nextInt();
		
		System.out.println(caesarCipher(caesar,k%26));
	}
	
	static String caesarCipher(String caesar, int k) {
		String cipher = "";
		if(k == 0) {
			return caesar;
		}
		else {
			for(int i=0; i<caesar.length(); i++) {
				if(caesar.charAt(i) >=97 && caesar.charAt(i) <=122) {
					char ch = caesar.charAt(i);
					ch += k;
					if(ch > 122) {
						ch = (char) (96 + ch -122);
					}
					cipher += ch;
				}
				else if(caesar.charAt(i) >= 65 && caesar.charAt(i) <=90){
					char ch = caesar.charAt(i);
					ch += k;
					if(ch > 90) {
						ch = (char) (64+ ch -90);
					}
					cipher += ch;
				}
				else {
					char ch = caesar.charAt(i);
					cipher += ch;
				}
			}
			
			return cipher;
		}
	}

}
