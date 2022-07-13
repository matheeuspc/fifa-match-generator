package br.com.mcardoso.fifamatchgenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class FifaMatchGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(FifaMatchGeneratorApplication.class, args);
	}

}
