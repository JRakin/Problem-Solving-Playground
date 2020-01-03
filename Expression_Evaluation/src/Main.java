import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String exp=scan.nextLine();
		
		System.out.println(Main.evaluateExp(exp));
		scan.close();

	}
	public static int evaluateExp(String exp) {
		char[] ch=exp.toCharArray();
		
		Stack<Integer> values=new Stack<Integer>();
		Stack<Character> operator=new Stack<Character>();
		
		for(int I=0;I<ch.length;I++) {
			
			if(ch[I]>='0' && ch[I]<='9') {
				StringBuffer buffer=new StringBuffer();
				
				while(I<ch.length && ch[I]>='0' && ch[I]<='9') {
					buffer.append(ch[I++]);
				}
				values.push(Integer.parseInt(buffer.toString()));
			}
			else if(ch[I]=='(') {
				
				operator.push(ch[I]);
			}
			else if(ch[I]==')') {
				
				while(operator.peek() != '(') {
					values.push(applyOp(operator.pop(),values.pop(),values.pop()));
				}
				
				operator.pop();
			}
			else if(ch[I]=='+'||ch[I]=='-'||ch[I]=='*'||ch[I]=='/') {
				
				while(!operator.empty() && hasPrec(ch[I],operator.peek())) {
					values.push(applyOp(operator.pop(),values.pop(),values.pop()));
				}
				
				operator.push(ch[I]);
			}
		}
		
		while(!operator.empty()) {
			values.push(applyOp(operator.pop(),values.pop(),values.pop()));
		}
		
		return values.pop();
	}
	
	public static boolean hasPrec(char op1,char op2) {
		if(op2=='('||op2==')') {
			return false;
		}
		if((op1=='*' || op1=='/') && (op2=='+' || op2=='-')) {
			return false;
		}
		else 
			return true;
	}
	
	public static int applyOp(char op,int b,int a) {
		switch(op) {
		case '+':
			return a+b;
		case '-':
			return a-b;
		case '*':
			return a*b;
		case '/':
			if(b==0) {
				throw new
				UnsupportedOperationException("Can not divided by zero");
			}
			return a/b;
		}
		return 0;
	}

}

