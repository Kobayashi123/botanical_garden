public class Turnstile extends Thread {

	private Counter count = new Counter();
	private String gate_name;

	Turnstile(String str) {
		this.gate_name = str;
	}

	public void run() {
		int i = 1;

		while (i <= 25) {
			count.writeValue();
			System.out.println(gate_name + "gate: " + i + "     total: " + count.readValue());
			i++;
			Thread.yield();
		}
	}

}
