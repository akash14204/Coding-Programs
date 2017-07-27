import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;


class A{
    public static void main(String[] args) {
          Scanner in=new Scanner(System.in);
		        String str=in.next();
                StringBuilder myName = new StringBuilder(str);
				//System.out.println(myName);
		 for (int i = 0; i < myName.length(); i++) {
			 if(myName.charAt(i)=='?'){
				 //System.out.println("a");
				 if(i+1<myName.length() && i-1<0){
					  //System.out.println("b");
					  if(myName.charAt(i+1)=='b'){
						   //System.out.println("c");
                              myName.setCharAt(i, 'a');
					  }
					  else if(myName.charAt(i+1)=='a'){
						   //System.out.println("d");
                              myName.setCharAt(i, 'b');
					  }
					  else{
						   //System.out.println("e");
						  myName.setCharAt(i, 'a');
						  //System.out.println(myName);
					  }
				 }
				 else if(i-1>=0 && i+1==myName.length()){
					  //System.out.println("f");
					 if(myName.charAt(i-1)=='b'){
						 //System.out.println("p");
                              myName.setCharAt(i, 'a');
					  }
					  else if(myName.charAt(i-1)=='a'){
						  //System.out.println("q");
                              myName.setCharAt(i, 'b');
					  }
					  else{
						  myName.setCharAt(i, 'a');
					  }
				 }
				 
				 else if(myName.charAt(i+1)=='b'){
					 //System.out.println("i");
                              myName.setCharAt(i, 'a');
					  }
			     else if(myName.charAt(i+1)=='a'){
					 //System.out.println("j");
                              myName.setCharAt(i, 'b');
					  }
			     else{
						  if(myName.charAt(i-1)=='a'){
							  //System.out.println("k");
                              myName.setCharAt(i, 'b');
							  //System.out.println(myName);
					        }
							else{
							//System.out.println("l");
                              myName.setCharAt(i, 'a');
					        
							}
					  }
				 
			 }
			
        }
		System.out.println(myName);
    }

}
