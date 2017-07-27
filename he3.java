//simple input
import java.util.Scanner;
class A{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] arr=new int[n+1];
		for(int i=1;i<n+1;i++){
			arr[i]=in.nextInt();
		}
		int s = in.nextInt();
		int e = in.nextInt();
		
		int i=0;
		while(i<=n){
			int p=arr[s];
			if(p==e){
				System.out.println("Yes");
				break;
			}
			else if(s==arr[p]){
				System.out.println("No");
				break;
			}
			else{
				s=arr[p];
			}
			i++;
		}
		
	}
}	