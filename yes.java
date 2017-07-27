import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;
class A{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0){
		  
		}
	}


public int Swapnil(int p,int q,int p1,int q1,int p2,int q2)
        {
            int value=0;
            if(p1==p2&&q1==q2)
            {
                 value=Math.abs(p1-p)+Math.abs(q1-q);
            }
            else if(p1==p2)
            {
               if(p==p1){  
                    if(q>=Math.min(q1,q2)&&q<=Math.max(q1,q2)){
				  value=0;
			    } 
                        else{
				  value=Math.min(Math.abs(q-q1),Math.abs(q-q2));
			    } 
                }
                else if(q>=Math.min(q1,q2)&&q<=Math.max(q1,q2)){
                    value=Math.abs(p-p1);
                }
                     else{
                int mynameislakhan1,mynameislakhan12;
                mynameislakhan1=Math.abs(p-p1)+Math.abs(q-q1);
                mynameislakhan12=Math.abs(p-p2)+Math.abs(q-q2);
                value=Math.min(mynameislakhan1,mynameislakhan12);
                }
            }
            else{
                if(q==q1){  
                    if(p>=Math.min(p1,p2)&&p<=Math.max(p1,p2)){
				  value=0;
			    } 
                        else{
				  value=Math.min(Math.abs(p-p1),Math.abs(p-p2));
			    } 
                }
                else if(p>=Math.min(p1,p2)&&p<=Math.max(p1,p2)){
                    value=Math.abs(q-q1);
                }
                     else{
                int mynameislakhan1,mynameislakhan12;
                mynameislakhan1=Math.abs(p-p1)+Math.abs(q-q1);
                mynameislakhan12=Math.abs(p-p2)+Math.abs(q-q2);
                value=Math.min(mynameislakhan1,mynameislakhan12);
                }
            }
                 return value;
        }
}