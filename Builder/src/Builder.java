import java.util.Scanner;
public class Builder {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		StringBuilder a = new StringBuilder();
		System.out.println("Enter, \"Java is fun!\" ");
		String b = keyboard.nextLine();
		a.append(b)
		.append("I love it!");
		System.out.println("The capacity is: " + b.length());
		System.out.println("Enter, \"Yes\"");
		String c = keyboard.nextLine();
		a.insert(12, " " + c + ", ");
		System.out.println(a.toString());

	}

}
