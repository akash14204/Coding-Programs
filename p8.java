import java.util.*;

class A
{
    public static void main(String[] args)
    {
		
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0){
        String str = in.next();
	     char a1=str.charAt(0);
		 char a2=str.charAt(1);
		 if(a1!=a2){
		 int a=0;
		 
		 
			 for(int i=0;i<str.length();i++){
			  if(i%2==0){	 
			   if(str.charAt(i)!=a1){
				   a++;
			    }
			  }
			  else{
				if(str.charAt(i)!=a2){
				   a++;
			    }  
			  }
			 }
			 if(a==0){
				 System.out.println("YES");
			 }
			 else{
				System.out.println("NO"); 
			 }
		
		}
		else{
			System.out.println("NO"); 
		}
		}
		
		
	}	
 }
