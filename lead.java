import java.util.Scanner;


class A {

	private static Scanner scanner;

	public static void main(String[] args) {


		scanner = new Scanner(System.in);

		int t = scanner.nextInt();
		
		while (t > 0) {

			int n = scanner.nextInt();

			int count = 0;

			int day = 0;
			

			for(int i=1900;i<=n-1;i++){

				if (((i % 4 == 0) && (i % 100 != 0)) || (i % 400 == 0)) {
					
					count = count + 2;

				} else {

					count++;
				}				

			}
			day= (count+1)%7;
			
			switch (day) {
				case 1:

				System.out.println("monday");

				break;

			case 2:

				System.out.println("tuesday");

				break;

			case 3:

				System.out.println("wednesday");

				break;

			case 4:

				System.out.println("thursday");

				break;

			case 5:

				System.out.println("friday");

				break;

			case 6:

				System.out.println("saturday");

				break;

			case 0:

				System.out.println("sunday");

				break;
			}
			t--;
		}
	}
}



