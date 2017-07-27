//simple input
import java.util.*;
import java.io.*;
import java.math.*;
class A{
	
 public static void main(String args[])throws IOException{
		try{
		Scanner in=new Scanner(System.in);
		long t=in.nextLong();
		
		while(t-->0){
			
			long mg=in.nextLong();
			long my=in.nextLong();
			long mr=in.nextLong();
			
			long og=in.nextLong();
			long oy=in.nextLong();
			long or=in.nextLong();
			
			long pg=in.nextLong();
			long py=in.nextLong();
			long pr=in.nextLong();
			
		    ArrayList<BigInteger>	al=new ArrayList<BigInteger>();
			ArrayList<Long>	al2=new ArrayList<Long>();
			
			
			
			BigInteger a=BigInteger.valueOf(mg+my+mr); 
			BigInteger b=BigInteger.valueOf(og+oy+or); 
			BigInteger c=BigInteger.valueOf(pg+py+pr); 
			
			BigInteger d=BigInteger.valueOf(mg+og+pg); 
			BigInteger e=BigInteger.valueOf(my+oy+py); 
			BigInteger f=BigInteger.valueOf(mr+or+pr); 
			al.add(a);
			al.add(b);
			al.add(c);
			al.add(d);
			al.add(e);
			al.add(f);
			
			
			if((Collections.max(al))==BigInteger.valueOf(0)){
				System.out.println("0");
			}
			
			else if((Collections.max(al)).mod(BigInteger.valueOf(2))==BigInteger.valueOf(0)){
				System.out.println(Collections.max(al).subtract(BigInteger.valueOf(1)));
			}
			else{
			System.out.println(Collections.max(al));
			}
		  
		}
	}
		
catch(Exception ee)
{}
	}
}	


	