import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int n = scan.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = scan.nextInt();
		}

		int result = birthdayCandle(n, arr);

		System.out.println(result);

	}

	static int birthdayCandle(int n, int[] arr) {

		Arrays.sort(arr);

		int tallest = arr[n - 1];

		int count = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == tallest) {

				count++;
			}
		}

		return count;

	}

}

