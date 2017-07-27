import java.util.*;
class A{
   public static void main(String args[]){
	   int i;
	   Scanner in =new Scanner(System.in);
	   int n=in.nextInt();
	   int c=in.nextInt();
	  
	  
	  int[] arr=new int[n+1];   
      for(i=0;i<n;i++){
	     arr[i]=in.nextInt();
      }
	  
	  if(n>1){
	  int[] diff=new int[n+1];
	  for(i=0;i<n-1;i++){ 
			diff[i]=arr[i+1]-arr[i];
      }
	  
	  
	  int z=0;
	  for(i=0;i<n-1;i++){ 
			if(diff[i]>c){
				z=i;
			}
      }
	  
	  
	  System.out.println(n-(z+1));
	  }
	 
   
   }
}