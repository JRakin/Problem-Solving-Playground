import java.util.Scanner;

public class Main {

    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int t = scan.nextInt();

        while (t-- > 0){
            int n = scan.nextInt();
            int c = scan.nextInt();
            int m = scan.nextInt();

            System.out.println(feast(n, c, m));
        }
    }
    static int feast(int n, int c, int m){
        int num = 0;
        num = n / c;

        if(num < m){
            return num;
        }
        return num + calculation(num, m);
    }
    static int calculation(int num, int m){
        int count = 0;
        int countChocolate = 0;

        while(num >= m){
            count = (num / m);
            if(num%m != 0){
                num = num - (count * m)+count;
            }else{
                num = count;
            }
            countChocolate += count;
        }
        return countChocolate;
    }

}
