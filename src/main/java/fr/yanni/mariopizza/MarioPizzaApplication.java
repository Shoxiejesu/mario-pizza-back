package fr.yanni.mariopizza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "fr.yanni.mariopizza")
public class MarioPizzaApplication {

	/**
	 * launch point for the app.
	 *
	 * @param args arguments
	 */
	public static void main(final String[] args) {
		SpringApplication.run(MarioPizzaApplication.class, args);
	}

}
