import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;
class A{
	//LEAST PRIME NUMBER
	public static int smallestFactor(int C){
      for (int i = 2; i*i<= C; i++) {   
        if (C % i == 0){
            return i;
        }
      }
    return C;
    }
	//MAIN METHOD
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		//TEST CASES
		int t=in.nextInt();
		
		while(t-->0){
			//Array numbers and machine numbers
			int an=in.nextInt();
			int mn=in.nextInt();
			
		    int[] arr=new int[an+1];
			int[] answer=new int[mn+1];
			
			//Storing value in Array
			for(int i=1;i<=an;i++){
				arr[i]=in.nextInt();
			}
			
			int u=0;
			//Storing value Machine name and arguments
			for(int i=0;i<mn;i++){
				//Machine and L and R arguments
				int mv=in.nextInt();
				int l=in.nextInt();
                int r=in.nextInt();
				
				//z contains smallest prime number	
	                A ob=new A();
	               
				int res=1;
				if(mv==0){	
					for(int j=l;j<=r;j++){
						arr[j]=arr[j]/(ob.smallestFactor(arr[j]));
					}
				}
				else if(mv==1){	
					for(int k=l;k<=r;k++){
						res = Math.max(res,(ob.smallestFactor(arr[k])));
					}
					answer[u]=res;
					u++;
				}  				
			}
			
			for(int i=0;i<u;i++){
			System.out.println(answer[i]);
			}
			
			
		
        }
	}
}