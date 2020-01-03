import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		scan.close();
		System.out.println(maximumOnes(n));

	}
	public static int maximumOnes(int n) {
		char[] binary=Integer.toBinaryString(n).toCharArray();
		
		int maxCount=0;
		int tempCount=0;
		
		for(int I=0;I<binary.length;I++) {
			if(binary[I]=='0') {
				if(tempCount>maxCount) {
					maxCount=tempCount;
				}
				tempCount=0;
			}
			else {
				tempCount++;
			}
		}
		return (tempCount>maxCount) ? tempCount:maxCount;
	}

}
