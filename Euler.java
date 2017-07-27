import java.math.*;
import java.util.*;
class Euler
{
	static BigDecimal sum=BigDecimal.ZERO;
public static void main(String[] args)throws Exception
{
Scanner sc=new Scanner(System.in);
String s=sc.next();
BigInteger a=new BigInteger(s);
BigDecimal n=BigDecimal.valueOf(a.longValue());
BigDecimal e=BigDecimal.valueOf(2.71828);
BigDecimal result=floor(n,e);
System.out.println(result.toBigInteger());
}

public static BigDecimal floor(BigDecimal x,BigDecimal alpha) //x=n'
{
	BigDecimal b;
	//System.out.println(alpha);
	//System.out.println(x);
if(x.compareTo(BigDecimal.ZERO)==0)
	return sum;
else
{
	if(alpha.compareTo(BigDecimal.valueOf(2))>=0)
	{
		b=alpha.subtract(BigDecimal.ONE);
		BigDecimal temp=x;
		sum=sum.add((temp.multiply(temp.add(BigDecimal.ONE))).divide((BigDecimal.valueOf(2)),2,RoundingMode.CEILING));
		return(sum=sum.add(floor(x,b)));
	}
	else
	{
		b=alpha.divide((alpha.subtract(BigDecimal.ONE)),5,RoundingMode.CEILING);
		BigDecimal y=x.multiply(alpha.subtract(BigDecimal.ONE));
		BigInteger bi=y.toBigInteger();
		BigDecimal bi1=BigDecimal.valueOf(bi.longValue());
		BigDecimal tempadd=x.add(bi1);
		sum=sum.add((tempadd.multiply(tempadd.add(BigDecimal.ONE))).divide((BigDecimal.valueOf(2)),2,RoundingMode.CEILING));
		return(sum.subtract(floor(bi1,b)));
	}
}
}
}