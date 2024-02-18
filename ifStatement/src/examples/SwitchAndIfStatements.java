package examples;

import java.util.Scanner;

public class SwitchAndIfStatements {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Day choice: ");
		int dayNumber = scan.nextInt();

		System.out.println("Month choice: ");
		int monthNumber = scan.nextInt();

		if (isWeekDay(dayNumber)) {
			System.out.println("Hafta ici");
		} else {
			System.out.println("Hafta Sonu");
		}

		System.out.println(determineNameOfMonth(monthNumber));

		System.out.println(determineNameOfDay(dayNumber));

	}

	public static String determineNameOfMonth(int monthNumber) {
		
		switch (monthNumber) {
		case 1:
			return "Ocak";
		case 2:
			return "Şubat";
		case 3:
			return "Mart";
		case 4:
			return "Nisan";
		case 5:
			return "Mayıs";
		case 6:
			return "Haziran";
		case 7:
			return "temmuz";
		case 8:
			return "agustos";
		case 9:
			return "eylul";
		case 10:
			return "ekim";
		case 11:
			return "kasım";
		case 12:
			return "aralık";
		default:
			return "Invalid Month Number";
		}
	}

	public static String determineNameOfDay(int dayNumber) {
		
		switch (dayNumber) {
		case 1:
			return "Pazartesi";
		case 2:
			return "salı";
		case 3:
			return "carsamba";
		case 4:
			return "persembe";
		case 5:
			return "cuma";
		case 6:
			return "cumartesi";
		case 0:
			return "pazar";
		default:
			return "Invalid Day Number";
		}
	}

	public static boolean isWeekDay(int dayNumber) {
		
		if (dayNumber > 0 && dayNumber < 6) {
			return true;
		}
		return false;
	}

}
