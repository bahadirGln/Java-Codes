package findingNumbers;

public class Main {

	public static void main(String[] args) {

		int[] numbers = new int[] {1,2,5,7,9,0};
		int selectedNumber = 5;
		
		boolean isThere = false;
		
		for(int number : numbers) {
			if(number==selectedNumber) {
				isThere = true;
				break;
			}
		}
		
		if(isThere) {
			System.out.println("The number is available.");
		}else {
			System.out.println("The number is not available");
		}
		
	}
}