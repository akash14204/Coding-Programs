import java.util.Scanner;
class A{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		String str=in.next();
		
		int n=in.nextInt();
		
		String[] alpha=new String[n+1];
		for(int i=0;i<n;i++){
			 alpha[i]=in.next();
		}
		
		
		for(int k=0;k<n;k++){
			int c=0;
			for(int i=0;i<str.length();i++){
				for(int j=0;j<alpha[k].length();j++){
					if(str.charAt(i)==alpha[k].charAt(j)){
						c++;
					}	
		        }
		    }
			if(c==alpha[k].length()){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}
			
		}
		
		
	}
}