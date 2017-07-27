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
	
	
	
	
	public static void main(String args[])throws IOException{
		Reader in=new Reader();
		int t=in.nextInt();
		while(t-->0){
		  int n=in.nextInt();
		  int k=in.nextInt();
		  
		int flag=0;
		List<Set<Integer>> setList = new ArrayList<Set<Integer>>(); 
		  for(int i=0;i<n;i++){
			  Set<Integer> set = new HashSet<Integer>(); 
			   int l=in.nextInt();
			   for(int j=0;j<l;j++){
				   int num=in.nextInt();
				   set.add(num);
			   }
			   setList.add(i,set);
			  if(l==k){
				   flag=1;
			   }  
		  }
			 if(flag!=1){
			  int c=0;
			      Set<Integer> xset = new HashSet<Integer>();
				  Set<Integer> yset = new HashSet<Integer>();
				  
			 for(int i=0;i<n;i++){  
			  for(int j=i+1;j<n;j++){			  
				  (xset).addAll((setList.get(i)));
				  (yset).addAll((setList.get(j)));
				  if(xset.size()+yset.size()==k)	
				  (xset).addAll(yset);
				   if(xset.size()==k){
					   c++;
				   }
				   xset.clear();
				   yset.clear();
			   }
			 }
            System.out.println(c);
		  
		}
		else{
			System.out.println(n*((n-1)/2));
		}
		}
	}
}	
