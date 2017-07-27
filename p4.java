import java.util.*;
import java.util.stream.*;
class A{
   public static void main(String args[]){
	   int i;
	   Scanner in =new Scanner(System.in);	   
	   int n=in.nextInt();
	   int[] chef1=new int[n+1];
	   int[] chef=new int[n+1];
	   int[] p=new int[n+1];
	   int z=0;
	  for(i=0;i<n;i++){
	     chef1[i]=in.nextInt();
		 if(chef1[i]!=0){
			 chef[z]=chef1[i];
			 p[z]=2-chef[z];
		     z++;
		 } 
      }
	  
	 
	  int sum = IntStream.of(chef).sum();
	  double sum2 = IntStream.of(p).sum();
       // System.out.println(sum2);
	   if(sum<=2*(z)){
		   System.out.println(z);
	   }
	   else{
		   if(sum2>0){
			  //System.out.println(Math.floor(sum2/2));
			  int w=(int)((z)-Math.ceil(sum2/2));
			   System.out.println(w); 
			  // System.out.println("a");
		   }
		   else{
			   //System.out.println(Math.floor(3.0/2));
			   int w=(int)((z)+Math.ceil(-sum2/2));
			   System.out.println(w);
			   //System.out.println("b");
		   }
		   
	   }
	  	  
   }
}