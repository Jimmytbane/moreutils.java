import java.util.Scanner;

class downcasethis {
    public static void main (String[] args) {
        System.out.println("---DOWNCASETHIS---");
        System.out.print("Enter the string you would like to downcase  --> ");
    	Scanner scan = new Scanner(System.in);
		// String s = scan.next();
		String input = scan.nextLine();
		scan.close();
		input = input.toLowerCase();
		System.out.printf("Your downcased string  --> %s%n", input);
    }
}
