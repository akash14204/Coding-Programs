//simple input
import java.util.*;
class A{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		int[] a=new int[n];
		int[] b=new int[n];
		int[] p=new int[n];
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		for(int i=0;i<n;i++){
			b[i]=in.nextInt();
		}
		
		int mul=(-2)*(k);
		int mul1=(2)*(k);
		int max=0;
		int d=0;
		for(int i=0;i<n;i++){
			if(Math.abs(b[i])>=max){
				max=b[i];
				d=i;
			}
		}
		for(int i=0;i<n;i++){
			if(i==d){
				if(a[i]>0&& b[i]>0){
					p[i]=a[i]+mul;
				}
				else if(a[i]<0&& b[i]<0){
					p[i]=a[i]+mul1;
				}
				else if(a[i]>0&& b[i]<0){
					p[i]=a[i]+mul1;
				}
				else if(a[i]<0&& b[i]>0){
					p[i]=a[i]+mul;
				}
			}
			else{
				p[i]=a[i];
			}
		}
		
		int x=0;
		for(int i=0;i<n;i++){
			x=x+(p[i]*b[i]);
		}
		
		System.out.println(x);
	}
}	