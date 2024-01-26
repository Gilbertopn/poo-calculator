package com.mjv.curso;

import com.mjv.curso.util.UtilCalculator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrazyCalculatorSystemJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrazyCalculatorSystemJavaApplication.class, args);

		UtilCalculator utilCalculator = new UtilCalculator();
		utilCalculator.crazyCalculator();

	}

}
