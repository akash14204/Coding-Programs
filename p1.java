import java.util.*;
class A{
   public static void main(String args[]){
	   int i;
	   Scanner in =new Scanner(System.in);
	   int n=in.nextInt();
	   
	   ArrayList<Integer> al=new ArrayList<Integer>();
	   
	   for(i=0;i<n;i++){
	   al.add(in.nextInt());
       }
	   
	   System.out.println(al);
      
	   
   
   }
}