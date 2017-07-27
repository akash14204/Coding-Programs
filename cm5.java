import java.util.LinkedList;
import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;
class A {
 
  public static void main(String[] args) throws IOException {
      Scanner in=new Scanner(System.in);
	  int m=in.nextInt();
	  int n=in.nextInt();
	  
	  int[][] mat1=new int[m][n];
	  int[][] mat2=new int[m][n];
	  int[][] mat3=new int[m][n];
	  for(int i=0;i<m;i++){
		for(int j=0;j<n;j++){
		  mat1[i][j]=in.nextInt();
	    }  
	  }
	  for(int i=0;i<m;i++){
		for(int j=0;j<n;j++){
		  mat2[i][j]=in.nextInt();
	    }  
	  }
	  for(int i=0;i<m;i++){
		for(int j=0;j<n;j++){
		 System.out.print((mat1[i][j]+mat2[i][j])+" ");
	    }
        System.out.println();		
	  }
  }
}