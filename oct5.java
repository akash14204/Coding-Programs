import java.util.*;
import java.io.*;
import java.text.DecimalFormat;
class A{
    public static void main(String args[])throws IOException{
		try{
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        int t=Integer.parseInt(br.readLine());
		while(t-->0){
		String st[]=br.readLine().split(" ");
		
		String l1=st[0];
		String l2=st[1];
		String l3=st[2];
		int n=Integer.parseInt(st[3]);	
		int yo=0;
		int yo2=0;
		int yo3=0;
		int c1=0;
		int c2=0;
		int c3=0;
		int clol=0;
		
		for(int i=l3.length()-1;i>=0;i--){
			if(l3.charAt(i)=='0'){
				for(int j=i;j>=0;j--){
					//System.out.println("b");
				   if(l3.charAt(j)=='1'){	
                     c1++;				   
		            }	 
		        }
				for(int j=l2.length()-1;j>=0;j--){
					//System.out.println("b");
				   if(l2.charAt(j)=='1'){	
                     c2++;				   
		            }	 
		        }
				for(int j=l1.length()-1;j>=0;j--){
					//System.out.println("b");
				   if(l1.charAt(j)=='1'){	
                     c3++;				   
		            }	 
		        }
				long ans=n*c2;
				System.out.println(c1+(ans)+c3+1);
				yo++;
				break;
		    }
		}
		
		
		
		if(yo==0){
		    for(int i=l2.length()-1;i>=0;i--){
			if(l2.charAt(i)=='0'){
				for(int j=i;j>=0;j--){
					//System.out.println("b");
				   if(l2.charAt(j)=='1'){	
                     c2++;				   
		            }	 
		        }
				for(int j=l2.length()-1;j>=0;j--){
					//System.out.println("b");
				   if(l2.charAt(j)=='1'){	
                     clol++;				   
		            }	 
		        }
				for(int j=l1.length()-1;j>=0;j--){
					//System.out.println("b");
				   if(l1.charAt(j)=='1'){	
                     c3++;				   
		            }	 
		        }
				long ans1=c2+((n-1)*clol);
				System.out.println((ans1)+c3+1);
				yo2++;
				break;
		    }
		    }
		}
		
		
		if(yo==0 && yo2==0){
		    for(int i=l1.length()-1;i>=0;i--){
			if(l1.charAt(i)=='0'){
				for(int j=i;j>=0;j--){
					//System.out.println("b");
				   if(l1.charAt(j)=='1'){	
                     c3++;				   
		            }	 
		        }
				System.out.println(c3+1);
				yo3++;
				break;
		    }
		    }
		}
		if(yo==0 && yo2==0 && yo3==0){
			System.out.println("1");
		}
	}
}	
catch(Exception ee)
{}	      
}
}	