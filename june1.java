//simple input
import java.util.*;
import java.io.*;
class A{
	public static void main(String args[]) throws IOException{
		InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
		int t=Integer.parseInt(br.readLine());
		
	while(t-->0){
		int z=0;
		String st[]=br.readLine().split(" ");
		int r=Integer.parseInt(st[0]);
		int lol=Integer.parseInt(st[0]);
		String[] str=new String[10000];
		for(int i=0;i<r;i++){
			str[i]=br.readLine();
		}
		
		
		
		
		int c=(str[0]).length();
		for(int j=0;j<c;j++){
			int k=0;
			for(int i=0;i<r;i++){
				if((str[i]).charAt(j)=='1'){
					k++;
				}
			}
			System.out.println(k);
			z=z+(k*(k-1))/2;
			
		}
			System.out.println(z);
		
	}
  }	
}	
	