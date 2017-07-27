import java.util.Scanner;
class A{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int i,j;
		int t=in.nextInt();
		while(t-->0){
			int n=in.nextInt();
			int k=in.nextInt();
			int[] arr=new int[n+2];
			int[] q=new int[n+2];
			int[] p=new int[n+2];
			int[] res=new int[n+2];
			for(i=1;i<=n;i++){
				 arr[i]=in.nextInt();
			}
			
			
			int z=1;
			
			for(i=1;i<=n;i++){
				int c=0;
				for(j=1;j<=n;j++){
					if(i==arr[j]){
						if(i==j){
						  p[z]=j;
						  z++;
						  c++;
						}
						else
						   p[z]=0;
						   z++;
						   c++;
					}						
			    }
				q[i]=c;		
			}
			for(j=1;j<=n;j++){
			System.out.println(q[j]);//provide array of winning of each
			}/*
			for(j=1;j<z;j++){
			System.out.println(p[j]);//provide who r disqaulified index
			}*/
			
			/*int x=0;
			int u=0;
			for(i=1;i<=n;i++){
				if(q[i]>k){
					for(j=1;i<=z;i++){
					if(i!=p[j]){
						u++;
					}
					}
				}
			}*/
			
			

		}
	}
}