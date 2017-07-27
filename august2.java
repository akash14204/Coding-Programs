import java.util.Scanner;
class A{
	public static void main(String args[]){
	int i,j,t,l,n;
	int[] a=new int[1000];
	Scanner in=new Scanner(System.in);
	t=in.nextInt();
	while(t-->0){
		int s=0;
		n=in.nextInt();
		for(i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		for(i=0;i<n;i++){
			l=i;
			for(j=0;j<n;j++){
				l=(l+a[l]+1)%n;
				if(l==i){
					s++;
					break;
				}
			}
			
	}
	System.out.println(s);
   }
 }
}