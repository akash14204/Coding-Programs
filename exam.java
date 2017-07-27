import java.util.Scanner;

class exam{
 public static void main(String[] args){
	int t,n,k,e,m,sm,g=0,z;
	Scanner in=new Scanner(System.in);
	t=in.nextInt();
	
	while(t-->0){
		n=in.nextInt();//no of students
		k=in.nextInt();//no of seats
		e=in.nextInt();//no of exams
		m=in.nextInt();//max marks 
		
	    int arr[]=new int[n];//array to store sum of students marks
		
		 for(int b=0;b<n-1;b++){
			 int p=0;
			for(int l=0;l<e;l++){
			sm=in.nextInt(); 
			p+=sm;
			}
			arr[b]=p;			
		 }
		 
//sorting		 
for(int i=1;i<n-2;i++)
{
int key =arr[i];
int j=i-1;
while((j>=0)&&(key<arr[j])){
arr[j+1]=arr[j];
j--;
}
arr[j+1]=key;
}

for(int i=0;i<e-1;i++){
	z=in.nextInt();	
    g+=z;	
}
int r= (arr[n-k-1]-g);

  System.out.println(r);



		 
	}
 }
}