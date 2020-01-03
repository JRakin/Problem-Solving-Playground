import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		scan.close();
		String[] word=str.trim().split("[ !,?.\\\\_'@]+");
		
		if(str==null||str.equals("")||str.trim().equals("")) {
			System.out.println("0");
		}
		else if(str.length()>400000) {
			return;
		}
		else {
			System.out.println(word.length);
		}
		
		for(String str1:word) {
			System.out.println(str1);
		}
	}
}
