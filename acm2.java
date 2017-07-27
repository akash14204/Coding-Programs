import java.util.*;
import java.io.*;
class A{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int n=in.nextInt();
			long[] a=new long[n+1];
			
			for(int i=0;i<n;i++){
				 a[i]=in.nextLong();
			}
          int answer=0;
		  for(int i=0;i<n;i++){
			  if(a[i]==0||a[i]==1){
				  continue;
			  }
			  else{
				  answer++;
			  }
			  if(answer>=2){
				  break;
			  }
			  
		  }
		  
		  if(answer>=2){
			  System.out.println("No");
		  }
		  else{
			 System.out.println("Yes"); 
		  }
        }
	}
}	