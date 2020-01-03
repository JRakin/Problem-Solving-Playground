import java.util.Scanner;

public class Main {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int d1 = scan.nextInt();
        int m1 = scan.nextInt();
        int y1 = scan.nextInt();

        int d2 = scan.nextInt();
        int m2 = scan.nextInt();
        int y2 = scan.nextInt();

        System.out.println(fine(d1,m1,y1,d2,m2,y2));
    }
    static int fine(int d1, int m1, int y1, int d2, int m2, int y2){

        if(y1 > y2){
            return 10000;
        }
        else if(y1 == y2){
            if(m1 > m2){
                return (m1-m2) * 500;
            }
            else if(d1 > d2 && m1 == m2){
                return (d1-d2)*15;
            }
        }
        return 0;
    }

}
