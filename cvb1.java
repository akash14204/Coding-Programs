/**
* The class Circular_Matrix creates a Square Matrix of size n*n and fills it in a circular fashion
* @author : www.javaforschool.com
* @Program Type : BlueJ Program - Java
*/
 
import java.util.*;
class cvb1
    {
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
 
            int A[][] = new int[n][n];
			int z1[]=new int[1000];
			int z2[]=new int[1000];
            int k=1, c1=0, c2=n-1, r1=0, r2=n-1;
            int count =0;
			int x =0;
            while(k<=n*n){
                    for(int i=c1;i<=c2;i++){
                        A[r1][i]=k++;
						if(A[r1][i]%11==0){
							count++;
							z1[x]=r1;
							z2[x]=i;
							x++;
						}
                    }
                    for(int j=r1+1;j<=r2;j++){
                        A[j][c2]=k++;
						if(A[j][c2]%11==0){
							count++;
							z1[x]=j;
							z2[x]=c2;
							x++;
						}
                    }
                    for(int i=c2-1;i>=c1;i--){
                        A[r2][i]=k++;
						if(A[r2][i]%11==0){
							count++;
							z1[x]=r2;
							z2[x]=i;
							x++;
						}
                    }
                    for(int j=r2-1;j>=r1+1;j--){
                        A[j][c1]=k++;
						if(A[j][c1]%11==0){
							count++;
							z1[x]=j;
							z2[x]=c1;
							x++;
						}
                    }
                 c1++;
                 c2--;
                 r1++;
                 r2--;
                }
   
            for(int i=0;i<n;i++){
                    for(int j=0;j<n;j++){
                            System.out.print(A[i][j]+ " ");
                        }
                 System.out.println();
                }
				     System.out.println("Total Power points : "+(count+1));
					 System.out.println("("+0+","+0+")");
				 for(int i=0;i<x;i++){
					 System.out.println("("+z1[i]+","+z2[i]+")");
				 }
				
        }
    }