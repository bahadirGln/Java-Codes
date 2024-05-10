package reCapDemo1;

public class Main {

	public static void main(String[] args) {
		int number1 = 20;
		int number2 = 25;
		int number3 = 3;
		
		int largestNumber = number1;
		
		if(largestNumber<number2) {
			largestNumber = number2;
		}
		
		if(largestNumber<number3) {
			largestNumber = number3;
		}
		
		System.out.println("Largest number = "+largestNumber);

	}

}
