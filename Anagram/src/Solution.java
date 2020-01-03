import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		String s1=scan.next();
		scan.nextLine();
		String s2=scan.next();
		scan.close();
		
		boolean ret=isAnagram(s1,s2);
		
		System.out.println(ret ? "Anagram":"Not Anagram");

	}
	static boolean isAnagram(String s1,String s2) {
		if(s1.length()!=s2.length()) {
			return false;
		}
		
		char[] ch1=s1.toLowerCase().toCharArray();
		char[] ch2=s2.toLowerCase().toCharArray();
		
		BubbleSort bubble=new BubbleSort();
		
		bubble.sorting(ch1);
		bubble.sorting(ch2);
		
		boolean anagram=true;
		
		for(int I=0; I<ch1.length; I++) {
			
			if(ch1[I]!=ch2[I]) {
				anagram=false;
			}
		}
		return anagram;
	}

}
