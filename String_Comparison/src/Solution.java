import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		int n=scan.nextInt();
		
		scan.close();
		
		System.out.println(getSmallestAndGreatest(str,n));

	}
	public static String getSmallestAndGreatest(String str,int n) {
		String smallest="";
		String greatest="";
		
		ArrayList<String> list=new ArrayList<String>();
		
        for(int i=0;i<=(str.length()-n);i++) {
		    list.add(str.substring(i, n+i));
		 }
       
        Collections.sort(list);
        
        smallest=list.get(0);
        greatest=list.get(list.size()-1);
		
		return smallest +"\n"+greatest;
	}
}
