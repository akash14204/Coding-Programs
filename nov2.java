//simple input
import java.util.*;
import java.math.*;
import java.io.*;
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
	
	
	public static void main(String args[]) throws IOException{
		Reader in= new Reader();
		int t=in.nextInt();
		
		while(t-->0){
		  int n=in.nextInt();
		  int[][] a=new int[n+1][n+1];
		  
		  int p=1;
		  int q=n+1/2;
		  for(int i=1;i<=n;i++){
			  for(int j=1;j<=n;j++){
				  if(i+j==(n+3)/2 || i+j==(3*(n+1))/2){
					  if(q<1){
						  q=n;
					  }
					  else{
						  a[i][j]=1;
						  p++;
						  q--;
					  }
				  }
				   else{
	                 if(i+j<=(n+1)/2){
						 a[i][j]=i+j;
					 }
					 else if(i+j>(n+3)/2 && i+j<n+1){
						 a[i][j]=i+j-1;
					 }
					 else if(i+j==(n+1)){
						 a[i][j]=n;
					 }
					 else if(i+j>(n+1) && i+j<(3*(n+1))/2){
						 a[i][j]=i+j-n;
					 }
					 else if(i+j>(3*(n+1))/2 && i+j<=2*n){
						 a[i][j]=i+j-n-1;
					 }
                    }
			  }
		  }
		  
		 
		  
		
		 
		 
		 for(int i=1;i<=n;i++){
			  for(int j=1;j<=n;j++){
				  System.out.print(a[i][j]+" ");
			  }
			   System.out.println(" ");
		  }
		}
	}
}	