import java.util.Scanner;

public class Solution {

    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        int p = scan.nextInt();
        int d = scan.nextInt();
        int m = scan.nextInt();
        int s = scan.nextInt();

        System.out.println(numberOfGames(p,d,m,s));

    }
    static int numberOfGames(int p, int d, int m, int s){

        int count = 0;

        while(s >= p){
            s -= p;
            p = Math.max(p-d,m);
            count++;
        }

        return count;

    }
}
