//simple input
import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;
class A{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int p=1,q=1;
		int n=in.nextInt();
		int[][] aaa=new int[n+1][5];
		int[][] bbb=new int[n+1][5];
		for(int i=1;i<=n;i++){
			int x1=in.nextInt();
			int y1=in.nextInt();
		    int x2=in.nextInt(); 
		    int y2=in.nextInt(); 
			
			//parallel to x-axis
			if(y1-y2==0){
				aaa[p][1]=x1;
				aaa[p][2]=y1;
				aaa[p][3]=x2;
				aaa[p][4]=y2;
				p++;
				System.out.println("AAA");
			}
			else{
				bbb[q][1]=x1;
				bbb[q][2]=y1;
				bbb[q][3]=x2;
				bbb[q][4]=y2;
				q++;
				System.out.println("DDDD");
			}
			
		}
		
		System.out.println(p);
		System.out.println(q);
		
		for(int i=1;i<p;i++){
				for(int j=1;j<=4;j++){
					System.out.print(aaa[i][j]+" ");
				}
				System.out.println(" ");
		}
		System.out.println(" ");
		for(int i=1;i<q;i++){
				for(int j=1;j<=4;j++){
					System.out.print(bbb[i][j]+" ");
				}
				System.out.println(" ");
		}
		
		int u=0;
			for(int i=1;i<p;i++){
				System.out.println("PPPPPPP");
				for(int j=1;j<q;j++){
					System.out.println("QQQQQQQ");
					System.out.println(i+" "+j);
				    if(aaa[i][1]<bbb[j][1]) {
						System.out.println("aaa");
						System.out.println(i+" "+j);
					    if(aaa[i][3]>bbb[j][3]) {
							System.out.println("bbb");
                            if(bbb[j][2]<aaa[i][2]) {
                               System.out.println("c");								
                                 if(bbb[j][4]>aaa[i][4]) {		
                                    System.out.println("d");								 
						           u++;
								 }
							}
						}
					}
				
			    }
			}
			
			System.out.println(u);
			
	}
}	