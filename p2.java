import java.util.*;
class A{
   public static void main(String args[]){
	   int i;
	   Scanner in =new Scanner(System.in);
	   int n=in.nextInt();
	   
	   Set<Integer> set=new HashSet<Integer>();
	   
	   for(i=0;i<n;i++){
	   set.add(in.nextInt());
       }
	   
	   System.out.println(set);
      
	   
   
   }
}