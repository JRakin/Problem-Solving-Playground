import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;


public class Main {

    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++){
            arr[i] = scan.nextInt();
        }
        scan.nextLine();

        int[] brr = Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.toString(brr));

        int[] array = Arrays.copyOfRange(arr, 2,arr.length);

        System.out.println(Arrays.toString(array));

        //map sorting
        Map<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("z", 10);
        unsortedMap.put("b", 5);
        unsortedMap.put("a", 6);
        unsortedMap.put("c", 20);
        unsortedMap.put("d", 1);
        unsortedMap.put("e", 7);
        unsortedMap.put("y", 8);
        unsortedMap.put("n", 99);
        unsortedMap.put("g", 50);
        unsortedMap.put("m", 2);
        unsortedMap.put("f", 9);

        Map<String,Integer> result = unsortedMap.entrySet().stream().sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(oldValue, newValue) -> oldValue,LinkedHashMap::new));

        result.entrySet().stream().map(entry -> entry.getValue() + " " + entry.getKey()).forEach(System.out::println);

        String str = scan.nextLine();
        System.out.println(hexToString(str));
        String string = scan.nextLine();
        System.out.println(stringToHex(string));

    }
    static String hexToString(String hex){

        StringBuilder sb1 = new StringBuilder();
        //StringBuilder sb2 = new StringBuilder();

        int j = 0;
        for (int i = 0; i < hex.length() - 1; i += 2){

            String sub = hex.substring(i, i+2);
            int decimal = Integer.parseInt(sub,16) - j;

            sb1.append((char) decimal);
            //sb2.append(decimal);

            j++;
        }
        //System.out.println(sb2.toString());

        return sb1.toString();
    }
    static String stringToHex(String string){

        char[] chars = string.toCharArray();
        StringBuilder hex = new StringBuilder();
        int j = 0;

        for (char aChar : chars) {
            hex.append(Integer.toHexString(((int) aChar) + j));
            j++;
        }
        return hex.toString();

    }
}
