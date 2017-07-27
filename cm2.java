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
		 String sorted[]=new String[str.length];
		 for(int i=0;i<str.length;i++){
			  str[i] = str[i].replace(".", "");	  
     		  str[i]=str[i].toLowerCase();	 
			  //System.out.print(str[i]+" ");
		 }
		 
		 
		 
		  
		  for(int i=0;i<str.length;i++){
			  //System.out.print(str[i]+" ");
			  char[] chars = str[i].toCharArray();
              Arrays.sort(chars);
              sorted[i] = new String(chars);
			  //System.out.print(sorted[i]+" ");
		  }
		  //System.out.println(" ");
		  
		  String newone[]=new String[str.length];
		  LinkedHashSet <String> set = new LinkedHashSet <String>();
			  for(String arrayElement : sorted){
               LinkedHashSet <String> set_new = new LinkedHashSet <String>();			   
                   if(set.add(arrayElement)){
					 for(int j=0;j<sorted.length;j++){
				        if(arrayElement.equals(sorted[j])){	
						   set_new.add(str[j]);
                        }
			         }
                      if(set_new.size()>1){
						  Iterator it=set_new.iterator();
						  while(it.hasNext()){
							  System.out.print(it.next()+" ");
						  }
						  System.out.println(" ");
					  }					  
                  }
              }
		   
		  
		  
	
		 
	}
}
