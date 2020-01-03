import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Rakin
 *
 * Jul 30, 2019
 */
public class Main {
	
	static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
	public static void main(String[] args) throws IOException {
		
		FastReader scan = new FastReader();
		int t = scan.nextInt();
		
		while(t-- > 0) {
			long n = scan.nextLong();
			System.out.println(eularTotient(n));
		}

	}
	static long eularTotient(long n) {
		
		long result = n;
		
		for(int i = 2; i*i <= n; i++) {
			if(n%i == 0) {
				while(n%i == 0) {
					n /= i;
				}
				result -= result/i;
			}
		}
		if(n > 1) {
			result -= result/n;
		}
		
		return result;
	}

}
