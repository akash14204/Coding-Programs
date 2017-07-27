import java.util.Scanner;

import java.lang.*;

class atm{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N=sc.nextInt();

		int s1,s2,P1=0,P2=0,l,w=0,max=0;

		for(int i=1;i<=N;i++)

		{

			s1=sc.nextInt();

			s2=sc.nextInt();

			P1+=s1;

			P2+=s2;

			l=(int)Math.abs(P1-P2);

			if( l>max && P1>P2)

			{

				max=l;

				w=1;

			}

			else if( l>max && P2>P1)

			{

				max=l;

				w=2;

			}

		}
		System.out.println(w+" "+max);}
}