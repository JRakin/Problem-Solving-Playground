import java.util.Scanner;
import java.util.Stack;


/**
 * @author Rakin
 *11:49:29 PM
 * licensed to Rakin
 */
public class Solution {
	
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		String expr = scan.nextLine();
		boolean isValid = false;
				
		for(int i=0; i<expr.length(); i+=2) {
			
			char c =expr.charAt(i);
		
			if(!Character.isLetter(c)) {
				isValid = true;
				break;
			}
			
		}
		for(int i=1; i<expr.length(); i++) {
			
			char c = expr.charAt(i);
			char d = expr.charAt(i-1);
			
			if(Character.isLetter(c)==Character.isLetter(d)) {
				isValid = true;
				break;
			}
		}
		
		if(!isValid) {
			
			String result = infixToPostfix(expr);
			System.out.println("Postfix:");
			System.out.println(result);
			System.out.println("Result:");
			System.out.println(evaluatePostfix(result));
		}
		else {
			System.out.println("Invalid Expression!!");
		}
		
	}
    static String infixToPostfix(String exp) {
    	
    	System.out.println("Give value:");
    	
    	for(int i=0; i<exp.length(); i++) {
    		
    		char ch = exp.charAt(i);
    		
    		if(Character.isLetterOrDigit(ch)) {
    			char c = scan.next().charAt(0);
    			
    			exp = exp.replace(ch, c);
    		}
    	}

        String result=new String(" ");
		
		Stack<Character> values=new Stack<>();
		
		for(int i=0; i<exp.length(); i++) {
			
			char ch=exp.charAt(i);
			
			if(Character.isDigit(ch)) {
				result += ch;
			}
			else {
				while(!values.isEmpty() && prec(ch)<=prec(values.peek())) {
					result+=values.pop();
				}
				values.push(ch);
			}
		}
		while(!values.isEmpty()) {
			result+=values.pop();
		}
		
		return result.trim();
	}
	static int prec(char ch){
		
		switch(ch) {
		
		case '-':
		case '+':
			return 1;
		case '*':
		case '/':
			return 2;
		}
		return -1;
	}
	static int evaluatePostfix(String exp) {
		
		Stack<Integer> number = new Stack<Integer>();
		
		for(int i=0; i<exp.length();i++) {
			
			char ch = exp.charAt(i);
			
			if(Character.isDigit(ch)) {
				int n = ch - '0';
				number.push(n);
			}
			else {
				
				int y = number.pop();
				int x = number.pop();
				
				switch(ch) {
				case '+':
					int a=x+y;
					number.push(a);
					break;
					
				case '-':
					int s=x-y;
					number.push(s);
					break;
					
				case '*':
					int m=x*y;
					number.push(m);
					break;
					
				case '/':
					int d=x/y;
					number.push(d);
					break;
				}
			}
		}
		
		return number.pop();
	}
		
}
