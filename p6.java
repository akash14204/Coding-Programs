import java.util.Scanner;
class A{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		
		int t=in.nextInt();
		
		
		while(t-->0){
			int n=in.nextInt();
			
			long[] a=new long[n+1];
			
			for(int i=0;i<n;i++){
				a[i]=in.nextInt();
			}
			
			int i=0;
			int z=0;
			while(i<n){
				if(i<n-1){
				if(a[i]!=a[i+1]){
					i=i+2;
					z++;
				}
				else{
					i++;
					z++;
				}
			}
			else{
				z++;
				i++;
			}
			}
			
			
			System.out.println(z);
	    }
	}
}	