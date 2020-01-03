import java.math.BigInteger;
import java.util.*;

public class Main {

    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        long l = scan.nextLong();
        long r = scan.nextLong();

        long res = r - l;
        if (res % 2 == 0){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
            pairs(l,r);
        }
    }
    static void pairs(long l, long r){
        Set<Long> map = new HashSet<>();

        long res = (r-l+1)/2;
        int count = 0;
        for (long i = l; i <= r; i++){
            for (long j = l + 1; j < r; j++){
                if (gcd(i,j) == 1){

                    if (count <= res && i != j && (!map.contains(i) && !map.contains(j))){
                        System.out.println(i+" "+j);
                        map.add(i);
                        map.add(j);
                        count++;
                    }
                    else {
                        break;
                    }
                }
            }
        }
    }
    static int gcd(long a, long b) {
        BigInteger b1 = BigInteger.valueOf(a);
        BigInteger b2 = BigInteger.valueOf(b);
        BigInteger gcd = b1.gcd(b2);
        return gcd.intValue();
    }
}
