package firstJavaProject;

public class MultiplicationTable {

	void printMultiplicationTable(int table, int from, int to) {
		for (int i = from; i <= to; i++) {
			System.out.printf("%d * %d = %d", table, i, table * i).println();
		}

	}
}
