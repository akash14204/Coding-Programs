import java.util.Scanner;

class A{
	public static void main(String args[]){
		int t,n,z;
		Scanner in=new Scanner(System.in);
		t=in.nextInt();
		 	
		 
		while(t-->0){
			int v=0;
		     n=in.nextInt();//for number of exams	
             int[] arr=new int[100];//array	 
			 for(int q=0;q<n;q++){
				 arr[q]=in.nextInt();//getting marks and storing in array
				 v=v+arr[q];//sum of total marks
			 }
		

        for(int i=0;i<n-1;i++){//insertion sort
			int d=i;
			while(d>0 && arr[d]>arr[d-1]){
				z=arr[d];
				arr[d]=arr[d-1];
				arr[d-1]=z;
				d--;
				}		
		}
		/*for checking of insertion sort
		for( i=0;i<=n-1;i++){
		System.out.println(arr[i]);
		}
		*/
			if(arr[0]<=2 || (v/n)<4 || arr[n-1]<5){//student least marks ,average marks,highest mark
				System.out.println("No");
			}
			else
				System.out.println("Yes");
					 
		}
		
	}
}