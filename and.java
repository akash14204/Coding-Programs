import java.io.*;
class A{
	public static void main(String args[]) throws IOException{
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader (in);
		
		int t=Integer.parseInt(br.readLine());
		
		while(t-->0){
			long c=0;
			long q=0;
			double p=0;
			int n=Integer.parseInt(br.readLine());
			long[] s=new long[n];
			String str[]=br.readLine().split(" ");
			for(int i=0;i<n;i++){
				s[i]=Long.parseLong(str[i]);
				p=p+s[i];
				if(s[i]>2){
				c++;
				}
				if(s[i]==5){
					q++;
				}
			}
			double z=p/n;
			if(z>=4.0){
				if(c==n&&q>=1){
					System.out.println("Yes");
				}
				else{
				System.out.println("No");
			    }
			}
			else{
				System.out.println("No");
			}
		}
	}
}	