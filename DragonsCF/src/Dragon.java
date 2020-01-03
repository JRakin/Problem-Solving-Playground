import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Dragon {
    public static final Scanner scan = new Scanner(System.in);
    static class Drag implements Comparable<Drag>{
        int x;
        int y;

        public Drag(int x, int y){
            this.x = x;
            this.y = y;
        }
        @Override
        public int compareTo(Drag obj) {
            return this.x-obj.x;
        }
    }

    public static void main(String[] args) {
        int s = scan.nextInt();
        int n = scan.nextInt();

        ArrayList<Drag> dragons = new ArrayList<>();

        for (int i = 0; i < n; i++){
            dragons.add(new Drag(scan.nextInt(),scan.nextInt()));
        }
        Collections.sort(dragons);

        boolean isWinner = true;

        for (Drag drag : dragons){
            if (s > drag.x){
                s += drag.y;
            }
            else {
                isWinner = false;
            }
        }

        if (isWinner){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
