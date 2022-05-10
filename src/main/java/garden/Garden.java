import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class Garden {

	public static void main(String[] args) {
		ExecutorService execs = Executors.newFixedThreadPool(2);
		for (int i = 0; i < 2; i++) {
			if (i == 0) {
				execs.submit(new Turnstile("North"));
			} else {
				execs.submit(new Turnstile("South"));
			}
		}
		execs.shutdown();
	}

}
