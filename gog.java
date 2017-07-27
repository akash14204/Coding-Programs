import java.util.Scanner;
class A{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		
		int t=in.nextInt();
		
		
		while(t-->0){
			String str;
			str=in.next();
			int c=0;
			for(int i=0;i<str.length()-1;i++){
				if(str.charAt(i)==str.charAt(i+1)){
					c++;
				}
			}
			System.out.println(c);	
		}
	}	
}	