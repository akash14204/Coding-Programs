import java.util.*;

class A{
     int binarysearch(int low,int high,int key,int[] arr){	
		while(high>=low){
			int mid=(low+high)/2;
			if(key<arr[mid]){
				high=mid-1;
			}
			else if(key>arr[mid]){
				low=mid+1;
			}
			else{
				return mid+1;
			}	
		}
		return -1;
	}
	
	public static void main(String args[]){
		
	    int res[]=new int[1000000];
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		
		Arrays.sort(a);
		int m=in.nextInt();
		for(int i=0;i<m;i++){
			int input=in.nextInt();
			A obj=new A();
			res[i]=obj.binarysearch(0,n-1,input,a);
		}
		
		for(int i=0;i<m;i++){
			System.out.println(res[i]);
		}
	}
}