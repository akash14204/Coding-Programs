import java.util.Scanner;

class rat{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int i;
		double[] a=new double[4];
		for(int t=0;t<=3;t++){
			a[t]=in.nextInt();
		}
for( i=0;i<4;i++){
double key =a[i];
int j=i-1;
while((j>=0)&&(key<a[j])){
a[j+1]=a[j];
j--;
}
a[j+1]=key;
}

			if((a[0]/a[1])==(a[2]/a[3])){
	System.out.println("Possible");
}
else
	System.out.println("Impossible");



	}
}221401