import java.util.*;
class TurboSort
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int[] n=new int[t];
		for(int i=0;i<t;i++)
		{
			n[i]=sc.nextInt();
		}
		
		Arrays.sort(n);
		for(int i=0;i<t;i++)
		{
			System.out.println(n[i]);
		}
	}
}  