package api.f;

public class SwitchExpressionRunner {

	public static String findDayOfTheWeek(int day) {
		
		var dayOfWeek = "";
		
		switch (day) {
		case 0: dayOfWeek = "Sunday" ; break;
		case 1: dayOfWeek = "Monday" ; break;
		case 2: dayOfWeek = "Tuesday" ; break;
		case 3: dayOfWeek = "Wednesday" ; break;
		default: throw new IllegalArgumentException("İnvalid  option: " + day);
		
		}
		return dayOfWeek;
	}
	
	public static String findDayOfTheWeekWithSwitchExpression(int day) {
		
		var dayOfWeek = switch (day) {
		case 0->  {
			System.out.println("Do Some complex logic here");
			yield "Sunday" ; 
		}
		case 1-> "Monday" ; 
		case 2-> "Tuesday" ; 
		case 3-> "Wednesday" ;
		default-> throw new IllegalArgumentException("İnvalid  option: " + day);
		};
		
		return dayOfWeek;
	}
	
	
	public static void main(String[] args) {
		var x =SwitchExpressionRunner.findDayOfTheWeekWithSwitchExpression(0);
		System.out.println(x);
	}

}
