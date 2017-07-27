import java.io.*;
import java.util.*;
import java.text.DecimalFormat;
class A{
    public static void main(String args[]) throws IOException{
		try{
        Scanner in=new Scanner(System.in);
		
			int n=in.nextInt();
			long[] a=new long[n];
			long[] temp=new long[n];
			
				for(int j=0;j<n;j++){
					a[j]=in.nextLong();
					temp[j]=a[j];
			    }
				
				Arrays.sort(temp);
				
				int c=0;
				for(int j=0;j<n;j++){
					if(a[j]!=temp[j]){
						c++;
					}
			    }
	    
		         if(c>0){
					 System.out.println("Angry");
				 }
				 else{
					 System.out.println("Happy"); 
				 }
				 
				 }	
catch(Exception ee)
{}	
	}
}	
			
			