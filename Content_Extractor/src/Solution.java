import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int testCases=Integer.parseInt(scan.nextLine());
		
		while(testCases-->0) {
			String content=scan.nextLine();
			Pattern pat=Pattern.compile("<(.+)>([^<]+)</\\1>");
			Matcher m=pat.matcher(content);
			boolean isMatched = false;
			
				while(m.find()) {
					System.out.println(m.group(2));
					isMatched=true;
				}
				if(!isMatched) {
					System.out.println("None");
				}
		}
		scan.close();
	}

}
