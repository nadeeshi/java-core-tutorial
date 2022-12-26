package main.java.com.nadee.Test4.datatypes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * The Calendar class is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, 
 * and so on, and for manipulating the calendar fields, such as getting the date of the next week.
 * 
 * You are given a date. You just need to write the method, getDay, which returns the day on that date. 
 * To simplify your task, we have provided a portion of the code in the editor.
 * 
 * function Description
 * Complete the findDay function in the editor below.
 * findDay has the following parameters:
 * 	int: month
 * 	int: day
 * 	int: year
 * 
 * Returns
 * 	string: the day of the week in capital letters
 * 
 *Input Format
 *	A single line of input containing the space separated month, day and year, respectively, in MMDDYYYY format.
 *
 * @author Nadee
 *
 */
public class JavaCalenderClass {

	public static String findDay(int month, int day, int year) {
		// Creating a calendar object
		Calendar cal = new GregorianCalendar(year, (month - 1), day);
		
		// https://docs.oracle.com/javase/7/docs/api/java/util/Calendar.html
		// http://www.java2s.com/example/java-api/java/util/calendar/day_of_week-1.html
		String[] strDays = new String[] { "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY" };

		return strDays[cal.get(Calendar.DAY_OF_WEEK) - 1];
	}
	  
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int month = Integer.parseInt(firstMultipleInput[0]);

		int day = Integer.parseInt(firstMultipleInput[1]);

		int year = Integer.parseInt(firstMultipleInput[2]);

		String res = findDay(month, day, year);

//		bufferedWriter.write(res);
//		bufferedWriter.newLine();

		bufferedReader.close();
		//bufferedWriter.close();
		
		System.out.println(res);
	}

}
