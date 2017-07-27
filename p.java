import java.io.*;

import java.util.*;

import java.lang.*;
class B

{

public static void main(String[] args) {

Scanner sc=new Scanner(System.in);

int t=sc.nextInt();

while(t!=0){

t--;

int c=0,index=0;

int n=sc.nextInt();

int[] A=new int[n];

int[][] graph=new int[n][n];

for(int j=0;j<n;j++)//use adjacent matrix graph make 1 if from ith position you can go to any poisition. if it returns to a prev visited position again then arrays stays same the break

A[j]=sc.nextInt();

for(int i=0;i<n;i++){

index=i;

while(true){

index=index+A[index]+1;

if(index>=n){

index=index%n;//implementing circular property don't use index-=n gives EZEC

graph[i][index]++;

}

else

graph[i][index]++;

if(graph[i][i]==1){

c++;

break;

}

if(graph[i][index]>1)

break;

}

}

System.out.println(c);

}

}
}

