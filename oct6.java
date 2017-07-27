import java.util.*;
import java.io.*;
import java.text.DecimalFormat;
class A{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
           int n=in.nextInt();
           int k=in.nextInt();  
           int d=in.nextInt();
		   int[] arr=new int[n+1];
		   int[] temp=new int[n+1];
		   for(int i=1;i<=n;i++){
			   arr[i]=in.nextInt();
		   }
		   for(int i=1;i<=n;i++){
			   temp[i]=arr[i];
		   }
		    System.out.println("0"+" "+"1");
			
			
		   
//insertion sort

for(int i=2;i<=n;i++)
{
int key =temp[i];
int j=i-1;
while((j>=0)&&(key<temp[j]))
{
temp[j+1]=temp[j];
j--;
}
temp[j+1]=key;

}

		  /* for(int i=1;i<=n;i++){
			   System.out.print(temp[i]);
		   }
		   System.out.println("");
		  */
		   
		   
		   
		   
           for(int i=n;i>n-d;i--){
				for(int j=1;j<=n;j++){
					if(temp[i]==arr[j]){
						System.out.println("2"+" "+"1");
						break;
					}
				}
			}
			
			
			 System.out.println("-1");
			}
		   
	}
	     
