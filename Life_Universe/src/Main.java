import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int N=scan.nextInt();

        int [] numArray=new int[N];

        for(int i=0;i<N;i++){
            numArray[i]=scan.nextInt();
        }
        scan.close();
        for(int k=0;k<N;k++){
        	if(numArray[k]==42) {
        		break;
        	}
            System.out.println(numArray[k]);
        }
    }
}