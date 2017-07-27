import java.util.Scanner;
import java.math.*;
class A{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		
		
		while(t-->0){
			long num=in.nextLong();
			int[] p=new int[num];
			int i=0;
			int x=0;
			int y=0;
			if(num==1 || num==0){
				System.out.println("Yes");
			}
			else{
			while(num>0){
			   p[i]=num%10;
			   i++;
			   num=num/10;	
			}
			for(int j=0;j<i;j++){
				if(p[j]==0){
					//System.out.println("g");
					x++;
				}
				else{
					//System.out.println("h");
					y++;
				}
			}
			
			if(x==1 || y==1){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}
		  }
		}
	}
}	