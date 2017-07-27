import java.io.*;
import java.text.DecimalFormat;
class A{
	public static void main(String args[]) throws IOException{
		
	   int i;
	   InputStreamReader ir=new InputStreamReader(System.in);
	   BufferedReader br=new BufferedReader(ir);
	   
	   int t=Integer.parseInt(br.readLine());
	   while(t-->0){
		   
		  double rs=Double.parseDouble(br.readLine());
		   if(rs>=1&&rs<=100000){
		   if(rs<1500){
			   double gs= (((rs*9)/10)+(rs/10)+rs);
			  
			   if((double)gs == (int) gs){
				   //System.out.println("A");
				   System.out.println((int) gs);
			   }
			   else{
				   //System.out.println("B");
				   DecimalFormat num= new DecimalFormat("#.0");
			       System.out.println(num.format(gs));
			   }
		   }
		   else{
			   double h=500;
			   double ps=(double)(h+((rs*98)/100)+rs);
			   if((double)ps == (int) ps){
				  // System.out.println("A");
				    System.out.println((int) ps);
			   }
			   else{
				   //System.out.println("B");
				   DecimalFormat num= new DecimalFormat("#.0");
			       System.out.println(num.format(ps));
			   }
			   
		   }
		 }
	   }
	}	
}