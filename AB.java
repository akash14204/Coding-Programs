
import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;


 public class A {
    public static void main(String[] args) {
          Scanner in=new Scanner(System.in);
		int a=in.nextInt();
                int b=in.nextInt();
                
				if(a==0 && b==0){
					 System.out.println("NO");
				}
				else{
                if(b-a==1 || a-b==1 || b-a==0){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
				}
				
    }

}
