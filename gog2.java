import java.util.Scanner;
import java.lang.Math;
class A{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		
		int t=in.nextInt();
		int i;
		
		while(t-->0){
			int r=in.nextInt();
			int n=in.nextInt();
			
			int[] rr=new int[r+1];
			int[] nn=new int[2*n+1];
			double[] mnn=new double[2*n+1];
			
			for(i=r-1;i>=0;i--){
				rr[i]=in.nextInt();
			}
			for(i=0;i<2*n;i++){
				nn[i]=in.nextInt();
			}
			
			int p=0;
			i=0;
			while(i<(2*n)-1){
				mnn[p]=Math.sqrt((nn[i]*nn[i])+(nn[i+1]*nn[i+1]));
				p++;
				i=i+2;
			}
			
			for(int j=0;j<n;j++){
				System.out.println(mnn[j]);
			}
			
			
			int f=0;
			int s=0;
			for(int j=0;j<r;j++){
				 i=s;
				while (i<n)
			       if(mnn[i]<rr[j]){
					   f=f+r;
					   System.out.println(i+" "+j+" "+f );
					   i++;
				   }
				   else{
					   r--;
					   s=i-1;
					   break;  
				   }	   
			    }


              System.out.println(f);				
			}
			
			
			
			
			
		}
	}
	