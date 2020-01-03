import java.util.*;

public class Main {

    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scan.nextInt();
        int m = scan.nextInt();

        Deque<Integer> deque = new ArrayDeque<>();
        Set<Integer> set = new HashSet<>();

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++){
            int num = scan.nextInt();

            deque.add(num);
            set.add(num);
        }

        System.out.println(deque.remove());
        deque.addFirst(scan.nextInt());
        System.out.println(deque.remove());
        System.out.println(deque.removeLast());
        //System.out.println(max);
    }
}
