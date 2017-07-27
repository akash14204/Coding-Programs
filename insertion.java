import java.util.Scanner;

class A{
	
	
	public static void main(String ...s){
	int[] p=new int[100];
	int i;
	Scanner in=new Scanner(System.in);
		for(i=0;i<5;i++){
			p[i]=in.nextInt();
	}
	
	for( i=1;i<=4;i++){
		int d=i;
		while(d>0&&p[d]<p[d-1]){
			int t=p[d];
			p[d]=p[d-1];
			p[d-1]=t;
			d--;
		}
	}
	for( i=0;i<=4;i++){
		System.out.println(p[i]);
		
	}
	
}
}