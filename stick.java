import java.util.Scanner;
class A{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		
		while(t-->0){
			int i,j;
			int n=in.nextInt();
			int[] a=new int[n+1];
			int[] p=new int[n+1];
			int[] q=new int[n+1];
			
			for(i=0;i<n;i++){
				a[i]=in.nextInt();
			}
			
			for(i=1;i<n;i++){
				int key=a[i];
				j=i-1;
				while(j>=0&&key<a[j]){
					a[j+1]=a[j];
					j--;
				}
				a[j+1]=key;
			}		
			/*for(i=0;i<n;i++){
				System.out.println(a[i]);
			}*/
			
			int z=0;
			int c=1;
			for(i=0;i<n;i++){
				if(a[i]==a[i+1]){
					c++;
				}
				else if(c>=2){
					p[z]=a[i];
					q[z]=c;
					z++;
					c=1;
				}
			}
			
			if((z==1&&q[0]>=4)||(z>1)){
			/*for(i=0;i<z;i++){
				System.out.println(p[i]);
				System.out.println(q[i]);
			}*/
			long res=0;
				if(q[z-1]>=4){
					res=(p[z-1])*(p[z-1]);
				}
				else{
					res=(p[z-1])*(p[z-2]);
			    }
			System.out.println(res);
			}
			else{
				System.out.println(-1);
			}
		}
	}
}