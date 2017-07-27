import java.util.*;
import java.io.*;
class A{
    public static void main(String args[]) throws IOException{
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        String st[]=br.readLine().split(" ");
        int t=Integer.parseInt(st[0]);

        String col=br.readLine();

        //for change in to character

       char[] chars = col.toCharArray();
        int a = Character.getNumericValue(chars[0]);
        int b = Character.getNumericValue(chars[1]);
        int c = Character.getNumericValue(chars[3]);
        int d = Character.getNumericValue(chars[4]);

       //System.out.println(d);

        if(t==24){
            
        }
        
        
     }
}    
        
        