package javaArrayExamples;

public class StringRunner {

	public static void main(String[] args) {
		
		String[] daysOfWeek = {"Sunday" , "Monday" , "Tuesday" , "Wednesday" , "Thursday" , "Friday" , "Saturday"};
		
		String str = "" ;
		
		for(String day : daysOfWeek) {
			if(day.length() > str.length()) {
				str = day;
			}
		}
		System.out.println(str);
		
		for(int i = daysOfWeek.length-1 ; i>=0 ; i--) {
			System.out.println(daysOfWeek[i]);
		}
		
	}

}
