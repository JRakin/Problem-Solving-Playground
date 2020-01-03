import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Solution {
	Stack<Character> stack=new Stack<Character>();
	Queue<Character> queue=new LinkedList<>();
	

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		scan.close();
		
		char[] ch=str.toCharArray();
		
		Solution s=new Solution();
		
		for(char c:ch) {
			s.pushCharacter(c);
			s.enqueueCharacter(c);
		}
		
		boolean isPalindrome=true;
		
		for(int i=0;i<ch.length;i++) {
			if(s.popCharacter()!=s.dequeueCharacter()) {
				isPalindrome=false;
				break;
			}
		}
		
		System.out.println("The word, "+str+" is "+(!isPalindrome ?  "not a palindrome":"a palindrome"));
	}
	public void pushCharacter(char ch) {
		stack.push(ch);
	}
	public void enqueueCharacter(char ch) {
		queue.add(ch);
	}
	public char popCharacter() {
		return stack.pop();
	}
	public char dequeueCharacter() {
		return queue.remove();
	}

}
