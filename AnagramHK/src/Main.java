import java.util.Scanner;

public class Main {

    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int q = scan.nextInt();

        while(q-- > 0){
            String str = scan.next();
            System.out.println(anagram(str));
        }
    }
    static int anagram(String str){

        int n = str.length() / 2;
        int count = 0;

        String word0 = str.substring(0,n);
        String word1 = str.substring(n);

        //System.out.println(word0+" "+word1);

        if (word0.length() != word1.length()){
            return -1;
        }
        else{
            int[] count1 = new int[26];
            int[] count2 = new int[26];

            char[] ch1 = word0.toCharArray();
            char[] ch2 = word1.toCharArray();

            for (int i = 0; i < word0.length(); i++){
                count1[ch1[i]-'a']++;
                count2[ch2[i]-'a']++;
            }
            for (int i = 0; i < 26; i++){

                if (count1[i] > count2[i]){
                    count += Math.abs(count1[i] - count2[i]);
                }
            }

            return count;
        }

    }
}
