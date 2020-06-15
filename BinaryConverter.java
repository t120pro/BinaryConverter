import java.util.Scanner;

public class BinaryConverter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter a binary number."); // user inputs a value
		long num = scanner.nextLong();
		long numCopy = num;

		boolean error = true;

		while (numCopy != 0L && error) { // checks if user entered a binary number
			if (numCopy % 10 == 0 || numCopy % 10 == 1) {
				numCopy /= 10;
			} else {
				System.out.println("The number entered isn't a binary number.");
				error = !error;
			}
		}

		if (error) { // calculates binary into decimal
			int placement = 1;
			int value = 0;
			while (num > 0) {
				if (num % 10 != 0) {
					value += placement;
				}
				num /= 10;
				placement *= 2;
			}
			System.out.println("The value of the number in decimal is " + value + ".");
		}
	}
}
