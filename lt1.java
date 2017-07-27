import java.util.Scanner;
class A{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		
		while(t-->0){
			int n=in.nextInt();
			int a=in.nextInt();
			int[] arr=new int[a+100];
			int[] p=new int[a+100];
			
			for(int i=a-1;i>=0;i--){
				arr[i]=in.nextInt();
			}
			for(int i=0;i<a;i++){
				p[i]=in.nextInt();
			}
			int k=0;
			for(int i=0;i<a;i++){
				if(p[i]!=arr[i]){
					k++;
				}
			}
			if(k>0){
				System.out.println("No");
			}
			else{
				System.out.println("Yes");
			}
			
		}
	}
}