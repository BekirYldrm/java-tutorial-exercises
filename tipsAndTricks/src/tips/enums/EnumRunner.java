package tips.enums;

import java.time.DayOfWeek;
import java.util.Arrays;



public class EnumRunner {

	public static void main(String[] args) {
		
		DayOfWeek dayOfWeek = DayOfWeek.FRIDAY;
		
		System.out.println(Arrays.toString(DayOfWeek.values()));
		System.out.println( dayOfWeek);
		System.out.println("ordinal : " + dayOfWeek.ordinal());
		
		
		Season season = Season.FALL;
		
		System.out.println( season);
		System.out.println("ordinal : " + season.ordinal());
		System.out.println("value : " + season.getValue());
		
		
		Season season1 = Season.valueOf("WINTER");
		
		System.out.println(season1);
		System.out.println("ordinal : " + season1.ordinal());
		System.out.println("value : " + season1.getValue());
		
		System.out.println(Arrays.toString(Season.values()));
		
		

	}

}
