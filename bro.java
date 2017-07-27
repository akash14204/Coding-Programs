import java.util.*;
class Entrrance
{
public static void main(String[]args)
{
Scanner in =new Scanner(System.in);
int t;
t=in.nextint();
while(t-->0)
{
int n,s=0;
n=in.nextint();
int a[]=new int[n];



//getting marks of each student in array a
for(int i=0;i<n;i++)
{
a[i]=(in.nextint());
s=s+a[i];
}


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

for(i=0;i<=n;i++){
				System.out.println(a[i]);
			}
}
}
}