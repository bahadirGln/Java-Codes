package miniProjectPrimeNumber;

public class Main {

	public static void main(String[] args) {
		int number = 19;
		//int remainder = number % 2;
		//System.out.println(remainder);
		boolean isPrime = true;
		
		if(number==1) {
			System.out.println("The number is not prime.");
			return;
		}
		
		if(number<1) {
			System.out.println("invalid number.");
		}
		
		for(int i=2; i<number; i++) {
			if(number % i == 0) {
				isPrime = false;
			}
		}
		
		if(isPrime) {
			System.out.println("The number is prime.");
		}else {
			System.out.println("The number is not prime.");
		}
		

	}

}
