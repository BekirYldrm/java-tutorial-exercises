package tasks.task2;

import tasks.task1.Item;

public class ShoppingCart {
	

	public static void main(String[] args) {
		
		Item item1 = new Item("water", "Migros", 80, 35);
		Item item2 = new Item("milk", "CA", 65, 22);
		Item item3 = new Item("fruit juice", "TK", 21, 8);
		
		
		item1.increaseSalesPrice();
		Item.addItem(item1);
		Item.addItem(item2);
		
	
		System.out.println("Sepet : " +  Item.getItems());
		System.out.println("Sepetteki Ürünlerin Toplam Satis Fiyati :" +Item.getTotalSumItem());
		
		
		System.out.println(item1);
		System.out.println(item2);
		System.out.println(item3);
	

	}

}
