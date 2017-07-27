//simple input
import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;
class A{
	public static void main(String args[]) throws IOException{
		InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
		
		// Scanner in=new Scanner(System.in);
	     String str[]=br.readLine().split(" ");
		 
		 ArrayList al=new ArrayList();
         for(int i=1;i<str.length-1;i++){
			 if(Integer.parseInt(str[i-1])+Integer.parseInt(str[i+1])==Integer.parseInt(str[i])){
				 al.add(Integer.parseInt(str[i]));
			 }
		 }
		Collections.sort(al); 
		Iterator it=al.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}
		
	}
}