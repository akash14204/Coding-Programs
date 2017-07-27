import java.util.*;
import java.io.*;
import java.text.DecimalFormat;
class A{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
           int s=in.nextInt();
           int v=in.nextInt();  
           double  res=(2.0*(double) s)/(3.0*(double) v);
		   if(res<=0.0000001){
			 System.out.println("0.0000001");
		   }
		   else{   
           DecimalFormat num= new DecimalFormat("0.000000");
           System.out.println(num.format(res));
		   }
        }
	}
}	