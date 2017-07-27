//simple input
import java.util.*;
import java.lang.*;
class A{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int k=in.nextInt();
		int r=in.nextInt();
		int c=1;
		long n=Long.MAX_VALUE;
		
		
		for(int i=1;i<n;i++){
			if((k*i)%10!=0){
				if(((k*i)-r)%10!=0){
					c++;
							//System.out.println("AA");

				}
				else{
					//System.out.println("WW");
					break;
							

				}
			}
			else{
					//System.out.println("QQ");
				break;
					

			}
		}
		System.out.println(c);
	}
}	
