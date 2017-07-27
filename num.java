import java.util.Scanner;
class A{
	public static void main(String args[]){
		int i,j,t;
		
		Scanner in=new Scanner(System.in);
		t=in.nextInt();
		int[] a=new int[1000000];
		int[] p=new int[1000000];
		for(i=0;i<t;i++){
			a[i]=in.nextInt();
		}
		
for( i=1;i<t;i++)
{
int key =a[i];
j=i-1;
while((j>=0)&&(key<a[j]))
{
a[j+1]=a[j];
j--;
}
a[j+1]=key;

}


		for( i=0;i<t;i++)
{
	System.out.println(a[i]);
}

		
	}
}