import java.util.Scanner;
class A{
	public static void main(String args[]){
	int t,b,p,z;
	Scanner in=new Scanner(System.in);
	t=in.nextInt();
	while(t-->0){
		b=in.nextInt();
		if(b>3){
			if(b%2==0){
				p=(b/2)-1;
				System.out.println(((p*(p+1))/2));
			}
			if(b%2!=0){
				p=((b-1)/2)-1;
				System.out.println(((p*(p+1))/2));
			}
		}
		else
			System.out.println("0");
	}
  }
}


