//simple input
import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;
class A{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		int[] a=new int[n];
		while(t-->0){
		  
		}
	}
}	

//arraylist
Object obj = Collections.min(arrayList);
System.out.println(Long.MAX_VALUE);		
		
		
		
//buffer input
import java.util.*;
import java.io.*;
class A{
	public static void main(String args[]) throws IOException{
		InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
		int t=Integer.parseInt(br.readLine());
		
		// Scanner in=new Scanner(System.in);
		
	   while(t-->0){
		
	   }
	}
}
//FINISH









///WHEN TAKE 2 OR 3 INPUTS(char,strings,integers) IN A LINE AND STORE THEM IN ARRAY 
//BUFFER APPROCH....................
import java.util.*;
import java.io.*;
import java.text.DecimalFormat;
class A{
    public static void main(String args[])throws IOException{
		
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
		
		
        int t=Integer.parseInt(br.readLine());
		
		while(t-->0){
		  String str[]=br.readLine().split(" ");
		  int m=Integer.parseInt(str[0]);
		  int n=Integer.parseInt(str[1]);
		  /*String str1[]=br.readLine().split(" ");
		  int j=Integer.parseInt(str1[0]);
		  int k=Integer.parseInt(str1[1]);*/
		  
		  
		  /*int[] l1=new int[n+1];
		  int[] o1=new int[n+1];
		  String[] st1=new String[n+1];*/
		  
		  
		  for(int i=0;i<n;i++){
		  String str2[]=br.readLine().split(" ");
		  int l=Integer.parseInt(str2[0]);
		  //l1[i]=l;
		  int o=Integer.parseInt(str2[1]);
		  //o1[i]=o;
		  String st=str2[2];
		  //st1[i]=st;
		  }
		
		}      
    }
}



//SCANNER APPROCH
import java.util.*;
import java.io.*;
class A{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		
	   while(t-->0){
		int n=in.nextInt();
		String[] s1=new String[n+1];
		String[] s2=new String[n+1];
		int[] a=new int[n+1];

		
		
		for(int i=0;i<n;i++){
		  a[i]=in.nextInt();
		  s2[i]=in.next();
		  s2[i]=in.next();
		}
		
		
		  System.out.println(s2[0]);
		
	   }
	}
}


//FINISH
	

















//for change in to character
String original = "edcba";
char[] chars = original.toCharArray();
//FOR SORTED String
import java.util.*;
public static void main(String[] args){
		String original = "edcba";
        char[] chars = original.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        System.out.println(sorted);
    }





//for converting double until n decimal point
import java.text.DecimalFormat;
double p;
DecimalFormat num= new DecimalFormat("#.000000");
System.out.println(num.format(p));



//split general number
String st[]=br.readLine().split(" ");
			int n=Integer.parseInt(st[0]);
			int k=Integer.parseInt(st[1]);
//split array
String str[]=br.readLine().split(" ");//used for spliting :)
			for(i=0;i<n;i++){	
				a[i]=Integer.parseInt(str[i]);
			}			
			
			
//change/update character in any string
String str=in.nextInt();
StringBuilder myName = new StringBuilder(str);
 myName.setCharAt(i,'a');

 
 
 
 
 
 
 
 
 
 //find number of elements without duplicate
 //ex 1 2 2 4 4  ans:3
 //having array list
 List<Integer> list = new ArrayList<Integer>();
 //store number in list
 int[] a=new int[n+1];
			 for(int i=0;i<n;i++){
	            a[i]=in.nextInt();
				list.add(a[i]);
			 }
 //pass list to Set
 Set<Integer> uniqueSet = new HashSet<Integer>(list);
//find size
System.out.println(uniqueSet.size());
 
 
 
 
 
 
 
 
 
 
 
 //VALUE AND FREQUENCY using MAP
 import java.util.*;
 class A {
  public static void main(String[] args) {

int[] a = { 1, 2, 3, 4, 5, 6, 1, 1, 7, 7 };
Map<Integer, Integer> map = new HashMap<Integer, Integer>();
for (int i : a) {
Integer count = map.get(i);
map.put(i, count != null ? count + 1 : 1);
}
int z=0;
int[] fre=new int[15];
int[] val=new int[15];
for (int key: map.keySet()) {
	
		fre[z]=map.get(key);
		val[z]=key;
	z++;
}
int i;
for(i=0;i<z;i++){
	System.out.println(val[i]+" "+fre[i]);
}
  }
}
///IMPORTANT 
/*  :D
eye on the length of a array should be same as it have value in aaray
or put this condition
for (int key: map.keySet()) {
	if(key!=0){
		fre[d]=map.get(key);
		val[d]=key;
	
		//System.out.println(val[d]+" "+fre[d]);
	d++;
	}
}
*/
 
 
 
 
 	
	
//sorting of 2d array with map
import java.util.*;
class A{

