public class Turnstile extends Thread {

	private Counter count;

	public void run() {
		int i = 0;
		count = new Counter();
		while (i < 10) {
			count.writeValue();
			System.out.println(count.readValue());
			i++;
		}
	}

}
