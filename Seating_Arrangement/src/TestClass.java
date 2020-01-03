import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++) {
			int seat=scan.nextInt();
			switch(seat%12) {
			case 0:
				System.out.println((seat-11)+" WS");
				break;
			case 1:
				System.out.println((seat+11)+" WS");
				break;
			case 2:
				System.out.println((seat+9)+" MS");
				break;
			case 3:
				System.out.println((seat+8)+" AS");
				break;
			case 4:
				System.out.println((seat+5)+" AS");
				break;
			case 5:
				System.out.println((seat+3)+" MS");
				break;
			case 6:
				System.out.println((seat+1)+" WS");
				break;
			case 7:
				System.out.println((seat-1)+" WS");
				break;
			case 8:
				System.out.println((seat-3)+" MS");
				break;
			case 9:
				System.out.println((seat-5)+" AS");
				break;
			case 10:
				System.out.println((seat-7)+" AS");
				break;
			case 11:
				System.out.println((seat-9)+" MS");
				break;
			}
		}
		scan.close();

	}

}
