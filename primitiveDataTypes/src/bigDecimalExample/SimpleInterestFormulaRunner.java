package bigDecimalExample;

import java.math.BigDecimal;

public class SimpleInterestFormulaRunner {
	
	public static void main(String[] args) {
		
		SimpleInterestFormula calculator = new SimpleInterestFormula("4500.00" , "7.5"); // initial state values
		
		BigDecimal totalValue = calculator.calculateTotalValue(5);
		
		System.out.println(totalValue);
		
	}
	

	


}
