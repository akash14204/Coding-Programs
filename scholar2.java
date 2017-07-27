import java.util.Scanner;

class A{
	public static void main(String args[]){
		int t;
		Scanner in=new Scanner(System.in);
		t=in.nextInt();
		 	
		  int highest;
		  int lowest;
		while(t-->0){
			long v=0L,n;
			
			int e;
		     n=in.nextInt();//for number of exams			 
			 e=(in.nextInt());//getting marks 
			  highest=e;
			  lowest=e;
			 v=e;
			 for(int q=1;q<n;q++){
				 
				 e=(in.nextInt());//getting marks 
				 v=v+e;//sum of total marks
				 
				 if(e>highest){//for getting highest value
					 highest=e;
				 }
				  if(e<lowest){//for getting lowest value
					 lowest=e;
				 }
			 }
		
		
			if(lowest<=2 || ((v*1.0/n)<4 || highest<5)){//student least marks ,average marks,highest mark CONDITION
				System.out.println("No");
			}
			else
				System.out.println("Yes");
					 
		}
		
	}
}