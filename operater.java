import java.util.Scanner;

class operater{
	public static void main(String args[]){
	Scanner in=new Scanner(System.in);
	int t,a,b;
	t=in.nextInt();
	
	while(t-->0){
		
		a=in.nextInt();
		b=in.nextInt();
		if(a>b){
			System.out.println(">");
		}
		else if(a<b){
			System.out.println("<");
		}
		else if(a==b){
			System.out.println("=");
		}
	  }
		
	}
	
	
	}
 