package scannerClass;

import java.util.Scanner;

public class MenuRunner {


	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.printf("Enter Number1: ");

		int number1 = scanner.nextInt();

		System.out.printf("Enter Number2: ");

		int number2 = scanner.nextInt();

		Menu menu = new Menu(number1, number2);

		System.out.println("1 - Add");
		System.out.println("2 - Substract");
		System.out.println("3 - Divide");
		System.out.println("4 - Multiply");
		System.out.printf("Enter Choice: ");

		int choice = scanner.nextInt();

		System.out.printf("Result - ");

		 //usingIfElse(menu, choice);

		usingSwitchStatement(menu, choice);

	}

	private static void usingSwitchStatement(Menu menu, int choice) {
		switch (choice) {
		case 1: {
			System.out.println(menu.add());
			break;
		}
		case 2: {
			System.out.println(menu.substract());
			break;
		}
		case 3: {
			System.out.println(menu.divide());
			break;
		}
		case 4: {
			System.out.println(menu.multiply());
			break;
		}
		default:
			System.out.println("Invalid Operation");
		}
	}

	private static void usingIfElse(Menu menu, int choice) {
		if (choice == 1) {
			System.out.println(menu.add());
		} else if (choice == 2) {
			System.out.println(menu.substract());
		} else if (choice == 3) {
			System.out.println(menu.divide());
		} else if (choice == 4) {
			System.out.println(menu.multiply());
		} else {
			System.out.println("Invalid Operation");

		}
	}

}
