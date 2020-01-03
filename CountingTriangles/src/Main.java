import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input1 = br.readLine();
		int t = Integer.parseInt(input1);
		while(t-- > 0) {
			String input2 = br.readLine();
			long n = Long.parseLong(input2);
			long res = (n*(n+2)*(2*n+1))/8;
			System.out.println(res);
		}

	}

}
