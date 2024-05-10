package perfectNumbers;

public class Main {

	public static void main(String[] args) {
		//6 -->1,2,3
		//28 -->1,2,4,7,14

		int number = 27;
		int total = 0;
		
		
		for(int i=1; i<number; i++) {
			if(number % i == 0) {
				total = total+i;				 
			}
		}

		boolean isPerfect = (total == number);
		
		if (isPerfect) {
			System.out.println("It's Perfect Number.");
		}else {
			System.out.println("It's not a Perfect Number.");
		}
	}

}
