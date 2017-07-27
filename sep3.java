import java.util.Scanner;
class A{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		
		int t=in.nextInt();
		
		
		while(t-->0){
			int pn=in.nextInt();
			int[] p=new int[pn+1];
			for(int i=1;i<=pn;i++){
				p[i]=in.nextInt();
				//System.out.println(i);
			    int[] q=new int[p[i]+1];
				for(int z=0;z<p[i];z++){
				   q[z]=in.nextInt();
			    }
			}
			/*for(int i=1;i<=pn;i++){
			System.out.println(p[i]);
			}*/
			
			int max=p[1];
			int ans=1;
			for(int i=2;i<=pn;i++){
				if(max<p[i]){
					ans=i;
					max=p[i];	
				}
			}
			//System.out.println(max);
			
			int s=0;
			for(int i=1;i<pn;i++){
				if(p[i]==max){
					s++;
				}
			}
			//System.out.println(s);
			
			
			
			if(s>1){
				System.out.println("tie");
			}
			else{
			if(ans==1){
				System.out.println("chef");
			}
			else{
				System.out.println(ans);
			}
			}
		}
	}
}	