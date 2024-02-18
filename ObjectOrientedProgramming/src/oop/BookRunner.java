package oop;

public class BookRunner {
	public static void main(String[] args) {
		
		Book artOfComputerProgramming = new Book(152);
		Book effectiveJava = new Book(22);
		Book cleanCode = new Book(35);
		
		effectiveJava.setnoOfCopies(25);
		artOfComputerProgramming.setnoOfCopies(18);
		
		System.out.println(effectiveJava.getNoOfCopies());
		
		
	}

}
