import java.util.Scanner;
class A{
	public static void main(String akash[]){
	int i,j,n,k,e,m,t,res;
	Scanner in=new Scanner(System.in);
	
	t=in.nextInt();
	while(t-->0){
		
		n=in.nextInt();
		int[] p=new int[n];
		k=in.nextInt();
		e=in.nextInt();
		m=in.nextInt();
		for(i=0;i<n-1;i++){
			int s=0;
			
				for(j=0;j<e;j++){
				s=s+(in.nextInt());
				}
				p[i]=s;	
		}
		int s=0;
				
				for(j=0;j<e-1;j++){
					s=s+(in.nextInt());
				}
			
		/*for(i=0;i<n;i++){
		System.out.println(p[i]);
		}*/
		j=0;
		for(i=1;i<n-1;i++){
			int key=p[i];
			 j=i-1;
			while((j>=0)&&(key<p[j])){
				p[j+1]=p[j];
				j--;
			}
			p[j+1]=key;
		}
		
		res=(p[n-k-1]-s)+1;
		
		if(res<=m&&res>0){
System.out.println(res);
		}
		else if(res<=0){
			System.out.println("0");
		}
else
System.out.println("Impossible");
}
	
    }	
  }
