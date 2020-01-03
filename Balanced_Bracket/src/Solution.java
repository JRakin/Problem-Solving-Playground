import java.util.Scanner;
import java.util.Stack;

public class Solution {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		while(scan.hasNext()) {
			String str=scan.next();
			boolean result=isBalanced(str);
			System.out.println(result);
		}
		scan.close();
	}
	public static boolean isBalanced(String str) {
		char[] ch=str.toCharArray();
		Stack<Character> stack=new Stack<Character>();
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='('||ch[i]=='{'||ch[i]=='[') {
				stack.push(ch[i]);
			}
			else if(ch[i]==')'||ch[i]=='}'||ch[i]==']') {
				if(stack.isEmpty()) {
					return false;
				}
				else if(!isMatched(stack.pop(),ch[i])){
					return false;
				}
			}
		}
		if(stack.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
    static boolean isMatched(Character ch1, Character ch2) {
    	if(ch1=='(' && ch2==')') {
    		return true;
    	}
    	else if(ch1=='{' && ch2=='}') {
    		return true;
    	}
    	else if(ch1=='[' && ch2==']') {
    		return true;
    	}
		return false;
    }
}
