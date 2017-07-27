//simple input
import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;
class A{
	
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		long[] a=new long[3];
		long[] p=new long[3];
		long[] Z=new long[2];
		for(int i=0;i<=2;i++){
			a[i]=in.nextLong();
			p[i]=a[i];
		}
		
		Arrays.sort(p);
		//System.out.println(p[0]);
		ArrayList<Long> al=new ArrayList<Long>();
		for(int i=0;i<=2;i++){
			a[i]=a[i]-p[0];
			if(a[i]!=0){
				al.add(a[i]);
			}
		}
		long q=0;
		long s=0;
		if(al.size()==2){
			
			long min = al.get(0);
            long max = al.get(0);

             for(long i: al) {
               if(i < min) min = i;
               if(i > max) max = i;
            }
			//System.out.println(min);
			//System.out.println(max);
			
			q=min;
			if(max-min%2==0){
				s=max-min/2;
				System.out.println("u");
			}
			else{
				//System.out.println("v");
				s=(max-min+1)/2;
				//System.out.println(s);
			}
			//System.out.println(p[0]);
			//System.out.println(q);
			//System.out.println(s);
			System.out.println(s+q+p[0]);
		}
		else if(al.size()==1){
			System.out.println(al.get(0)+p[0]);
		}
		else{
			System.out.println(p[0]);
		}
		
		
		
		
	}
}	