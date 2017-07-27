import java.util.LinkedList;
import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;
class A {
 
  public static void main(String[] args) throws IOException {
      Scanner in=new Scanner(System.in);
	  long x=in.nextLong();
	  int p=in.nextInt();
	  
	  
	   InputStreamReader ir = new InputStreamReader(System.in);
       BufferedReader br=new BufferedReader(ir);
	   String str[]=br.readLine().split(" ");
		 
		 
       LinkedList<String> lList = new LinkedList<String>();
     
       for(int i=0;i<str.length;i++){
		   lList.add(str[i]);
	   }
    
    
	lList.add(p, Long.toString(x));
	Iterator it= lList.iterator();
    while(it.hasNext()){
       System.out.print(it.next()+" ");
    }
  }
}
 
