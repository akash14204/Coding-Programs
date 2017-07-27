import java.util.Scanner;
class A{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] arr=new int[n+1];
		int[] a=new int[n+1];
		int[] b=new int[n+10000];
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		for(int i=0;i<n;i++){
			a[i]=arr[i];
		}
//insertion sort
for(int i=1;i<n;i++)
{
int key =a[i];
int j=i-1;
while((j>=0)&&(key<a[j]))
{
a[j+1]=a[j];
j--;
}
a[j+1]=key;

}
        int l=0;
        for(int i=0;i<n;i++){
			if(a[i]!=a[i+1]){
				l++;
			}
		}

		
		int u=0;
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				int c=1;
				int p=arr[j];
				int pp=0;
				for(int k=i;k<j;k++){
					if(p==a[k]){
						pp=1;
						break;
					}
					
		          
				}
				if(pp==0){
						c++;
						
					}
				if(c==l){
					u++;
					System.out.println(i+" "+j);
				}
		    }
		}

		
		System.out.println(u);
		
		
		}
	}
