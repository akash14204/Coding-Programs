import java.util.Scanner;
class A{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int t,number;
		
		t=in.nextInt();
		while(t-->0){
			number=in.nextInt();
			String sn=Integer.toString(number);
			int l=sn.length();
			
			int p[]=new int[l];
			
			while(number>0){
				for(int i=0;i<l;i++){
					p[i]=number%10;
					number=number/10;
				}
			}
			int r=p[0]+p[l-1];
			if(l==1){
				System.out.println(p[0]);
			}
			else
			System.out.println(r);
			}
	}
}
