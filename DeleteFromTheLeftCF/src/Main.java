import java.util.Scanner;

public class Main {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String s1 = scan.next();
        String s2 = scan.next();

        System.out.println(deleteLeft(s1,s2));
    }
    static int deleteLeft(String s1, String s2){
        int count = 0;

        StringBuilder sb1 = new StringBuilder(s1);
        StringBuilder sb2 = new StringBuilder(s2);

        if(sb1 == sb2){
            return 0;
        }
        else{
            if (s1.length() > s2.length()){

                int i = 0;
                int j = 0;
                while (sb1 != sb2){
                    sb1.deleteCharAt(i);
                    i++;
                    count++;

                    if(sb1.length() <= sb2.length()){
                        sb2.deleteCharAt(j);
                        j++;
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
