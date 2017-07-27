//2: approch
//Ex: 1 akash
//ans:
//pe[0]=1
//pe[1]=akash
import java.util.*;
import java.io.*;
class A{
	public static void main(String args[]) throws IOException{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		
	   while(t-->0){
		
		String s1=in.nextLine();
		String[] pe=s1.split("\\s+");
		System.out.println(pe[1]);
		
		//if u have any integer in a line
		int ans=Integer.parseInt(pe[0]);
		System.out.println(ans);
	   }
	}
}

//3:approch
//When u need take strings in a line using buffered reader.................
import java.util.*;
import java.io.*;
import java.text.DecimalFormat;
class A{
    public static void main(String args[])throws IOException{
		
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
		
		
        int t=Integer.parseInt(br.readLine());
		
		while(t-->0){
		  /*String st[]=br.readLine().split(" ");
		  int m=Integer.parseInt(st[0]);
		  int n=Integer.parseInt(st[1]);*/
    	int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++){
		  String s1=br.readLine();
		  String[] pe=s1.split("\\s+");
		  //if three inputs is there with space Ex: 1 a b 
		  System.out.println(pe[0]+" "+pe[1]+" "+pe[2]);
		  //conversion from string to int. Ex: 1 a b 
		  int ans=Integer.parseInt(pe[0]);
		  System.out.println(ans*4);
		}
		
		}      
    }
}	