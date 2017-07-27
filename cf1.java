import java.util.Scanner;
import java.util.Arrays;

class A{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);

		int l1=in.nextInt();
		int r1=in.nextInt();
		int l2=in.nextInt();
		int r2=in.nextInt();printf("%I64d",ans);
		int k=in.nextInt();
		int ans=0;

		if(l1>=l2&&r2>=l1&&r1>=r2){
			if(l1<k&&k<r2){
			ans=r2-l1;
		}
		else{
			ans=r2-l1+1;
		}
		System.out.println(ans);
		}


		else if(l2>=l1&&r1>=r2){
		if(l2<=k&&k<=r2){
			ans=r2-l2;
		}
		else{
			ans=r2-l2+1;
		}
		System.out.println(ans);
	    }


		else if(l2>=l1&&r2>=r1&&r1>=l2){
		if(l2<k&&k<r1){
			ans=r1-l2;
		}
		else{
			ans=r1-l2+1;
		}
		System.out.println(ans);
	    }


		else if(l1>=l2&&r2>=r1){
		if(l1<k&&k<r1){
			ans=r1-l1;
		}
		else{
			ans=r1-l1+1;
		}
		System.out.println(ans);
	    }
	}

}
