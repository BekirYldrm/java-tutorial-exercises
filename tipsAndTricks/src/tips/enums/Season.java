package tips.enums;

public enum Season {

	WINTER(10), SUMMER(20), FALL(30), SPRING(40);

	private int value;

	private Season(int value) {

		this.value = value;

	}

	public int getValue() {
		return value;
	}
}