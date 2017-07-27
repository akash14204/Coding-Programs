import java.io.*;
import java.text.DecimalFormat;
class A{
	 /* Merge Sort function */
    public static void sort(int[] a, int low, int high) 
    {
        int N = high - low;         
        if (N <= 1) 
            return; 
        int mid = low + N/2; 
        // recursively sort 
        sort(a, low, mid); 
        sort(a, mid, high); 
        // merge two sorted subarrays
        int[] temp = new int[N];
        int i = low, j = mid;
        for (int k = 0; k < N; k++) 
        {
            if (i == mid)  
                temp[k] = a[j++];
            else if (j == high) 
                temp[k] = a[i++];
            else if (a[j]<a[i]) 
                temp[k] = a[j++];
            else 
                temp[k] = a[i++];
        }    
        for (int k = 0; k < N; k++) 
            a[low + k] = temp[k];         
    }
	
	
	public static void main(String args[]) throws IOException{
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(in);
		int t=Integer.parseInt(br.readLine());
		
		while(t-->0){
			int i,j;
			String st[]=br.readLine().split(" ");
			//st.split("")[0]
			int n=Integer.parseInt(st[0]);
			int k=Integer.parseInt(st[1]);
			int[] a=new int[n+1];
			
			
			String str[]=br.readLine().split(" ");//used for spliting :)
			for(i=0;i<n;i++){
				a[i]=Integer.parseInt(str[i]);
			}
		
		     /* Call method sort */
             sort(a, 0, n);
		   
		    /*for(i=0;i<n;i++){
		     System.out.println(a[i]);
		    }*/
			
			double sum=0.000000;
			 for(i=k;i<n-k;i++){
				 
				 sum=sum+a[i];
			 }
			 double p=(double) sum/(n-2*k);
			 DecimalFormat num= new DecimalFormat("#.000000");
			System.out.println(num.format(p));
		}
	}
}