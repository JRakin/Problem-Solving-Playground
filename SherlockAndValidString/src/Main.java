import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String str = scan.next();
        System.out.println(validString(str));
    }
    static String validString(String str){
        int[] count = new int[26];
        int b = 0;
        for (int i = 0; i < count.length; i++){
            count[i] = 0;
        }
        for (int i = 0; i < str.length(); i++){
            count[str.charAt(i) - 97]++;
        }
        Arrays.sort(count);
        int element = 0;
        int c = 0;
        int countLength = 0;

        for (int i = 0; i < count.length; i++){
            if (count[i] != 0){
                element = count[i];
                break;
            }
        }
        for (int i = 0; i < count.length; i++){
            if (count[i] != 0){
                countLength++;
            }
        }

        for (int i = 1; i < count.length; i++){
            if (count[i] != 0){
                if ((count[i]  - element > 1)){
                    b++;
                }
                else if ((count[i] - element == 1)){
                    c++;
                }
            }
        }
        //System.out.println(b+" "+c);
        if ((c == 1 || c == 0 || c == countLength-1) && (b == 0)){
            return "YES";
        }
        else{
            return "NO";
        }
    }
}
