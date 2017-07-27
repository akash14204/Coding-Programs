
//package april17;
 
/**
 *
 * @author ssaxena36 
 */
import java.io.*;
import java.util.*;
class SMARKET {
    int flag;
   //------------> Solution 
    void solve(){
     int t = inpi();
     while(t-- > 0)
     {
         flag = 0;
         String str = inps();
         int len = str.length();
         if(len == 1)
             out.println(0);
         else
         if(len % 2 != 0)
             out.println(-1);
         else
         {
             int x = Recursion(str, 0, len-1);
             if(flag == 0)
                 out.println(-1);
             else 
             out.println(x);
         }
     }
    }
    public int Recursion(String string, int l, int r)
    {
         if(l == r)
         {
             flag = 1;
             return 0;
         }
         boolean isSame = true;
         for(int i = l;i <= r - 1; i++)
             if(string.charAt(i) != string.charAt(i + 1))
             { 
                 isSame = !isSame;
                 break;
             }
         if(isSame) // all same return from here bitch
         {
             flag = 1;
            return 0; 
         }
         if(!isSame && (r + l + 1) % 2 == 0) // can check below 
             return 1 + Math.min(Recursion(string, l, ((l + r + 1) / 2) - 1), 
                     Recursion(string, (l + r + 1) / 2, r));
	else return 1; // present add one
    }
        class Node implements Comparable<Node>
	{
	int node, freq;
	public Node(int node, int freq)
        	{
		this.node = node;
		this.freq = freq;
		}
		@Override 
                public int compareTo(Node o)
		{
		if (freq == o.freq)
			return Integer.compare(o.node, node);
		return Integer.compare(o.freq, freq);
		}  
                 @Override
    public String toString() {
        return node + ":" + freq;
    }
	}
    //------------> Solution 
    InputStream obj;
    PrintWriter out;
    String check="";
    public static void main(String[] args)throws IOException{
        new SMARKET().main1();
    }
    void main1()throws IOException{
        out=new PrintWriter(System.out);
        obj=check.isEmpty() ? System.in : new ByteArrayInputStream(check.getBytes());
       solve();
        out.flush();
        out.close();
    }
    byte inbuffer[]=new byte[1024];
    int lenbuffer=0,ptrbuffer=0;
    int readByte(){
        if(lenbuffer==-1)
            throw new InputMismatchException();
        if(ptrbuffer>=lenbuffer)
        {
            ptrbuffer=0;
            try {
                lenbuffer=obj.read(inbuffer);
            } catch (IOException e) {
                throw new InputMismatchException();
            }
        }
        if(lenbuffer<=0)
            return -1;
        return inbuffer[ptrbuffer++];
    }
    boolean isSpaceChar(int c)
    {
        return (!(c>=33 && c<=126));
    }
    int skip()
    {
        int b;
        while((b=readByte())!=-1 && isSpaceChar(b));
        return b;
    }
    String inps()
    {
        int b=skip();
        StringBuilder sb=new StringBuilder();
        while(!(isSpaceChar(b)))
        {
            sb.appendCodePoint(b);
            b=readByte();
        }
        return sb.toString();
    }
    int inpi()
    {
        int num = 0, b;
        boolean minus = false;
        while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
        if(b == '-')
        {
            minus = true;
            b = readByte();
        }
        while(true)
        {
            if(b >= '0' && b <= '9')
            {
                num = num * 10 + (b - '0');
            }
            else
            {
                return minus ? -num : num;
            }
            b = readByte();
        }
    }
    long inpl()
    {
        long num = 0;
        int b;
        boolean minus = false;
        while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
        if(b == '-')
        {
            minus = true;
            b = readByte();
        }
        while(true)
        {
            if(b >= '0' && b <= '9')
            {
                num = num * 10 + (b - '0');
            }
            else
            {
                return minus ? -num : num;
            }
            b = readByte();
        }
    }
    float inpf()
    {
        return Float.parseFloat(inps());
    }
    double inpd()
    {
        return Double.parseDouble(inps());
    }
    char inpc()
    {
        return (char)skip();
    }
    int[] inpia(int n)
    {
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=inpi();
        return a;
    }
    long[] inpla(int n)
    {
        long a[]=new long[n];
        for(int i=0;i<n;i++)
            a[i]=inpl();
        return a;
    }
    String[] inpsa(int n)
    {
        String a[]=new String[n];
        for(int i=0;i<n;i++)
            a[i]=inps();
        return a;
    }
    double[][] inpdm(int n, int m)
    {
        double a[][]=new double[n][m];
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                a[i][j]=inpd();
        return a;
    }
    int[][] inpim(int n, int m)
    {
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                a[i][j]=inpi();
        return a;
    }  
} 

