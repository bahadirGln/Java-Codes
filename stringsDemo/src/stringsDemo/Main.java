package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String message = "It's a beautiful day today.";
		System.out.println(message);
		
		System.out.println("Total number : "+message.length());
		System.out.println("6th character : "+message.charAt(5));
		System.out.println(message.concat(" Let's go outside!"));
		System.out.println(message.startsWith("i"));
		System.out.println(message.endsWith("."));
		char[] message1 = new char[6];
		message.getChars(0, 6, message1, 0);
		System.out.println(message1);
		System.out.println(message.indexOf("a"));
		System.out.println(message.lastIndexOf("a"));		
		
		System.out.println(message.replace(' ', '-'));
		System.out.println(message);
		String newMessage = message.replace(' ', '-');
		System.out.println(newMessage);
		System.out.println(message.substring(7,20));
		
		for(String message2 : message.split(" ")) {
			System.out.println(message2);
		}
		
		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());
		System.out.println(message.trim());
		
		
	}

}
