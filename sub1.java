import java.util.Scanner;

class CountSubarrays {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int testCaseCount = sc.nextInt();

		int length;

		int[] data = new int[100000];

		int answerFound = 1;

		int finalAnswer = 0;

		for (int i = 0; i < testCaseCount; i++) {

			length = sc.nextInt();

			//int[] data = new int[length];

			for (int j = 0; j < length; j++) {

				data[j] = sc.nextInt();

			}

			

			answerFound = 1;

			finalAnswer = 0;

			for (int j = 0; j < length - 1; j++, answerFound++) {

				if (data[j] > data[j + 1]) {

					finalAnswer += (answerFound * (answerFound + 1)) / 2;

					answerFound = 0;

				}

			}

			finalAnswer += (answerFound * (answerFound + 1)) / 2;

			System.out.println(finalAnswer);

		}

	}

}

