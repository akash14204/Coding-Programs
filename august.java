import java.util.Scanner;

class A{
	public static void main(String args[]){
		int t,n,m,p;
		Scanner in=new Scanner(System.in);
		
		t=in.nextInt();
		
		while(t-->0){
			n=in.nextInt();
			m=in.nextInt();
			
			p=(n*m)-1;
			
			if(p%2==0){
				System.out.println("No");
			}
			else if(p%2!=0){
				System.out.println("Yes");
			}
		}
		
	}
}