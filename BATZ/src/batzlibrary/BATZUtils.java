package batzlibrary;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class BATZUtils {

	// Returns the current date
	public LocalDate getCurrentDate() {
		LocalDate today = LocalDate.now();
		return today;
	}

	// Returns date 2 weeks from current
	public LocalDate getTwoWeeksDate(LocalDate today) {
		LocalDate twoWeeksAdd = today.plus(2, ChronoUnit.WEEKS);
		return twoWeeksAdd;
	}

	public LocalDate subtractDays(LocalDate today, int timetravel) {
		LocalDate subtract = today.minus(timetravel, ChronoUnit.DAYS);
		return subtract;
	}

	public boolean yesOrNo(String question) {
		String choice;
		boolean yonbool;
		System.out.println(question);
		Scanner scanp = new Scanner(System.in);
		while (true) {
			choice = scanp.nextLine();
			if (choice.equals("y") || choice.equals("Y") || choice.equals("yes")) {
				yonbool = true;
				break;
			} else if (choice.equals("n") || choice.equals("N") || choice.equals("no")) {
				yonbool = false;
				break;
			} else {
				System.out.println("Please enter a 'y' or an 'n'");
			}
		}
		return yonbool;
	}
}