package multiDimensionalArrayDemo;

public class Main {

	public static void main(String[] args) {
		String[][] cities = new String[3][3];
		cities[0][0] = "Istanbul";
		cities[0][1] = "Antalya";
		cities[0][2] = "Izmir";
		cities[1][0] = "Warsaw";
		cities[1][1] = "Krakow";
		cities[1][2] = "Poznan";
		cities[2][0] = "Berlin";
		cities[2][1] = "Koln";
		cities[2][2] = "Munih";

		for (int i=0; i<=2; i++) {
			System.out.println("----------");
			for (int j=0; j<=2; j++) {
				System.out.println(cities[i][j]);
			}
		}

	}

}
