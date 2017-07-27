//simple input
import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;


/*FOR FAST INPUT*/
class Reader
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
	
	
class A{
	public static void main(String args[])throws IOException{
		Reader in=new Reader();
		int t=in.nextInt();
		
		while(t-->0){
		  int n=in.nextInt();
		  int m=in.nextInt();
		  int[][] arr=new int[n+1][m+1];
		  int max=-1;
		  for(int i=1;i<=n;i++){
			  for(int j=1;j<=m;j++){
				 arr[i][j]=in.nextInt();
				  if(arr[i][j]>max){
					 max=arr[i][j];
				 }
			  }
		  }
		  
		  //System.out.println(max);
		  int z=1;
		  int[] p=new int[(m+1)*(n+1)];
		  int[] q=new int[(m+1)*(n+1)];
		  for(int i=1;i<=n;i++){
			  for(int j=1;j<=m;j++){
				 if(arr[i][j]==max){
					p[z]=i;
                    q[z]=j;
					//System.out.println(p[i]+" g "+q[i]);
					z++;
				 }
			  }
		  }
		  
		  /*for(int i=1;i<z;i++){
			  System.out.println(p[i]+" "+q[i]); 
		  }*/
		  
		  
		  
		  int x=0;
		  int y=0;
		  ArrayList al=new ArrayList();
		  ArrayList al2=new ArrayList();
		  for(int i=1;i<=n;i++){
			  for(int j=1;j<=m;j++){
				 if(arr[i][j]<max){
					 //System.out.println(i+" under "+j);
					for(int k=1;k<z;k++){
				       x=Math.abs(i-p[k]);
					   y=Math.abs(j-q[k]);
					   //System.out.println(x+" upper "+y);
					   if(x>y){
						 al.add(x); 
					   }
					   else{
						  al.add(y); 
					   }
				    }
					//System.out.println(al);
					al2.add(Collections.min(al));
					//System.out.println(Collections.min(al)); 
					al.clear();
				 }
			  }
		  }	 
          if(al2.isEmpty()){
			 System.out.println("0"); 	 
		  }	
          else{		  
		  System.out.println(Collections.max(al2)); 	
		  }		  
		}
	}
}

	
	