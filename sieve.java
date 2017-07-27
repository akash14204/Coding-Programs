// Program to print all prime factors
import java.io.*;
import java.lang.Math;
 
class A
{
    // A function to print all prime factors
    // of a given number n
    public static void primeFactors(int n,int[] arr )
    {
        // Print the number of 2s that divide n
        while (n%2==0)
        {
            System.out.print(2 +"a");
			arr[2]++;
            n /= 2;
        }
 
        // n must be odd at this point.  So we can
        // skip one element (Note i = i +2)
        for (int i = 3; i <= Math.sqrt(n); i+= 2)
        {
            // While i divides n, print i and divide n
            while (n%i == 0)
            {
				arr[i]++;
                System.out.print(i +"s");
                n /= i;
            }
        }
 
        // This condition is to handle the case whien
        // n is a prime number greater than 2
        if (n > 2){
			arr[n]++;
            System.out.print(n+"d");
		}
    }
 
    public static void main (String[] args)
    {
		int[] arr=new int[1001];
        int n = 64;
        primeFactors(n,arr);
		for(int i=0;i<2;i++){
			 System.out.print(arr[i]+" ");
		}
    }
}
