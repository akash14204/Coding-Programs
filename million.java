import java.util.Scanner;

class A{
	public static void main(String args[]){
	 	int c;
		long max;
		
			
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		
		while(t-->0){
			c=0;
			int n=in.nextInt();
			
			String str1=in.next();		
			String str2=in.next();
			long[] res=new long[n+1];
			
			max=res[0];	
			for(int i=0;i<=n;i++){
			res[i]=in.nextLong();
			}
				
			for(int i=0;i<n;i++){
				if(str1.charAt(i)==str2.charAt(i)){
					c++;
				}
			}
			
			if(c==n){
				max=res[n];
			}
			else
				
			for(int i=0;i<=c;i++){
				if(max<res[i]){ 
				 max=res[i];			
				}				
			}
			System.out.println(max);
			
		}
	}
}