import java.io.*;
class A{
	public static void main(String args[]) throws IOException{
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		int t=Integer.parseInt(br.readLine());
		
		while(t-->0){
			int n=Integer.parseInt(br.readLine());
			long[] a=new long[n];
			String[] str=br.readLine().split(" ");
			for(int i=0;i<n;i++){
				a[i]=Long.parseLong(str[i]);
			}
			int c=1;
			for(int i=0;i<n;i++){
				if(c>1){
					c--;
				}
				else{
				for(int j=i;j<n-1;j++){
					if((a[j]>=0&&a[j+1]<0)||(a[j]<0&&a[j+1]>=0)){
						c++;
					}
					else{
					break;
					}
			    }
			    }
				System.out.print(c+" ");
			}
			System.out.println();
	    }
    }
}