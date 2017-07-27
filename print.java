import java.util.Scanner;

class Billiards

{

public static void main(String[] args)

{

Scanner sc=new Scanner(System.in);

int t=sc.nextInt();

int a[]=new int[t+1];

int x[]=new int[t+1];

for(int i=1;i<=t;i++)

{

int p1=sc.nextInt();

int p2=sc.nextInt();

if(p1>p2)

{

a[i]=p1-p2;

x[i]=1;

}

else

{

a[i]=p2-p1;

x[i]=2;

}

}

int max=a[1],pos=1;

for(int i=1;i<=t;i++)

{

if(a[i]>max)

{

max=a[i];

pos=i;

}

}

System.out.println(x[pos]+" "+max);

}

}

