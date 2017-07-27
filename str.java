import java.io.*;

class A{
	public static void main(String args[]) throws IOException{
		
	int j;
		
		
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		j=Integer.parseInt(br.readLine());
		while(j-->0){
			int c=0,d=0,e=0;
		String s1=br.readLine();
		String s2=br.readLine();
		
		for(int i=0;i<s1.length();i++){		
			if(s1.charAt(i)!=s2.charAt(i)){
				c++;
			}
			if(s1.charAt(i)=='?'&&s2.charAt(i)=='?'){
				d++;
			}
			if((s1.charAt(i)=='?'&&s2.charAt(i)!='?')||(s1.charAt(i)!='?'&&s2.charAt(i)=='?')){
				e++;
			}
		}
		System.out.print(c-e+" ");
		System.out.println(c+d);
	    }
  }
}