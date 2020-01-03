import java.util.Scanner;

public class Main {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int x1 = scan.nextInt();
        int x2 = scan.nextInt();
        int x3 = scan.nextInt();

        System.out.println(distance(x1,x2,x3));
    }
    static int distance(int a, int b, int c){
        int mid = 0;
        if((a < b && b < c) || (c < b && b < a)){
            mid = b;
        }
        else if((b < a && a < c) || (c < a && a < b) ){
            mid = a;
        }
        else{
            mid = c;
        }

        if(mid == a){
            return Math.abs(b-a)+Math.abs(c-a);
        }
        else if(mid == b){
            return Math.abs(c-b)+Math.abs(a-b);
        }
        else{
            return Math.abs(a-c)+Math.abs(b-c);
        }

    }
}
