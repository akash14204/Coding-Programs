import java.util.Scanner;
import java.util.Arrays;

class A{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		
		
		
		//TEST CASES
		int t=in.nextInt();
		
		while(t-->0){
			//FRIENDS NUMBER
			int fn=in.nextInt();
			//array defined
			int[] cn=new int[fn+1];
			int[] res=new int[100000];
			for(int i=1;i<=fn;i++){
				//COKIES NUMBER
			     cn[i]=in.nextInt();
				//array defined
				int[] cok=new int[cn[i]+1];
				int[] temp=new int[cn[i]+1];
				
				   int a=0,b=0,c=0,d=0,e=0,f=0;
				  for(int j=1;j<=cn[i];j++){
				    //COKIES values
			        cok[j]=in.nextInt();
					temp[j]=cok[j];
				   //COUNTING 1's 2's etc
				   if(cok[j]==1){
					   a++;
				   }
				   else if(cok[j]==2){
					   b++;
				   }
				   else if(cok[j]==3){
					   c++;
				   }
				   else if(cok[j]==4){
					   d++;
				   }
				   else if(cok[j]==5){
					   e++;
				   }
				   else if(cok[j]==6){
					   f++;
				   }
			    }
				//SORTED ARRAY OF 1's 2's etc COOKIES
				int[] arr={a,b,c,d,e,f};
				 Arrays.sort(arr);
				
				 Arrays.sort(temp);
				 
				 
				 /*for(int j=0;j<=cn[i];j++){
				   System.out.println(arr[j]);
				 }*/
				 
				 //NUMBER OF DIFFRENT COOKIES
				 int z=1;
				 for(int j=1;j<cn[i];j++){
				    if(temp[j]!=temp[j+1]){
						z++;
				    }
				 }
				 //System.out.println(z);
				 
				 //FINDING FROM WHERE IT HAS VALUES
				 /*int ni=0;
				 for(int i=1;i<=6;i++){
					 if(arr[i]>0){
						 ni=i;
						 break;
					 }
				 }*/
				 
				 
				 int ans=0;
				 if(z==6){
					ans =(4*arr[0])+(2*(arr[1]-arr[0]))+(1*(arr[2]-arr[1]))+cn[i];
				 }
				 else  if(z==5){
					ans =(2*arr[0])+(1*(arr[1]-arr[0]))+cn[i];
				 }
				 else if(z==4){
					ans =(1*arr[0])+cn[i];
				 }
				 else{
					ans =cn[i];
				 }
				 res[i]=ans;
			}
			/*for(int i=1;i<=fn;i++){
				System.out.println(res[i]);
			}*/
			
			int max=res[1];
			int p=1;
		    for(int i=2;i<=fn;i++){
				if(max<res[i]){
					p=i;
					max=res[i];
				}
			}
			
			int s=0;
			for(int i=1;i<fn;i++){
				if(res[i]==max){
					s++;
				}
			}
			
			
			
			if(s>1){
				System.out.println("tie");
			}
			else{
			if(p==1){
				System.out.println("chef");
			}
			else{
				System.out.println(p);
			}
			}
			
		}
	}
}