/**
 * 
 */

/**
 * @author Rakin
 *
 * Mar 29, 2019
 */
public class Solution {
	private int n = 30;
	
	class Inner{
		void show() {
			System.out.println(n);
		}
		
		void innerMethod() {
			class InnerInner{
				void show() {
					System.out.println("I'm the Inner Local Class");
				}
			}
			InnerInner inner = new InnerInner();
			inner.show();
		}
	}
	public static void main(String[] args) {
		Solution sol = new Solution();
		Solution.Inner in = sol.new Inner();
		
		in.show();
		in.innerMethod();
	}

}
