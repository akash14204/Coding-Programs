import java.util.Scanner;
import java.math.*;
class A{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		
		
		while(t-->0){
			
		String str=in.next();
		StringBuilder myName = new StringBuilder(str);
		int i=0;
		int d=0;
		int j=str.length()-1;
		 while(i<=((str.length()/2)-1) || j>=((str.length()/2)+1)){
			  if(str.charAt(i)=='.' && str.charAt(j)=='.'){
				  if(i>2){
				  myName.setCharAt(i,'a');
				  myName.setCharAt(j, 'a');
				  }
				  else{
				  myName.setCharAt(i,'a');
				  myName.setCharAt(j,'a');
				  }
			  }
			  else {
				  if(str.charAt(i)!=str.charAt(j)){
					   if(str.charAt(i)!='.' && str.charAt(j)!='.'){
							d++;
							break;
				        }
						else{
							if(str.charAt(i)=='.'){
								myName.setCharAt(i, str.charAt(j));
							}
							if(str.charAt(j)=='.'){
								myName.setCharAt(j, str.charAt(i));
							}
						}
				  }
			  }
			  i++;
			  j--;
			  
		    }
			if(str.length()%2!=0){
				int k=((str.length()+1)/2)-1;
				if(str.charAt(k)=='.'){
					if(str.length()==1){
				      myName.setCharAt(i, 'a');
					}
					else{
						myName.setCharAt(i, 'a');
					}
				}
			}
			
			
			if(d>0){	
			    System.out.println(-1);
			}
			else{
			System.out.println(myName);
			}
		}
	}
}	