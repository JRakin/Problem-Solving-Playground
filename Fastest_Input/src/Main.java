import java.util.*;
import java.io.*;

// Please name your class Main
class Main {
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
	public static void main (String[] args) throws java.lang.Exception {
	    FastReader in = new FastReader();
		long a = in.nextLong();
		long b = in.nextLong();
		long result = 0;
		long max = 0;
		
		for(long i = 1; i <= a; i++){
		    if(a%i == 0 && b%i == 0){
		        result = i;
		        
		        if(max < result){
		            max = result;
		        }
		    }
		}
		System.out.println(max);
	}
}
