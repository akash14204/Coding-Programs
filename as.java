import java.util.*;
class Entrance
{
public static void main(String[]args)
{
Scanner in =new Scanner(System.in);
int t;
t=in.nextInt();
while(t-->0)
{
int n,k,e,m;
n=in.nextInt();
k=in.nextInt();
e=in.nextInt();
m=in.nextInt();
int a[]=new int[n-1];
//getting marks of each student in array a
for(int i=0;i<n-1;i++)
{
int s=0;
for(int j=1;j<=e;j++)
{
s=s+(in.nextInt());
}
a[i]=s;
}

int s=0;
for(int i=1;i<e;i++)
{
s=s+(in.nextInt());
}
//sorting the array using insertion sort
for(int i=1;i<n-1;i++)
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
/* System.out.print("After : ");
for(int i=0;i<n-1;i++)
System.out.print(a[i]+" ");
System.out.println("Result:");*/
//finding the kth lowest from end
int result=a[n-k-1]-s;
if(result<m)
System.out.println(result+1);
else
System.out.println("Impossible");
}
}
}