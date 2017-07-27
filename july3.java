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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String args[])  throws IOException{
		Reader in=new Reader();
		int t=in.nextInt();
		
		while(t-->0){
		  int x=in.nextInt();
		  int y=in.nextInt();
		  int z=in.nextInt();
		 
		  long[] xrr=new long[x];
		  long[] yrr=new long[y];
		  long[] zrr=new long[z];
		    for(int i=0;i<x;i++){
			  xrr[i]=in.nextLong();
		    }
			for(int i=0;i<y;i++){
			  yrr[i]=in.nextLong();
		    }
			for(int i=0;i<z;i++){
			  zrr[i]=in.nextLong();
		    }
			
			Arrays.sort(xrr);
			Arrays.sort(yrr);
			Arrays.sort(zrr);
			boolean bolyx[][]=new boolean[y][x];
			for(int i=0;i<y;i++){
                for(int j=0;j<x;j++){
			      if(yrr[i]>=xrr[j]){
					  bolyx[i][j]=true;
				  }
				  else{
					  break;
				  }
		        }
		    }
		    boolean bolyz[][]=new boolean[y][z];
			for(int i=0;i<y;i++){
                for(int j=0;j<z;j++){
			      if(yrr[i]>=zrr[j]){
					  bolyz[i][j]=true;
				  }
				  else{
					  break;
				  }
		        }
		    }
			
			
			/*
			for(int i=0;i<y;i++){
                for(int j=0;j<x;j++){
			      System.out.print( bolyx[i][j]+" ");
		        }
				 System.out.println(" ");
		    }
			for(int i=0;i<y;i++){
                for(int j=0;j<z;j++){
			      System.out.print( bolyz[i][j]+" ");
		        }
				 System.out.println(" ");
		    }
			*/
			
			BigInteger c=BigInteger.valueOf(0);
			for(int i=0;i<y;i++){
                for(int j=0;j<x;j++){
					if(bolyx[i][j]==true){
						for(int k=0;k<z;k++){
					        if(bolyz[i][k]==true){
								BigInteger c1=BigInteger.valueOf(xrr[j]+yrr[i]);
								BigInteger c2=BigInteger.valueOf(zrr[k]+yrr[i]);
								c = c.add(c1.multiply(c2));
								System.out.println(c);
							}   
				            else{
					          break;
				            }             
		                }
					}		
				  else{
					  break;
				  }
		        }
		    }	
			System.out.println(c.mod(BigInteger.valueOf(1000000007)));		
		}
	}
}	