package api.g;

public class TextBlocksRunner {

	public static void main(String[] args) {

		String str = """
				Line1
					Line2
						Line3
							Line4
						Line5
					Line6
				Line7
				""";

		String textBlock = """
				Line1: %s
				Line2: %s
				Line3
				Line4
				Line5
				Line6""".formatted("Some Value", "Some Other Value");
		System.out.print(str);
		System.out.println(textBlock);
	}

}
