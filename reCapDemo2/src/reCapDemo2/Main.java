package reCapDemo2;

public class Main {

	public static void main(String[] args) {
		double[] myList = { 1.2, 6.3, 4.3, 5.6 };

		double total = 0;
		double max = 0;
		for (double number : myList) {
			if (max < number) {
				max = number;
			}
			total = total + number;
			System.out.println(number);
		}

		System.out.println("Total = " + total);
		System.out.println("The biggest = " + max);

	}
}