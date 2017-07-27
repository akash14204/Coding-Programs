import java.util.Scanner;
class A{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int i,j;
		int t=in.nextInt();
		
			
		while(t-->0){
			int n=in.nextInt();
			int k=in.nextInt();
			int[] v=new int[n+2];
			int[] a=new int[n+2];
			int[] d=new int[n+2];
			int[] s=new int[n+2];
			for(i=1;i<=n;i++){
				 v[i]=in.nextInt();
			}
			
				for(i=1;i<=n;i++){
				int c=0;
				  for(j=1;j<=n;j++){
					  if(i==v[j]){
						  c++;
					  }
				    }
					a[i]=c;//show condidates votes
				}
				
				/*for(i=1;i<=n;i++){
					System.out.println(a[i]);
				}*/
				
				int z=1;
				for(i=1;i<=n;i++){
					  if(v[i]==i){
						  d[z]=i;//name who will disqualified
						  z++;//z-1 is number who will disqualified
					  }
				}
			    //System.out.println(z-1);
				
				
				int p=1;
				for(i=1;i<=n;i++){
					  if(a[i]>=k){
						  s[p]=i;//name who will win
						  p++;//p-1 is number who will win
					  }
				}
				
				/*for(i=1;i<=p-1;i++){
					System.out.println(s[i]);
				}*/
				
			    int res=0;
				for(i=1;i<=z-1;i++){
				  for(j=1;j<=p-1;j++){
					  if(s[j]==d[i]){
						 res++;//eliminate disq. and got right president number
					  }
				    }
				}
				System.out.println((p-1)-res);
			}
			
		}
    }
	