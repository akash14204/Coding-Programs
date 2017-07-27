import java.util.*;
class A{
	public static void main(String args[]){
		int i,j,t,st,key,max,semax,p;
		int[] a=new int[10000]; 
		int[] g=new int[10000]; 
		int[] k=new int[10000]; 
		int[] z=new int[10000];
		Scanner in=new Scanner(System.in);
		t=in.nextInt();
		while(t-->0){
			int e=0;
			st=in.nextInt();
			for(i=0;i<st;i++){
				a[i]=in.nextInt();
			}
			
			for(i=1;i<st;i++){
				key=a[i];
				j=i-1;
				while((j>=0)&&(key<a[j])){				
					a[j+1]=a[j];						
					j--;					
				}
				a[j+1]=key;	
			}
			
			
			HashSet<Integer> intset=new HashSet<Integer>();
			for(i=0;i<st;i++){
				
				if(a[i]==a[i+3]){
					intset.add(a[i]);
				}
				else if(a[i]==a[i+1]){
					intset.add(a[i]);
				}
			}
			
			int n=intset.size();
			Iterator iterator=intset.iterator();
			while(iterator.hasNext()){
				while(i<n){
				iterator.next();
				//System.out.println(iterator.next());
			    }		
		    }
		
	}
  }
}