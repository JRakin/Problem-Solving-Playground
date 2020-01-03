import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scan.nextInt();
        int m = scan.nextInt();

        String[] magazine = new String[n];
        String[] note = new String[m];

        for (int i = 0; i < n; i++){
            magazine[i] = scan.next();
        }

        for (int i = 0; i < m; i++){
            note[i] = scan.next();
        }

        System.out.println(checkMagazine(magazine,note));
    }
    static String checkMagazine(String[] magazine, String[] note){

        boolean isPossible = true;

        Map<String, Integer> MagazineMap = new HashMap<>();
        Map<String, Integer> NoteMap = new HashMap<>();

        for (String s : magazine){
            if (MagazineMap.containsKey(s)){
                MagazineMap.put(s,MagazineMap.get(s)+1);
            }
            else {
                MagazineMap.put(s,1);
            }
        }
        for (String s: note){
            if (NoteMap.containsKey(s)){
                NoteMap.put(s,NoteMap.get(s)+1);
            }
            else {
                NoteMap.put(s,1);
            }
        }

        for (String s : NoteMap.keySet()){
            if (MagazineMap.containsKey(s)){
                if (!MagazineMap.get(s).equals(NoteMap.get(s))){
                    isPossible = false;
                    break;
                }
            }
            else {
                isPossible = false;
                break;
            }
        }

        if (isPossible){
            return "Yes";
        }
        else {
            return "No";
        }

    }
}
