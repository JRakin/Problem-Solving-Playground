import java.util.Stack;

public class GFG {

	public static void main(String[] args) {
		Queue q=new Queue();
		
		q.stack1=new Stack<>();
		q.stack2=new Stack<>();
		enQueue(q, 0);
		enQueue(q, 2);
		enQueue(q, 3);
		enQueue(q, 4);
		
		System.out.print(deQueue(q)+" ");
        System.out.print(deQueue(q)+" ");
        System.out.print(deQueue(q)+" ");
        System.out.print(deQueue(q)+" ");

	}
	static class Queue{
		Stack<Integer> stack1;
		Stack<Integer> stack2;
	}
	static void pushData(Stack<Integer> top_ref,int new_data) {
		top_ref.push(new_data);
	}
	static int popData(Stack<Integer> top_ref) {
		if(top_ref.isEmpty()) {
			System.out.println("Underflow");
			System.exit(0);
		}
		return top_ref.pop();
	}
	static void enQueue(Queue q,int n) {
		pushData(q.stack1,n);
	}
	static int deQueue(Queue q) {
		int n;
		if(q.stack1.isEmpty() && q.stack2.isEmpty()) {
			System.out.println("Queue is empty");
			System.exit(0);;
		}
		if(q.stack2.isEmpty()) {
			while(!q.stack1.isEmpty()) {
				n=popData(q.stack1);
				pushData(q.stack2,n);
			}
		}
		n=popData(q.stack2);
		return n;
	}

}
