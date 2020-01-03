import java.util.Scanner;

public class Main {

    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(largestValue(a,b,c));
    }
    static int largestValue(int a, int b, int c){
        int max = 0;

        if(a*b*c > max){
            max = a*b*c;
        }
        if(a+b*c > max){
            max = a+b*c;
        }
        if(a*(b+c) > max){
            max = a*(b+c);
        }
        if((a+b)*c > max){
            max = (a+b)*c;
        }
        if(a+b+c > max){
            max = a+b+c;
        }

        return max;
    }
}
