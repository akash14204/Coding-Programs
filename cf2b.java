import java.util.*;
import java.util.Arrays;
import java.io.*;


class A{
	public static void main(String[] args) throws IOException{
		InputStreamReader ir = new InputStreamReader(System.in);
          BufferedReader br=new BufferedReader(ir);
		  
		int n=Integer.parseInt(br.readLine());
		int[] arr=new int[n+1];
		int[] p=new int[n+1];
		String str[]=br.readLine().split(" ");
		for(int i=0;i<n;i++){
			
			arr[i]=Integer.parseInt(str[i]);
		}
		
		    int u=0;
			int z=0;
			Arrays.sort(arr);
			for(int i=0;i<n-1;i++){
				if(arr[i]!=arr[i+1]){
					z++;
				}
			}
			int temp=arr[0];
			for(int i=1;i<n;i++){
				if(temp!=arr[i]){
					p[u]=arr[i];
					temp=arr[i];
					u++;
				}
			}
			
	    if(z==0||z==1||z==2){
			System.out.println("YES");
		}
		else if(z>=4){
			System.out.println("NO");
		}
		else if(z==3){
			int a=p[1]-p[0];
			int b=p[2]-p[1];
			
			if(a==b){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
		
			
			
		
	}
}	