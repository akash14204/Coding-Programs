import java.util.Scanner;

class Jump{
  
  public static void main(String[] args){
	  Scanner in=new Scanner(System.in);
		  int t,w;
		   t=in.nextInt();
		  int p[]=new int[5];
		 
		  while(t-->0){
			    for(int i=0;i<=4;i++){//where p[0]=f,p[1]=b,p[2]=time,p[3]=fd,p[4]=bd
				  p[i]=in.nextInt();		  
				  }
				  if(p[0]>p[1]){//banda will always go forword
				   int q[]=new int[p[3]]; 
				   n[0]	=f;			   
				   int n=1;
				   while(n<=p[3]){
					 q[n]=q[n-1]+(p[0]-p[1]);//got array of numbers
					 n++;
                         t=p[3]+((p[3]+p[2])*); 
						 System.out.println(t+'F');
					   }	
				   }
				   
			  }
			  
		  
	  }
  }

