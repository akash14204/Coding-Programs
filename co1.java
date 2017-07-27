import java.util.Scanner;
class A{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		
		int t=in.nextInt();
		
		
		while(t-->0){
			long n=in.nextLong();
			long b=in.nextLong();
			long m=in.nextLong();
			long z=0;
			long temp;
			while(n>0){
				if(n%2!=0){
					if(n!=1){
					temp=(n+1)/2;	
					z=z+temp*m+b;
					m=m*2;
					n=n-temp;
					}
					else if(n==1){
					temp=(n+1)/2;	
					z=z+temp*m;
					m=m*2;
					n=n-temp;
					}
				}
				else{
					temp=(n)/2;
					z=z+temp*m+b;
					m=m*2;
					n=n-temp;
				}
			}
			System.out.println(z);
			
		}
	}
}