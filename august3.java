import java.util.Scanner;
class A{
	public static void main(String args[]){
	int t,z,j,i,h,max,yo,sum ;
	
	
	Scanner in=new Scanner(System.in);
	int[] a=new int[1000];
	t=in.nextInt();
	for(int x=1;x<=t;x++){
		a[x]=in.nextInt();
	}
	
	

        yo=0;
		for(j=1;j<=t;j++){
         		
         		
		 for(z=j+1;z<=t;z++){
		  if((a[j]&a[z])==a[z]||(a[j]&a[z])==a[j]){
					max=a[j];
				for(h=j+1;h<=z;h++){
					if (a[h] > max){
						max=a[h];						
					}
   		        }
				yo=yo+max;
              			
	        }	 	 
        }
		
    }
	System.out.println(yo);
        }
}

