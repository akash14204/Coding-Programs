import java.util.*;
import java.io.*;
import java.math.*;
 
	
	
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    public static void main(String args[]) throws IOException{
        Reader in=new Reader();
        int t=in.nextInt();
        while(t-->0){
		   long res=0;
           int n=in.nextInt();
           int m=in.nextInt();
		   
		   BigInteger[] arr=new BigInteger[n+1];
		   BigInteger [] a2=new BigInteger[n+1];
		   BigInteger [] a5=new BigInteger[n+1];
		   
		   
		   for(int i=1;i<=n;i++){
			   arr[i]=BigInteger.valueOf(in.nextLong());
		   }
		   
		   
		   for(int i=1;i<=m;i++){
			   
            int type=in.nextInt(); 
			int l=in.nextInt(); 
			int r=in.nextInt(); 
			
			//Type 1
			 if(type==1){
				long x=in.nextLong(); 
				for(int j=l;j<=r;j++){
			      arr[j]=arr[j].multiply(BigInteger.valueOf(x));
		        } 
			 }
			 
			 
			 //Type 2
			 else if(type==2){
				int q=1; 
				long y=in.nextLong(); 
				for(int k=l;k<=r;k++){
			      arr[k]=BigInteger.valueOf(q*y);
				  q++;
		        }	
			 }
			 
			 
			 //Type 3
			 else if(type==3){
				 int g=0;
				 int h=0;
				for(int o=l;o<=r;o++){
			      if(arr[o].mod(BigInteger.valueOf(2))==BigInteger.valueOf(0)){
					  a2[g]=arr[o];
					  g++;
				  }
				  if(arr[o].mod(BigInteger.valueOf(5))==BigInteger.valueOf(0)){
					  a5[h]=arr[o];
					  h++;
				  }
		        }
				/*for(int k=0;k<g;k++){
			      System.out.print(a2[k]);
		        }
				System.out.println("");
				for(int k=0;k<h;k++){
			      System.out.print(a5[k]);
		        }
				System.out.println("");
				*/
				
				
				long count1=0;
				long count2=0;
                for(int u=0;u<g;u++){
				  BigInteger w=a2[u];
			      while(w.mod(BigInteger.valueOf(2))==BigInteger.valueOf(0)){
					   count1++;
					   w=w.divide(BigInteger.valueOf(2));
				  }
		        }
				for(int u=0;u<h;u++){
				  BigInteger v=a5[u];
			      while(v.mod(BigInteger.valueOf(5))==BigInteger.valueOf(0)){
					   count2++;
					   v=v.divide(BigInteger.valueOf(5));
				  }
		        }
				//System.out.println(count1);
				//System.out.println(count2);
				
			    if(count1>=count2){
					res=res+count2;
				}
				else{
				    res=res+count1;
				}
				
			 }
		   }
           System.out.println(res);
			
        }
	}
}	