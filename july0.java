//simple input
import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;
class A{
	 static class Reader
    {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;

        public Reader()
        {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public Reader(String file_name) throws IOException
        {
            din = new DataInputStream(new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public String readLine() throws IOException
        {
            byte[] buf = new byte[64]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1)
            {
                if (c == '\n')
                    break;
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
        }

        public int nextInt() throws IOException
        {
            int ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do
            {
                ret = ret * 10 + c - '0';
            }  while ((c = read()) >= '0' && c <= '9');

            if (neg)
                return -ret;
            return ret;
        }

        public long nextLong() throws IOException
        {
            long ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }

        public double nextDouble() throws IOException
        {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();

            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');

            if (c == '.')
            {
                while ((c = read()) >= '0' && c <= '9')
                {
                    ret += (c - '0') / (div *= 10);
                }
            }

            if (neg)
                return -ret;
            return ret;
        }

        private void fillBuffer() throws IOException
        {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }

        private byte read() throws IOException
        {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }

        public void close() throws IOException
        {
            if (din == null)
                return;
            din.close();
        }
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//for prefix sum
	static void fillPrefixSum(int arr[], int n, long prefixSum[]){
         prefixSum[1] = arr[1];
         for( int i = 1; i <= n; ++i ) prefixSum[i] = prefixSum[i-1] + arr[i];
	}
		
	// Returns index of x if it is present in arr[], else
    // return -1
    int binarySearch(int arr[], int x){
        int l = 0, r = arr.length - 1;
        while (l <= r){
            int m = l + (r-l)/2;
             // Check if x is present at mid
            if (arr[m] == x)
                return m;
             // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1; 
            // If x is smaller, ignore right half
            else
                r = m - 1;
        }
        // if we reach here, then element was not present
        return l-1;
    }	
		
		
	public static void main(String args[]) throws IOException{
		Reader in=new Reader();
		int t=in.nextInt();
		while(t-->0){
		  int p=in.nextInt();
		  int q=in.nextInt();
          int r=in.nextInt();	
          
		  int[] parr=new int[p+1]; for(int i=1;i<=p;i++){ parr[i]=in.nextInt();}
		  int[] qarr=new int[q+1]; for(int i=1;i<=q;i++){ qarr[i]=in.nextInt();}
		  int[] rarr=new int[r+1]; for(int i=1;i<=r;i++){ rarr[i]=in.nextInt();}
		  Arrays.sort(parr);               
		  Arrays.sort(rarr); 
		  //for(int i=1;i<=p;i++){System.out.print(parr[i]+" ");} System.out.println(" ");                         
		  //for(int i=1;i<=q;i++){System.out.print(qarr[i]+" ");} System.out.println(" ");                          
		  //for(int i=1;i<=r;i++){System.out.print(rarr[i]+" ");} System.out.println(" ");                          
                                 
          long[] parr2=new long[p+1]; fillPrefixSum(parr, p, parr2);
		  long[] rarr2=new long[r+1]; fillPrefixSum(rarr, r, rarr2);
		  //for(int i=1;i<=p;i++){System.out.print(parr2[i]+" ");} System.out.println(" ");                         
		  //for(int i=1;i<=q;i++){System.out.print(qarr[i]+" ");} System.out.println(" ");                          
		  //for(int i=1;i<=r;i++){System.out.print(rarr2[i]+" ");} System.out.println(" "); 
		  
		  
	A ob = new A();
    BigInteger c=BigInteger.valueOf(0);
	for(int i=1;i<=q;i++){
	BigInteger t1=BigInteger.valueOf(0);
	BigInteger t2=BigInteger.valueOf(0);
	
	BigInteger t3=BigInteger.valueOf(0);
	BigInteger t4=BigInteger.valueOf(0);
	
		long ans1=0,ans2=0;
//..........................................................................................	
	    int result = ob.binarySearch(parr, qarr[i]);
		int res1=result;
		//System.out.println(result);
		if(parr[p]<qarr[i]){res1=p; /*System.out.println("res1 "+res1);*/}
		else if(parr[1]>qarr[i]){res1=0; /*System.out.println("res1 "+res1);*/}
		else{
			for(int j=result;j<=p;j++){
			        if(qarr[i]==parr[j]){res1=j;  continue;} else break;
		    }
			//System.out.println("res1 "+res1);
		}
//..........................................................................................	
	 int result1 = ob.binarySearch(rarr, qarr[i]);
		int res2=result1;
		if(rarr[r]<qarr[i]){res2=r; /*System.out.println("res2 "+res2);*/}
		else if(rarr[1]>qarr[i]) {res2=0; /*System.out.println("res2 "+res2);*/}
		else{
			for(int j=result1;j<=r;j++){
			        if(qarr[i]==rarr[j]){res2=j;  continue;} else break;
		    }
			//System.out.println("res2 "+res2);
		}
		
		
		t1=BigInteger.valueOf(qarr[i]);
		t2=t1.multiply(BigInteger.valueOf(res1));
		BigInteger big1=t2.add(BigInteger.valueOf(parr2[res1]));
		//ans1=((t2)+parr2[res1]);
		t3=BigInteger.valueOf(qarr[i]);
		t4=t3.multiply(BigInteger.valueOf(res2));
		BigInteger big2=t4.add(BigInteger.valueOf(rarr2[res2]));
		//ans2=((res2*qarr[i])+rarr2[res2]);
		//System.out.println(res1+" "+res2);
		//System.out.println(big1+" and "+big2);
		//System.out.println(ans1+" "+ans2);
		//BigInteger big1=BigInteger.valueOf(ans1);
		//BigInteger big2=BigInteger.valueOf(ans2);
		
		 c = c.add((big1).multiply(big2));
		 //System.out.println(c);
	}
    System.out.println(c.mod(BigInteger.valueOf(1000000007)));
		  
		  
		  
		  
		  
		  
		}
	}
}	