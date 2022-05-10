public class Turnstile extends Thread {

	private Counter count = new Counter();
	private String str;

	Turnstile(String str) {
		this.str = str;
	}

	public void run() {
		int i = 1;

		while (i <= 100) {
			count.writeValue();
			System.out.println(str + "gate: " + i + "     total: " + count.readValue());
			i++;
			Thread.yield();
		}
	}

}
