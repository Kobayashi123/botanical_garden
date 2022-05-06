public class Garden {

	private static Counter count;

	private static Turnstile turnstile;

	public static void main(String[] args) {
		turnstile = new Turnstile();
		turnstile.run();
	}

}
