import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str1=scan.nextLine();
		
		Stack<Integer> num=new Stack<>();
		ArrayList<String> num1=new ArrayList<>(Arrays.asList("1"));
		
		StringTokenizer str=new StringTokenizer(str1);
		
		while(str.hasMoreTokens()) {
			System.out.println(str.nextToken());
			if(str.nextToken().equals(num1)) {
				num.push(Integer.parseInt(str.nextToken()));
			}
		}
		while(num.size()!=-1) {
			System.out.println(num.pop());
		}
		scan.close();
	}

}
