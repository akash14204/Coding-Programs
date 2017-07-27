import java.util.*;
import java.io.*;
class A{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
           int m=in.nextInt();
           int p=in.nextInt();
           int c=in.nextInt(); 
           int[] arr=new int[1000000];

           int[] m1=new int[1000001];
           int[] p1=new int[1000001];


for(int i=0;i<m;i++){
          m1[i]=i+1;
    } 
    for(int i=0;i<p;i++){
          p1[i]=i+1;
    } 
/*for(int i=0;i<p;i++){
System.out.print(p1[i]);
}*/


int prime=c;
int h=0;
for (int i = 2; i <= prime; i++) { 
int n = 0; 
while (prime % i == 0) { 
prime /= i; n++; } 
if (n != 0) { 
for (int j = n; j > 0; j--) { 
arr[h]=i;
h++;
 } } }






int[] m2=new int[1000001];
int[] n2=new int[1000001];
int b=0,v=0;
if(p*m>=c){
    for(int i=0;i<h;i++){
        for(int j=0;j<m;j++){
        if(m1[j]%arr[i]==0){
           m2[v]=m1[j]; 
           v++;
           break;
          }
        }
        for(int k=0;k<p;k++){
        if(p1[k]%arr[i]==0){
           n2[b]=p1[k];
           b++; 
           break;
         }
       }
    }
}


for(int i=0;i<v;i++){
System.out.print(m2[i]);
}
System.out.println("");
for(int i=0;i<b;i++){
System.out.print(n2[i]);
}




int mine=0;
int[] ans=new int[(v*b)+2];
 for(int i=0;i<v;i++){
        for(int j=0;j<b;j++){
             if(m2[i]*n2[j]==c){
                mine++;
             }

            }
        }
System.out.println(mine);
/*
System.out.println(arr[1]);
 for (int j = 0; j < h; j++) { 
System.out.println("K");

}
*/
 }

        }
    }
    
        
        