    public static void main(String[] args) {

        Map<Integer, String> unsortMap = new HashMap<Integer, String>();
        unsortMap.put(10, "z");
        unsortMap.put(5, "b");
        unsortMap.put(6, "a");
        unsortMap.put(20, "c");
        unsortMap.put(1, "d");
        unsortMap.put(7, "e");
        unsortMap.put(8, "y");
        unsortMap.put(99, "n");
        unsortMap.put(50, "j");
        unsortMap.put(2, "m");
        unsortMap.put(9, "f");

        System.out.println("Unsort Map......");
        printMap(unsortMap);
		
        String st=unsortMap.get(2);
		for(int key : unsortMap.keySet()){
			 System.out.println("Key : " + key + " Value : " + unsortMap.get(key));
		}
		//It will remove both key and value
		//unsortMap.remove(99);
		//unsortMap.size();
        System.out.println("\nSorted Map......By Key");
		///TreeMap is used for sorting and comparter is used it to print in non-increasing order
        Map<Integer, String> treeMap = new TreeMap<Integer, String>(
                new Comparator<Integer>() {

                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o2.compareTo(o1);
                    }

                });

	   
        treeMap.putAll(unsortMap);
        for(int key : treeMap.keySet()){
			 System.out.println("Key : " + key + " Value : " + treeMap.get(key));
		}

    }

}
//finish	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
 
 
 
 
 
 
 //Concatenae and concatenate n times and buffere reader use and convrsion binary to decimal
  public static void main(String args[])throws IOException{
		try{
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        int t=Integer.parseInt(br.readLine());
		while(t-->0){
		String st[]=br.readLine().split(" ");
		
		String l1=st[0];
		String l2=st[1];
		String l3=st[2];
		int n=Integer.parseInt(st[3]);	
        String l22=l2;
		for(int i=1;i<n;i++){
			l22=l22+l2;
		}
	    String res=l1+l22+l3;
		long dv=Integer.parseInt(res,2);
		}
		}
		catch(Exception ee){}
  }		
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 

	
	
	
	
	
	
	
	
	
	
//BigInteger
import java.util.*;
import java.io.*;
import java.math.*;
class A{
    public static void main(String args[]) throws IOException{
		Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
           int n=in.nextInt();
		   
		   ///BigInteger Array................................
		   BigInteger[] arr=new BigInteger[n+1];
		   
		   //Puting values into Array.........................
		   for(int i=1;i<=n;i++){
			   arr[i]=BigInteger.valueOf(in.nextLong());
		   }
		   //taking value in biginteger.................
		   BigInteger w= new BigInteger("1000000000000000000000");
		   
		   ///Conversion of normal Integer to BigInetger.......
		   BigInteger q=BigInteger.valueOf(0);
		   
		   
		   //multiply bigInteger with normal values...........
		   long x=in.nextLong(); 
		   arr[j]=arr[j].multiply(BigInteger.valueOf(x));
		   
		   ///modulus of BigInteger............................
		   BigInteger p=arr[o].mod(BigInteger.valueOf(2)); 
		   
		    // perform modPow operation on bi1 using bi2 and exp
	        BigInetger bi3 = bi1.modPow(exponent, bi2);
			String str = bi1 + "^" +exponent+ " mod " + bi2 + " is " +bi3;
		   
        }
	}
}	
	
	
	
	
	
	
	
	
	
	
	

//insertion sort

for( i=1;i<t;i++)
{
int key =a[i];
j=i-1;
while((j>=0)&&(key<a[j]))
{
a[j+1]=a[j];
j--;
}
a[j+1]=key;

}




		
			
//merge sort class MergeSort 

    /* Merge Sort function */
    public static void sort(int[] a, int low, int high) 
    {
        int N = high - low;         
        if (N <= 1) 
            return; 
        int mid = low + N/2; 
        // recursively sort 
        sort(a, low, mid); 
        sort(a, mid, high); 
        // merge two sorted subarrays
        int[] temp = new int[N];
        int i = low, j = mid;
        for (int k = 0; k < N; k++) 
        {
            if (i == mid)  
                temp[k] = a[j++];
            else if (j == high) 
                temp[k] = a[i++];
            else if (a[j]<a[i]) 
                temp[k] = a[j++];
            else 
                temp[k] = a[i++];
        }    
        for (int k = 0; k < N; k++) 
            a[low + k] = temp[k];         
    }
    /* Main method */
    public static void main(String[] args) 
    {
       //array
       /* for (i = 0; i < n; i++){
            arr[i] = scan.nextInt();	
		}*/
		
		
        /* Call method sort */
        sort(arr, 0, n);	
	}




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
        Reader in=new Reader();
        int t=in.nextInt();

	}
	//FINISH






	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	