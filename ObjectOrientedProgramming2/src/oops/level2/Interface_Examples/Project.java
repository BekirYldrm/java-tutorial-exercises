package oops.level2.Interface_Examples;

public class Project {
	
	public static void main(String[] args) {
		
		ComplexAlgorithm algorithm = new RealAlgorithm();
		
		int result = algorithm.complexAlgorithm(8, 7);
		
		System.out.println(result);
		
	}

}
