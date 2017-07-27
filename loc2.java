import java.util.Scanner;
import java.lang.Math;
class A{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int   n=in.nextInt();
		int   b=in.nextInt();
		int  i;
		int [] ar=new int[b+1];
		int [] br=new int[b+1];
		
		for(i=1;i<=b;i++){
			ar[i]=in.nextInt ();
		}
		for(i=1;i<=b;i++){
			br[i]=in.nextInt ();
		}
		
		int   a1=1;
		int   a2=1;
		
		int   b1=1;
		int   b2=n;
		
		int   c1=n;
		int   c2=n;
		
		int   d1=n;
		int   d2=1;
		
		int  h=0;
		for(i=1;i<=b;i++){
			int  val1=Math.abs(a1-ar[i])+Math.abs(a2-br[i]);
			int  val2=Math.abs(b1-ar[i])+Math.abs(b2-br[i]);
			int  val3=Math.abs(c1-ar[i])+Math.abs(c2-br[i]);
			int  val4=Math.abs(d1-ar[i])+Math.abs(d2-br[i]);
			
			int  mm=val1;
			if(val2<mm)
				mm=val2;
			if(val3<mm)
				mm=val3;
			if(val4<mm)
				mm=val4;
			
			  //System.out.println(mm);
			  h=h+mm;
			
		}
		
			

		System.out.println(h);
		
		
	}
}	
		