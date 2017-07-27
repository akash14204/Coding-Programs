import java.util.Scanner;
class A{
	
	
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		
		int t=in.nextInt();
		
		
		while(t-->0){
			int n=in.nextInt();
			
			long[] a=new long[n+1];
			 for(int i=0;i<n;i++){
	            a[i]=in.nextLong();
			 }
	if(n>4){		 
			 int z=0;
			 long[] b=new long[n+1];
			 for(int i=0;i<n-1;i++){
	           b[z]=a[i+1]-a[i];
			   z++;
			 }
			 
			 long max=b[0];
			 for(int i=1;i<z;i++){
	           if(max<b[i]){
				   max=b[i];
			   }
			 }
			
		






		
int count = 0; 
int curr_cnt = 1; 
long freq_num = 0; 
long key = 0;
for(int i = 0; i < z-1; i++)
{
    key = b[i];
    for(int j =i+1; j < z; j++)
    {
        if(key == b[j] && freq_num != key)
        {
            curr_cnt++;
        }
    }
    if(count < curr_cnt)
    {
        count = curr_cnt;
        curr_cnt = 1;
        freq_num = key;
    }
}
//System.out.println(freq_num);










            long l=0;
			long x=0;
            for(long i:b){
	           if(b[i]!=freq_num){
				  x=i;
				  l++;
			   }
			 }
			 
			 
			 if(l==0){
				System.out.println(a[0]); 
			 }
			 else if(l==1){
				 System.out.println(a[n-1]); 
			 }
			 else if(l==2){
				System.out.println(a[x]); 
			 }
			 else{
				 System.out.println("-1"); 
			 }





	}
	
	
	
	
	else if(n==4){
		 int z=0;
			 long[] b=new long[n+1];
			 for(int i=0;i<n-1;i++){
	           b[z]=a[i+1]-a[i];
			   z++;
			 }
			 
			 if(b[0]!=b[1]&&b[1]!=b[2]&&b[2]!=b[0]){
				 System.out.println("-1");
			 }
			 else if((b[0]!=b[1]&&b[1]!=b[2]&&b[2]==b[0])||(b[0]!=b[1]&&b[1]==b[2]&&b[2]!=b[0])||(b[0]==b[1]&&b[1]!=b[2]&&b[2]!=b[0])){
				     if((b[0]!=b[1]&&b[1]!=b[2]&&b[2]==b[0])){
						   System.out.println("-1");
					      
					 }
					else  if((b[0]!=b[1]&&b[1]==b[2]&&b[2]!=b[0])){
						   System.out.println(a[0]);
					      
					 }
					 else if((b[0]==b[1]&&b[1]!=b[2]&&b[2]!=b[0])){
						   System.out.println(a[2]);
					      
					 }
					 
					 
			 }
			 else if(b[0]==b[1]&&b[1]==b[2]&&b[2]==b[0]){
				 System.out.println(b[0]);
			 }
		 
	}
	
	else{
			 
		System.out.println(a[0]);
	}

		}
	}
}		