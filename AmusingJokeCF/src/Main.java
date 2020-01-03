import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        String s1 = scan.next();
        String s2 = scan.next();
        String s3 = scan.next();

        System.out.println(isAmusing(s1,s2,s3));
    }
    static String isAmusing(String s1, String s2, String s3){

        boolean amusing = true;
        StringBuilder sb = new StringBuilder(s1.concat(s2));
        String s4 = new String(sb);
        //System.out.println(sb);

        char[] ch1 = s3.toCharArray();
        char[] ch2 = s4.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if (ch1.length != ch2.length){
            return "NO";
        }
        else{
            for (int i = 0; i < ch1.length; i++){
                if (ch1[i] != ch2[i]){
                    amusing = false;
                }
            }
        }
        if (!amusing){
            return "NO";
        }
        else{
            return "YES";
        }

    }
}
