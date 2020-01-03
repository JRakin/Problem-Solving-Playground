import java.util.Scanner;
import java.util.Stack;

public class Solution {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String exp=scan.nextLine();
		Stack<Character> stack=new Stack<Character>();
		
		for(int i=0;i<exp.length();i++) {
			char[] ch=exp.toCharArray();
			if(ch[0]=='+' || ch[0]=='-' || ch[0]=='/' || ch[0]=='*' || ch[0]==')') {
				System.out.println("Invalid equation");
				break;
			}
			
		}
		
		//System.out.println(InfixToPostfix(exp));
		
		scan.close();
	}
	static String InfixToPostfix(String exp) {
		char[] ch=exp.toCharArray();
		String result="";
		Stack<Character> stack=new Stack<>();
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='a' && ch[i]<='z' || ch[i]>='0' && ch[i]<='9') {
				result+=ch[i];
			}
			else if(ch[i]=='(') {
				stack.push(ch[i]);
			}
			else if(ch[i]==')') {
				while(!stack.isEmpty() && stack.peek()!='(') {
					result+=stack.pop();
				}
				if(!stack.isEmpty() && stack.peek()!='(') {
					return "Invalid Equation";
				}
				else {
					stack.pop();
				}
			}
			else{
				while(!stack.isEmpty() && precedence(ch[i])<=precedence(stack.peek())) {
					result+=stack.pop();
				}
			}
			stack.push(ch[i]);
		}
		while(!stack.isEmpty()) {
			result+=stack.pop();
		}
		return result;
	}
	static int precedence(char ch) {
		if(ch=='+' || ch=='-') {
			return 1;
		}
		else if(ch=='*' || ch=='/') {
			return 2;
		}
		else if(ch=='^') {
			return 3;
		}
		else {
			return -1;
		}
	}

}
