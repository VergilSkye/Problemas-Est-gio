import java.awt.List;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
import java.util.ArrayList; 
import java.util.StringTokenizer; 

public class Capsula {
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
  
    public static void main(String[] args) 
    { 
        FastReader s=new FastReader(); 
        int n = s.nextInt(); 
        int f = s.nextInt(); 
        ArrayList<Integer> moedas = new ArrayList<Integer>(); 
        for(int i=0; i<n; i++) {
        	moedas.add(s.nextInt());
        }
        int menor = 1;
        int maior = 1000000000;
        int media = 0;
        while(menor<maior) {
        	media = (menor+maior)/2;
        	if(total(moedas,media)>=f) {
        		maior = media;
        	}else {
        		menor = media+1;
        	}
        }
        while(total(moedas, menor-1)>=f) {
        	--menor;
        }
        
        System.out.println(menor);
       
        
    }

	private static int total(ArrayList<Integer> moedas, int dias) {
		int total = 0;
		for(Integer e: moedas) {
			total += dias/e;
		}
		return total;
	} 

}
