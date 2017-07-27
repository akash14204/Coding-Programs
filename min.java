import java.io.*;
class A{
	public static void main(String args[]) throws IOException{
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		
		int t=Integer.parseInt(br.readLine());
		while(t-->0){
			
			int n=Integer.parseInt(br.readLine());
			long[] a=new long[n];
			String[] st=br.readLine().split(" ");
			for(int i=0;i<n;i++){
				a[i]=Integer.parseInt(st[i]);
			}
			long k=a[0];
			for(int i=1;i<n;i++){
				if(k>a[i]){
					k=a[i];
				}
			}
			System.out.println(k*(n-1));
			
		}
	}
}