import java.util.Scanner;
import java.util.Stack;

/**
 * @author Rakin
 *
 * Jul 28, 2019
 */
public class Solution {

	
	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		int n = scan.nextInt();
		Stack<Integer> stack = new Stack<>();
		Stack<Integer> stack1 = new Stack<>();
		int max = Integer.MAX_VALUE;
		
		while(n-- > 0) {
			int q = scan.nextInt();
			
			if(q == 1) {
				int temp = scan.nextInt();
				max = Math.max(max, temp);
				
				stack.add(max);
				//System.out.println(stack.peek());
			}
			else if(q == 2) {
				if(!stack.isEmpty()) {
					stack.pop();
				}
			}
			else if(q == 3) {
				System.out.println(findMax(stack));
			}
		}

	}
	static int findMax(Stack<Integer> stack) {
		
		int max = 0;
		
		while(!stack.isEmpty()) {
			
			if(stack.peek() > max) {
				max = stack.pop();
			}
			else {
				stack.pop();
			}
		}
		
		return max;
	}

}
