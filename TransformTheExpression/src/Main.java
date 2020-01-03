import java.util.Scanner;
import java.util.Stack;

/**
 * @author Rakin
 *
 * Jul 28, 2019
 */
public class Main {
	
	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		int t = scan.nextInt();
		
		while(t-- > 0) {
			String exp = scan.next();
			infixToPostfix(exp);
		}
	}
	static void infixToPostfix(String exp) {
		
		Stack<Character> stack = new Stack<>();
		char[] ch = exp.toCharArray();
		String result = new String("");
		
		for(int i = 0; i < ch.length; i++) {
			
			if(Character.isLetterOrDigit(ch[i])) {
				result += ch[i];
			}
			else if(ch[i] == '(') {
				stack.push(ch[i]);
			}
			else if(ch[i] == ')') {
				
				while(!stack.isEmpty() && stack.peek() != '(') {
					result += stack.pop();
				}
				if(!stack.isEmpty() && stack.peek() != '(') {
					return;
				}
				else {
					stack.pop();
				}
			}
			else {
				while(!stack.isEmpty() && precedence(ch[i]) <= precedence(stack.peek())) {
					if(stack.peek() == '(') {
						return;
					}
					result += stack.pop();
				}
				stack.push(ch[i]);
			}
		}
		System.out.println(result);
	}
	static int precedence(char ch) {
		switch(ch) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		}
		return -1;
	}

}
