import java.util.*;
import java.io.*;

// @ Author swapnil raj srivastava
//code credit to swapnil Akash singh Sengar
class A
{
	long power(int b, int expression)
	{
    if(expression==1)
		return b;
    else
    {
        if(expression%2 == 0)
        {
            long rreturrnn = power(b, expression/2);
            long b1 = rreturrnn * rreturrnn;
            return b1 % 1000000007;
        }
        else
        {
            long rreturrnn = power(b, (expression-1)/2);
            long answer = b * rreturrnn;
            answer %= 1000000007; 
            answer *= rreturrnn;
            return answer % 1000000007;
        }
    }
}



public static void main(String args[]) throws IOException{
	try{
Scanner sc=new Scanner(System.in);
	A ob=new A();
int t=sc.nextInt();
while(t-->0){
	int n=sc.nextInt();
	if(n>2){
		long s=ob.power(2,n-1);
		System.out.println((s-2));
	}
	else{
		System.out.println("0");
	}
   }
}
catch(Exception ee)
{}
}
}