import java.io.*;
import java.util.*;
import java.text.DecimalFormat;
class A{
    public static void main(String args[]) throws IOException{
		try{
        Scanner in=new Scanner(System.in);
		
			int n=in.nextInt();
			int x=in.nextInt();
			int[] p=new int[n+1];
			int z=1;
			int i=1;
			int t=0;
			int q=0,ll=3;
			
			
			
			
			
			
			
			
			
			
			int temp=i+1;
			
			for(int r=1;r<=n;r++){
				//System.out.println("asadsdaaaa");
			    int a=in.nextInt();
				
				//System.out.println(i+" "+t+" "+temp);
				
					if(a==-1){
					//System.out.println("asadsdaqqqqqqqq");
					System.out.println(p[i]+" "+t);
					i=ll;
					ll++;
					
					
					if(r%x==0){
					//System.out.println("asadsdatttttttttttt");
					q=temp;
					temp=i;
					i=q;
					//System.out.println(i+" "+t+" "+temp);
				   }
				   }
				
				
				
				
				else if(a%2!=0){
					//System.out.println("asadsdawwwwwwwww");
					p[i]=p[i]+a;
					//System.out.println(p[i]);
					q=temp;
					temp=i;
					i=q;
					t=t+a;
					//System.out.println(i+" "+t+" "+temp);
					
					if(r%x==0){
					//System.out.println("asadsdatttttttttttt");
					q=temp;
					temp=i;
					i=q;
					//System.out.println(i+" "+t+" "+temp);
				    }
				    }
					
					
					
					
				else if(a%2==0){
					
					//System.out.println("asadsdaeeeeeeeeeeeee");
					p[i]=p[i]+a;
					//System.out.println(p[i]);
					t=t+a;
					//System.out.println(i+" "+t+" "+temp);
					
					
					if(r%x==0){
					//System.out.println("asadsdatttttttttttt");
					q=temp;
					temp=i;
					i=q;
					//System.out.println(i+" "+t+" "+temp);
				    }
				    }
				
			}
			System.out.println(t);	
		}     
			 
		
catch(Exception ee)
{}	
	}
}	
			
			