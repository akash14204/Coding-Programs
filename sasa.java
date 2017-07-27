import java.util.Scanner;
class Abc1
{
public static void main(String[]args)
{
Scanner in= new Scanner(System.in);
int t,n,i,sum;
t=in.nextInt();
while(t>0)
{
boolean fail=false ,full=false;
double av;
sum=0;
n=in.nextInt();
for(i=0;i<n;i++)
{
int g=in.nextInt();
sum=sum+g;
if(g==5)
full=true;
if(g<=2)
fail=true;
}
av=(sum*1.0)/n;
if((av>=4)&&(fail!=true && full==true))
System.out.println("Yes");
else
System.out.println("No");
t=t-1;
}
}
}
