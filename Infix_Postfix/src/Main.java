import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		String exp=scan.nextLine();
		System.out.println(infixToPostfix(exp));
		scan.close();

	}
    static String infixToPostfix(String exp) {
		
		String result=new String(" ");
		
		Stack<Character> values=new Stack<>();
		
		for(int I=0;I<exp.length();I++) {
			char ch=exp.charAt(I);
			if(Character.isLetterOrDigit(ch)) {
				result+=ch;
			}
			else if(ch=='(') {
				values.push(ch);
			}
			else if(ch==')') {
				
				while(!values.isEmpty() && values.peek() !='(') {
					result+=values.pop();
				}
				if(!values.isEmpty() && values.peek() !='(') {
					return "invalid";
				}
				else {
					values.pop();
				}
			}
			else {
				while(!values.isEmpty() && Prec(ch)<=Prec(values.peek())) {
					result+=values.pop();
				}
				values.push(ch);
			}
		}
		while(!values.isEmpty()) {
			result+=values.pop();
		}
		return result;
	}
	static int Prec(char ch){
		
		switch(ch) {
		
		case '-':
		case '+':
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
