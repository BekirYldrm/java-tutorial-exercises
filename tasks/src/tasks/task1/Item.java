
package tasks.task1;

import java.util.ArrayList;
import java.util.List;

public class Item {

	
	//State
	private String productName;
	private String suppliers;
	private double salesPrice;
	private double purchasePrice;
	private static List<Item> items = new ArrayList<>();

	
	//Constructor
	public Item(String productName, String supplierName, double salesPrice, double purchasePrice) {
		this.productName = productName;
		this.suppliers = supplierName;
		this.salesPrice = salesPrice;
		this.purchasePrice = purchasePrice;
	}

	//Setter and Getter Methods
	
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getSupplierName() {
		return suppliers;
	}

	public void setSupplierName(String supplierName) {
		this.suppliers = supplierName;
	}

	public double getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(double salesPrice) {
		this.salesPrice = salesPrice;
	}

	public double getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	
	public static List<Item> getItems() {
		return items;
	}

	public static void setItems(List<Item> items) {
		Item.items = items;
	}
	
	
	//Behavior
	
	public void increaseSalesPrice() {

		salesPrice += salesPrice * 0.2;
	}

	public double earningsCalculation() {

		double earnings = salesPrice - purchasePrice;

		return earnings;

	}

	public static void addItem(Item object) {
		
		getItems().add(object);
		
	}
	
	public static double getTotalSumItem() {
		
		double sum = 0;
		for(Item element : Item.items) {
			sum += element.salesPrice;
		}
		return sum;
	}
	
	
	public String toString() {

		return String.format(
				"product name - %s , suppliers - %s , sales price - %f , purchase price - %f ,earnings - %f",
				productName, suppliers, salesPrice, purchasePrice,this.earningsCalculation()
				);

	}



}
