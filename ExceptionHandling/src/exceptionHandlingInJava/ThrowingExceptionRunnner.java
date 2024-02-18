package exceptionHandlingInJava;

class Amount {
	
	private int amount;
	private String currency;
	
	public Amount(int amount, String currency) {
		super();
		this.amount = amount;
		this.currency = currency;
	}
	
	public void add(Amount that)  throws CurrenciesDoNotMatchException{
		
		if(!this.currency.equals(that.currency)) {
			
			//throw new Exception("Currencies Don`t Match " + this.currency + " & " + that.currency);
			
			throw new CurrenciesDoNotMatchException("Currencies Don`t Match " + this.currency + " & " + that.currency);
		}
		
		this.amount = this.amount + that.amount;
	}
	
	@Override
	public String toString() {
		return  amount + " " + currency;
	}
}

class CurrenciesDoNotMatchException extends Exception{
	
	public CurrenciesDoNotMatchException(String msg) {
		super(msg);
	}
	
}


public class ThrowingExceptionRunnner{

	public static void main(String[] args) throws CurrenciesDoNotMatchException {
		
		Amount amount1 = new Amount(10, "USD");
		Amount amount2 = new Amount(20, "EUR");
		
		amount1.add(amount2);
		
		System.out.println(amount1);
		
	

	}

}