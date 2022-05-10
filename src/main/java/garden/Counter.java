public class Counter {

	private static int value = 0;

	public int readValue() {
		return value;
	}

	public void writeValue() {
		value += 1;
	}

}
