import java.util.Scanner;
class A{
	public static void main(String args[]){
		int i;
		Scanner in=new Scanner(System.in);
		long[] a=new long[1000000];
		long[] p=new long[1000000];
		long[] q=new long[1000000];
		
		int t=in.nextInt();
		
		while(t-->0){
			
			int n=in.nextInt();
			for(i=0;i<=n-1;i++){
			  a[i]=in.nextLong();
			}
		
			int c=0;
			for(i=0;i<=n-2;i++){
				if(a[i]<=a[i+1]){
					p[c]=a[i];
					q[c]=a[i+1];
					c++;
				}
			}
			//System.out.println(c);
			/*for(i=0;i<c;i++){
			  System.out.println(p[i]);
			}
			for(i=0;i<c;i++){
			  System.out.println(q[i]);
			}*/
			
			int res=0;
			int x=0;;
			int s=0;
			int j=0;
			for(i=0;i<=c-1;i++){
				if(p[i+1]==q[i]){
					j++;
				}
				
				else{
					
					//System.out.println(j);
					
					x=j;
				     //System.out.println(x);
					s=s+((x*(x+1))/2);
					//System.out.println(s);
					j=0;
				}
			}
			
			
			res=n+c+s;
			System.out.println(res);
		
		}
		
		
	}
}