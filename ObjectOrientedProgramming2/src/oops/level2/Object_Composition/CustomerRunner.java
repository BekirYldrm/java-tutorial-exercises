package oops.level2.Object_Composition;

public class CustomerRunner {
	public static void main(String[] args) {
		
		
		Adress homeAdress = new Adress("line1", "Istanbul","3400");
		
		Customer customer = new Customer("beko" ,homeAdress );
		
		
		Adress workAdress = new Adress ("line2" , "Malatya" , "4400");
		customer.setWorkAdress(workAdress);
		
		System.out.println(customer);
	}


}
