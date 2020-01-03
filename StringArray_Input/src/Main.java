import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int Num=scan.nextInt();
		ArrayList<String> strList=new ArrayList<>();
		
		String[] str=new String[Num];
		String[] str1= {"int"};
		
		for(int I=0;I<Num;I++) {
			str[I]=scan.next();
		}
		scan.close();
		for(int K=0;K<Num;K++) {
			System.out.println("Index "+K+" "+str[K]);
		}
		for(int M=0;M<str1.length;M++) {
			if(str[M].equals(str1[M])) {
				strList.add(str[M]);
			}
		}
		Iterator itr=strList.iterator();
		while(itr.hasNext()) {
			System.out.println(strList);
		}
	}

}
