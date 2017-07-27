import java.util.Scanner;
class A{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		
		int t=in.nextInt();
		
		
		while(t-->0){
			long n=in.nextLong();
			long m=in.nextLong();
			long k=in.nextLong();
			
			
			if(n-m>0){
				if(k>=n-m){
					System.out.println("0");
				}
				else{
					System.out.println(n-m-k);
				}
			}
			else if(n-m<0){
				if(k>=m-n){
					System.out.println("0");
				}
				else{
					System.out.println(m-n-k);
				}
			}
			else{
				System.out.println("0");
			}
			
				
			}
		}
	}	
		