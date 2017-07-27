import java.util.Scanner;
import java.math.*;
class A{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		
		while(t-->0){
		BigInteger k=new BigInteger("1");
		int n=in.nextInt();
		if(n>0){
			while(n>0){
				k=k.multiply(BigInteger.valueOf(n));
			    n--;
			}
			System.out.println(k);
		
    	}
		else  if(n==0){
			System.out.println(k);
		}
		}
	}
}