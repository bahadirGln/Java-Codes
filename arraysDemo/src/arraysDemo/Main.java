package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String student1 = "Bahadir";
		String student2 = "Adam";
		String student3 = "Jane";
		String student4 = "Oliver";

		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println(student4);

		System.out.println("--------------//");

		String[] students = new String[4];
		students[0] = "Bahadir";
		students[1] = "Adam";
		students[2] = "Jane";
		students[3] = "Oliver";
		//students[4] = "Beth";
				
		for (int i=0; i<students.length;i++) {
			System.out.println(students[i]);
		}
		
		System.out.println("----Or----//");
		
		for(String Student:students) {
			System.out.println(Student);
		}

	}

}
