import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        int n = scan.nextInt();

        while (n-- > 0){
            String str = scan.next();

            if (map.containsKey(str)){
                int count = map.get(str);
                count++;
                map.put(str,count);
                System.out.println(str+count);
            }else {
                System.out.println("OK");
                map.put(str,0);
            }
        }
    }
}
