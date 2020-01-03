import java.util.Scanner;
import java.util.Stack;

public class Solution {

    static String isBalanced(String s) {
    	
    	char[] ch=s.toCharArray();
    	
    	Stack<Character> stack = new Stack<Character>();
    	
    	for(int i = 0; i < s.length(); i++) {
    		
    		if(ch[i] == '(' || ch[i] == '{' || ch[i] == '[') {
    			stack.push(ch[i]);
    		}
    		if(ch[i] == ')' || ch[i] == '}' || ch[i] == ']') {
    			
    			if(stack.isEmpty()) {
    				return "No";
    			}
    			else if(!isBalanced(stack.pop(), ch[i])){
    				return "No";
    			}
    		}
    	}
    	
    	if(stack.isEmpty()) {
    		return "Yes";
    	}
    	else
    		return "No";
        
    }
    
    static boolean isBalanced(Character ch1, Character ch2) {
    	
    	if(ch1 == '(' && ch2 == ')') {
    		return true;
    	}
    	else if(ch1 == '{' && ch2 == '}') {
    		return true;
    	}
    	else if(ch1 == '[' && ch2 == ']') {
    		return true;
    	}
    	
		return false;
    }
    
    public static void main(String[] args) {
    	
        Scanner in = new Scanner(System.in);
        
        int t = in.nextInt();
        
        for(int i = 0; i < t; i++){
        	
            String s = in.next();
            String result = isBalanced(s);
            System.out.println(result);
        }
        
        in.close();
    }
}