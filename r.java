import java.util.Scanner;
class A{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0){
			int n=in.nextInt();
			int[] a=new int[n+1];
			int[] p=new int[n+1];
			
			for(int j=1;j<=n;j++){
			  a[j]=in.nextInt();
			}
			if(n!=1)
			{
			
			int c=0;
			for(int j=1;j<=n;j++){
				int o=0;
				int z=0;
				int i=j;
				while(i<=n){
		            int w=i;
					for(int k=1;k<=z;k++){
						if(i==p[k]){
							o++;
						}
					}
					
					if(o>=1){
						System.out.println("N");
						break;
					}
					else{
						 i=(i+a[i]+1)%n;
						if(i<=n){
							if(j==i){
								c++;
								System.out.println("A");
								break;
							}
							else{
								System.out.println("B");
								if(w!=j){
								p[z]=w;
								z++;
								System.out.println("p");
								}
							}
						}
						if(i>n){
							if(j==i){
								c++;
								System.out.println("C");
								break;
							}
							else{
								System.out.println("D");
								if(w!=j){
								p[z]=w;
								z++;
								}
							}
						}
						
					}
				}
				
			}
			
			System.out.println(c);
			}
			else{
				System.out.println(1);
			}
			
		}
	}
}