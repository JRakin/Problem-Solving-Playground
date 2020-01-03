
/*
 * Copyright (c) 2018.
 * Rakin
 */
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class Solution {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int h = scan.nextInt();
        int m = scan.nextInt();
        System.out.println(time(h,m));

    }
    static String time(int h, int m){
        Dictionary<Integer,String> word = new Hashtable<Integer,String>();

        word.put(1,"one");
        word.put(2,"two");
        word.put(3,"three");
        word.put(4,"four");
        word.put(5,"five");
        word.put(6,"six");
        word.put(7,"seven");
        word.put(8,"eight");
        word.put(9,"nine");
        word.put(10,"ten");
        word.put(11,"eleven");
        word.put(12,"twelve");
        word.put(13,"thirteen");
        word.put(14,"fourteen");
        word.put(15,"fifteen");
        word.put(16,"sixteen");
        word.put(17,"seventeen");
        word.put(18,"eighteen");
        word.put(19,"nineteen");

        if(m == 0){
            return (word.get(h)+" o' clock");
        }

        if(m < 30){
            if(m > 1){
                if(m > 20){
                    return ("twenty "+word.get(m-20)+" minutes past "+word.get(h));
                }
                else if (m == 15){
                    return ("quarter past "+word.get(h));
                }
                else{
                    return (word.get(m)+" minutes past "+word.get(h));
                }
            }
            else{
                return (word.get(m)+" minute past "+word.get((h)%12));
            }
        }
        else if(m > 30){
            if(m == 45){
                return ("quarter to "+word.get((h+1)%12));
            }
            else if(60 - m < 20){
                return (word.get(60-m)+" minutes to "+word.get((h+1)%12));
            }
            else if(60 - m > 20){
                return ("twenty "+word.get(60-m-20)+" minutes to "+word.get((h+1)%12));
            }
            else {
                return ("twenty minutes to "+word.get((h+1)%12));
            }
        }
        else {
            return ("half past "+word.get(h));
        }
    }
}
