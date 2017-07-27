
import java.util.Scanner;


class A {


	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {

			int a = sc.nextInt();

			int arr[] = new int[a];

			for (int j = 0; j < a; j++) {

				arr[j] = sc.nextInt();

			}

			int b = sc.nextInt();

			int seq[] = new int[b];

			for (int j = 0; j < b; j++) {

				seq[j] = sc.nextInt();

			}
         int j = 0;
		

			int k = 0;

			while (j < a && k < b) {

				if (arr[j] == seq[k]){

					

					k++;

				}

				j++;

				

			}

			if (k == b)

				System.out.println("Yes");

			else

				System.out.println("No");

		}

	}

}




