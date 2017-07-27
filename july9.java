//simple input
import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;
class A{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		BigDecimal ten=new BigDecimal("2.71828182845904523536028747135266249775724709369995957496696762772407663035354759457138217852516642742746639193");
		BigDecimal ten1=in.nextBigDecimal();
		
		BigDecimal ans=BigDecimal.ONE;
		BigDecimal ans1=BigDecimal.ZERO;
		
		
		for(BigDecimal i=BigDecimal.ONE; i.compareTo(ten1)<=0; i=i.add(BigDecimal.ONE)){
		   BigDecimal p=(ten.multiply(i)).setScale(0, RoundingMode.FLOOR);
		   ans1 =ans1.add(p);
		}
        System.out.println(ans1);		
	}
}	