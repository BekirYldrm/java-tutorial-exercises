package bigDecimalExample;

import java.math.BigDecimal;

public class SimpleInterestFormula {
	
	private BigDecimal principal ;   // member variable 
	private BigDecimal interest; 	// member variable
	
	
	public SimpleInterestFormula(String principal, String interest) { 	// constructor method for initial state
		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
	}

	public BigDecimal calculateTotalValue(int noOfYears) {  // Return value of type BigDecimal
		
		BigDecimal totalValue =  principal.add(
				
				principal.multiply(interest).multiply( new BigDecimal(noOfYears))
				);
		
		return totalValue ;
		
	}
}
