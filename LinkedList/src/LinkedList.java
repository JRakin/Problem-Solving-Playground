import java.util.Scanner;

/**
 * @author Rakin
 *
 * Jul 16, 2018
 */
public class LinkedList {

	Node head;
	private static final Scanner scan = new Scanner(System.in);
	
	class Node{
		
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	public void prepend(int new_data) {
		
		Node new_node = new Node(new_data);
		
		new_node.next = head;
		head = new_node;
	}
	public void insertAfter(Node pre_node,int new_data) {
		
		if(pre_node == null) {
			return;
		}
		
		Node new_node = new Node(new_data);
		
		new_node.next = pre_node.next;
		pre_node.next = new_node;
	}
	public void append(int new_data) {
		
		Node new_node = new Node(new_data);
		
		if(head == null) {
			head = new Node(new_data);
		}
		
		new_node.next = null;
		
		Node last = head;
		
		while(last.next != null) {
			last = last.next;
		}
		last.next = new_node;
		
		return;
	}
	public void printList() {
		Node tnode = head;
		
		while(tnode != null) {
			System.out.print(tnode.data+" ");
			tnode = tnode.next;
		}
	}
	public static void main(String[] args) {
		
		 LinkedList list = new LinkedList();
		 
		 int n = scan.nextInt();
		 
		 for(int i = 0; i < n; i++) {
			 
			 int d = scan.nextInt();
			 list.append(d);
		 }
		 
		 list.printList();

	}

}
