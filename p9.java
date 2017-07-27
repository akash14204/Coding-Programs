//tickets
 
import java.io.*;
import java.util.*;
class p22
{
public static void main(String args[])throws Exception
{
	
	Scanner sc=new Scanner(System.in);
	try
	{
	int n=sc.nextInt();
	int i=0,j=0;
	while(n!=0)
	{	i=0;
		String s=sc.next();
		int l=s.length();
		int flag=0;
		if(l==1)
		System.out.println("YES");
		else if(l==2)
		{
		if(s.charAt(i)==s.charAt(i+1))
		System.out.println("NO");
		else
		System.out.println("YES");
		}
		else if(l>2)
		{
		while((i+2)!=l)
		{
		if((i+1)!=l && s.charAt(i)==s.charAt(i+2)&& s.charAt(i)!=s.charAt(i+1))
		{
		flag=1;
		i++;
		}
		else
		{
		flag=0;
		break;
		}
		}
		
if(flag==1)
System.out.println("YES");
else
System.out.println("NO");
}
n--;
}
}
catch(Exception ee)
{}
}
}