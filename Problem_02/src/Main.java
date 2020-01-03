import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		ArrayList<String> strList=new ArrayList<String>();
		ArrayList<String> numList=new ArrayList<String>(Arrays.asList("1","2","3","4","5","6","7","8","9","0"));
		ArrayList<String> varList=new ArrayList<String>(Arrays.asList("a","b","c","d","e","f","g","x","y","z"));
		Stack<String> stack=new Stack<String>();
		Stack<Character> variable=new Stack<Character>();
		
		System.out.println("Enter Number of variable:");
		int numOfVar=scan.nextInt();
		String[] str=new String[numOfVar];
		
		for(int I=0;I<numOfVar;I++) {
			str[I]=scan.nextLine();
			String[] temp=str[I].split(" ");
			for(String input:temp) {
				strList.add(input);
			}
		}
		for(int I=0;I<strList.size();I++) {
			if(strList.contains(numList.get(I))) {
				stack.push(strList.get(I));
			}
			else if(strList.contains(varList.get(I))) {
				variable.push(strList.get(I).charAt(I));
			}
		}
		while(stack.size()!=-1) {
			System.out.println(stack.pop());
		}

	}

}
