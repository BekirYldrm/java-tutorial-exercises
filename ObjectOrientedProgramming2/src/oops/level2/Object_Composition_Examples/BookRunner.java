package oops.level2.Object_Composition_Examples;

public class BookRunner {

	public static void main(String[] args) {
		
		Book book = new Book (123 , "Object Oriented Programming with Java" , "Bekir") ;
		
		book.addReview (new Review (10 , "Great Book" , 5));

		book.addReview (new Review (101 , "Awesome Book" , 4));
		
		System.out.println(book);   // ... , ... , .... , [ {} , {} , {}  , ..... ]
		

	}

}
