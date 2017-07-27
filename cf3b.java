import java.util.*;
class A{
   public static void main(String args[]){
	   int i;
	   Scanner in =new Scanner(System.in);	   
	   String str=in.next();
	   char c;
	   int p=0;
	   int[] num=new int[str.length()];
	   if(str.length()<=26){
		   int k;
         for(c='A';c<='Z';c++){
			  k=0;
			 for(i=0;i<str.length();i++){
				 if(c==str.charAt(i)){
					 k++;
				 }
			 }
			 num[p]=k;
             p++;			 
		 }
		 for(i=0;i<p;i++){
		  if(num[i]>1){
			 System.out.println("-1");
		  }
		  
      	 }
	   }	   
   }
} 