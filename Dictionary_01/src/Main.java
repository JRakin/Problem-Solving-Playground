import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		Map<String,Integer> map=new HashMap<String,Integer>();
		
		for(int I=0;I<n;I++) {
			String name=scan.nextLine();
			int num1=scan.nextInt();
			map.put(name,num1);
		}
		scan.nextLine();
		while(scan.hasNext()) {
			String s=scan.nextLine();
			if(map.containsKey(s)) {
				System.out.println(s+"="+map.get(s));
			}
			else {
				System.out.println("Not Found");
			}
		}
		scan.close();
	}
}
