import java.util.Scanner;

public class Main{

    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();

        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) {
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) {
                queue.dequeue();
            } else if (operation == 3) {
                System.out.println(queue.peek());
            }
        }
    }
}
