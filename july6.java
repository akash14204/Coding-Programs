//simple input
import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;
class A{
		/*FOR FAST INPUT*/
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
	
	
	 public static void primeFactors(int n,int[] arr )
    {
        // Print the number of 2s that divide n
        while (n%2==0)
        {
            //System.out.print(2 +"a");
			arr[2]++;
            n /= 2;
        }
 
        // n must be odd at this point.  So we can
        // skip one element (Note i = i +2)
        for (int i = 3; i <= Math.sqrt(n); i+= 2)
        {
            // While i divides n, print i and divide n
            while (n%i == 0)
            {
				arr[i]++;
                //System.out.print(i +"s");
                n /= i;
            }
        }
 
        // This condition is to handle the case whien
        // n is a prime number greater than 2
        if (n > 2){
			arr[n]++;
            //System.out.print(n+"d");
		}
    }
	
	
	public static void main(String args[]) throws IOException{
		Reader in=new Reader();
		int n=in.nextInt();
		int[] a=new int[n+1];
		for(int i=1;i<=n;i++){
		  a[i]=in.nextInt();
		}
		
		
		int q=in.nextInt();
		int[] q1=new int[q+1];
		int l=0,r=0,x=0,y=0;
		
		for(int k=0;k<q;k++){
		   l=in.nextInt();
		   r=in.nextInt();
		   x=in.nextInt();
		   y=in.nextInt();
          //q1[k]=fun(l,r,x,y,a);
		  int[] arr=new int[1000001];
		    for(int i=l;i<=r;i++){
		        primeFactors(a[i],arr);
		    }
			int c=0;
		    for(int j=x;j<=y;j++){
		      c+=arr[j];
		    }
			System.out.println(c);
		}
		
		
	}
	
	

	
}	
