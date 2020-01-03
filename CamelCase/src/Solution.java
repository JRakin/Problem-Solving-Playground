import java.util.Scanner;

public class Solution {

    static int camelcase(String s) {
        String[] str1=s.trim().split("[A-Z]+");
        for(String str2:str1) {
        	System.out.println(str2);
        }
        return str1.length;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int result = camelcase(str);
        System.out.println(result);
        in.close();
    }
}