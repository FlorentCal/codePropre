package ex2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Florent Callaou
 *	Format LocalDateTime to String
 */
public final class DateUtils {

	private static DateTimeFormatter dateFormatter;
	
	public static String format(LocalDateTime date, String pattern){	
		if(date == null || pattern == null){
			return null;
		}
		
		dateFormatter = DateTimeFormatter.ofPattern(pattern);	
		return date.format(dateFormatter);	
	}
}
