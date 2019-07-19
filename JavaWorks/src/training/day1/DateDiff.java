package training.day1;
/**
 * 
 * @author saiwadeg
 *@since July 2019
 */

import java.util.Calendar;
import java.util.Date;

public class DateDiff {
	/**
	 * @param args
	 * @see this method is the entry point
	 */
	public static void main(String[] args) {
		@SuppressWarnings("deprecation")
		//Calendar startDate = Calendar.set(2019,1,1);
		//startDate.set(2019,1,1);
		
		//System.out.println(startDate);
		Calendar rightNow = Calendar.getInstance();
		System.out.println(rightNow);
		System.out.println(rightNow.getTime());
	}
}
